import java.time.LocalDate;
import java.time.LocalTime;

public class Asignacion {
    private String codigo;
    private Instructor instructor;
    private Ambiente ambiente;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String jornada;
    private String actividad;
    private String observaciones;
    
    // Constructor
    public Asignacion(String codigo, Instructor instructor, Ambiente ambiente,
                     LocalDate fecha, LocalTime horaInicio, LocalTime horaFin,
                     String jornada, String actividad) {
        this.codigo = codigo;
        this.instructor = instructor;
        this.ambiente = ambiente;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.jornada = jornada;
        this.actividad = actividad;
        this.observaciones = "";
    }
    
    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    
    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }
    
    public Ambiente getAmbiente() { return ambiente; }
    public void setAmbiente(Ambiente ambiente) { this.ambiente = ambiente; }
    
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    
    public LocalTime getHoraInicio() { return horaInicio; }
    public void setHoraInicio(LocalTime horaInicio) { this.horaInicio = horaInicio; }
    
    public LocalTime getHoraFin() { return horaFin; }
    public void setHoraFin(LocalTime horaFin) { this.horaFin = horaFin; }
    
    public String getJornada() { return jornada; }
    public void setJornada(String jornada) { this.jornada = jornada; }
    
    public String getActividad() { return actividad; }
    public void setActividad(String actividad) { this.actividad = actividad; }
    
    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
    
    @Override
    public String toString() {
        return "Asignacion{" +
                "codigo='" + codigo + '\'' +
                ", instructor=" + instructor.getNombre() + " " + instructor.getApellido() +
                ", ambiente=" + ambiente.getNombre() +
                ", fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", jornada='" + jornada + '\'' +
                ", actividad='" + actividad + '\'' +
                '}';
    }
}