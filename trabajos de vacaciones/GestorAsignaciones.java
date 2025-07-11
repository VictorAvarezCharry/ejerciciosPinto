import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class GestorAsignaciones {
    private List<Asignacion> asignaciones;
    private GestorInstructores gestorInstructores;
    private GestorAmbientes gestorAmbientes;
    
    public GestorAsignaciones(GestorInstructores gestorInstructores, GestorAmbientes gestorAmbientes) {
        this.asignaciones = new ArrayList<>();
        this.gestorInstructores = gestorInstructores;
        this.gestorAmbientes = gestorAmbientes;
    }
    
    // RF9: Asignar instructor a ambiente con horario
    public boolean crearAsignacion(String codigoInstructor, String codigoAmbiente,
                                 LocalDate fecha, LocalTime horaInicio, LocalTime horaFin,
                                 String jornada, String actividad) {
        
        Instructor instructor = gestorInstructores.buscarInstructorPorCodigo(codigoInstructor);
        Ambiente ambiente = gestorAmbientes.buscarAmbientePorCodigo(codigoAmbiente);
        
        if (instructor == null) {
            System.out.println("Error: Instructor no encontrado");
            return false;
        }
        
        if (ambiente == null) {
            System.out.println("Error: Ambiente no encontrado");
            return false;
        }
        
        // RNF1: Validar que instructor no esté asignado a más de una línea
        if (verificarConflictoInstructor(instructor, fecha, horaInicio, horaFin)) {
            System.out.println("Error: El instructor ya tiene una asignación en ese horario");
            return false;
        }
        
        // RNF2: Validar que ambiente no esté asignado a más de un instructor
        if (verificarConflictoAmbiente(ambiente, fecha, horaInicio, horaFin)) {
            System.out.println("Error: El ambiente ya está asignado en ese horario");
            return false;
        }
        
        // RNF3: Validar que no se asigne más de una hora a un instructor
        if (verificarLimiteHorasInstructor(instructor, fecha)) {
            System.out.println("Error: El instructor no puede estar en más de una línea o programa de formación");
            return false;
        }
        
        String codigoAsignacion = generarCodigoAsignacion();
        Asignacion asignacion = new Asignacion(codigoAsignacion, instructor, ambiente,
                                             fecha, horaInicio, horaFin, jornada, actividad);
        
        asignaciones.add(asignacion);
        System.out.println("Asignación creada exitosamente: " + codigoAsignacion);
        return true;
    }
    
    // RNF1: Verificar conflicto de instructor
    private boolean verificarConflictoInstructor(Instructor instructor, LocalDate fecha,
                                                LocalTime horaInicio, LocalTime horaFin) {
        return asignaciones.stream()
                .anyMatch(asignacion -> 
                    asignacion.getInstructor().equals(instructor) &&
                    asignacion.getFecha().equals(fecha) &&
                    hayConflictoHorario(asignacion.getHoraInicio(), asignacion.getHoraFin(),
                                       horaInicio, horaFin));
    }
    
    // RNF2: Verificar conflicto de ambiente
    private boolean verificarConflictoAmbiente(Ambiente ambiente, LocalDate fecha,
                                             LocalTime horaInicio, LocalTime horaFin) {
        return asignaciones.stream()
                .anyMatch(asignacion -> 
                    asignacion.getAmbiente().equals(ambiente) &&
                    asignacion.getFecha().equals(fecha) &&
                    hayConflictoHorario(asignacion.getHoraInicio(), asignacion.getHoraFin(),
                                       horaInicio, horaFin));
    }
    
    // RNF3: Verificar límite de horas por instructor
    private boolean verificarLimiteHorasInstructor(Instructor instructor, LocalDate fecha) {
        return asignaciones.stream()
                .anyMatch(asignacion -> 
                    asignacion.getInstructor().equals(instructor) &&
                    asignacion.getFecha().equals(fecha));
    }
    
    // RNF4: Verificar que el aprendiz no puede estar en más de dos jornadas
    public boolean verificarLimiteJornadasAprendiz(String codigoAprendiz, LocalDate fecha) {
        // Esta funcionalidad se implementaría con una clase Aprendiz
        return false; // Placeholder
    }
    
    // RNF5: Verificar que el aprendiz no puede estar en más de dos jornadas
    public boolean verificarLimiteJornadasAprendizDos(String codigoAprendiz, LocalDate fecha) {
        // Esta funcionalidad se implementaría con una clase Aprendiz
        return false; // Placeholder
    }
    
    // Método auxiliar para verificar conflicto de horarios
    private boolean hayConflictoHorario(LocalTime inicio1, LocalTime fin1,
                                       LocalTime inicio2, LocalTime fin2) {
        return inicio1.isBefore(fin2) && inicio2.isBefore(fin1);
    }
    
    // Generar código único para asignación
    private String generarCodigoAsignacion() {
        return "ASG-" + System.currentTimeMillis();
    }
    
    // Listar asignaciones por instructor
    public List<Asignacion> listarAsignacionesPorInstructor(String codigoInstructor) {
        return asignaciones.stream()
                .filter(asignacion -> asignacion.getInstructor().getCodigo().equals(codigoInstructor))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
    
    // Listar asignaciones por ambiente
    public List<Asignacion> listarAsignacionesPorAmbiente(String codigoAmbiente) {
        return asignaciones.stream()
                .filter(asignacion -> asignacion.getAmbiente().getCodigo().equals(codigoAmbiente))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
    
    // Listar asignaciones por fecha
    public List<Asignacion> listarAsignacionesPorFecha(LocalDate fecha) {
        return asignaciones.stream()
                .filter(asignacion -> asignacion.getFecha().equals(fecha))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
    
    // Generar reporte de asignaciones
    public void generarReporte() {
        System.out.println("\n=== REPORTE DE ASIGNACIONES ===");
        System.out.println("Total de asignaciones: " + asignaciones.size());
        
        for (Asignacion asignacion : asignaciones) {
            System.out.println("\n" + asignacion);
        }
    }
}