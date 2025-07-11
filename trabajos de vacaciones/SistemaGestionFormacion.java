import java.time.LocalDate;
import java.time.LocalTime;

public class SistemaGestionFormacion {
    public static void main(String[] args) {
        // Inicializar gestores
        GestorInstructores gestorInstructores = new GestorInstructores();
        GestorAmbientes gestorAmbientes = new GestorAmbientes();
        GestorAsignaciones gestorAsignaciones = new GestorAsignaciones(gestorInstructores, gestorAmbientes);
        
        // Registrar algunos instructores
        Instructor instructor1 = new Instructor("INS001", "Juan", "Pérez", "12345678",
                                               "juan.perez@sena.edu.co", "3001234567",
                                               "Programación", "Análisis y Desarrollo de Software");
        
        Instructor instructor2 = new Instructor("INS002", "María", "González", "87654321",
                                               "maria.gonzalez@sena.edu.co", "3009876543",
                                               "Redes", "Redes y Telecomunicaciones");
        
        gestorInstructores.registrarInstructor(instructor1);
        gestorInstructores.registrarInstructor(instructor2);
        
        // Registrar algunos ambientes
        Ambiente ambiente1 = new Ambiente("AMB001", "Laboratorio de Sistemas", "Bloque A-101",
                                         25, true, "Laboratorio especializado en programación");
        
        Ambiente ambiente2 = new Ambiente("AMB002", "Aula de Redes", "Bloque B-201",
                                         20, true, "Aula especializada en infraestructura de redes");
        
        gestorAmbientes.registrarAmbiente(ambiente1);
        gestorAmbientes.registrarAmbiente(ambiente2);
        
        // Crear algunas asignaciones
        gestorAsignaciones.crearAsignacion("INS001", "AMB001",
                                         LocalDate.now(), LocalTime.of(8, 0), LocalTime.of(12, 0),
                                         "Mañana", "Programación en Java");
        
        gestorAsignaciones.crearAsignacion("INS002", "AMB002",
                                         LocalDate.now(), LocalTime.of(14, 0), LocalTime.of(18, 0),
                                         "Tarde", "Configuración de Redes");
        
        // Generar reporte
        gestorAsignaciones.generarReporte();
        
        // Listar instructores
        System.out.println("\n=== LISTADO DE INSTRUCTORES ===");
        for (Instructor instructor : gestorInstructores.listarInstructores()) {
            System.out.println(instructor);
        }
        
        // Listar ambientes
        System.out.println("\n=== LISTADO DE AMBIENTES ===");
        for (Ambiente ambiente : gestorAmbientes.listarAmbientes()) {
            System.out.println(ambiente);
        }
    }
}