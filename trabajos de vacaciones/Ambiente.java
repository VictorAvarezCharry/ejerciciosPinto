public class Ambiente {
    private String codigo;
    private String nombre;
    private String ubicacion;
    private int capacidad;
    private boolean especializado;
    private String descripcion;
    private boolean disponible;
    
    // Constructor
    public Ambiente(String codigo, String nombre, String ubicacion, int capacidad, 
                   boolean especializado, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.especializado = especializado;
        this.descripcion = descripcion;
        this.disponible = true;
    }
    
    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
    
    public boolean isEspecializado() { return especializado; }
    public void setEspecializado(boolean especializado) { this.especializado = especializado; }
    
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    
    @Override
    public String toString() {
        return "Ambiente{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidad=" + capacidad +
                ", especializado=" + especializado +
                ", disponible=" + disponible +
                '}';
    }
}