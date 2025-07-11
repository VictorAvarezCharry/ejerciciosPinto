public class Instructor {
    private String codigo;
    private String nombre;
    private String apellido;
    private String documento;
    private String email;
    private String telefono;
    private String especialidad;
    private String programaFormacion;
    private boolean disponible;
    
    // Constructor
    public Instructor(String codigo, String nombre, String apellido, String documento,
                     String email, String telefono, String especialidad, String programaFormacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.programaFormacion = programaFormacion;
        this.disponible = true;
    }
    
    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    
    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    
    public String getProgramaFormacion() { return programaFormacion; }
    public void setProgramaFormacion(String programaFormacion) { this.programaFormacion = programaFormacion; }
    
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    
    @Override
    public String toString() {
        return "Instructor{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento='" + documento + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", programaFormacion='" + programaFormacion + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}