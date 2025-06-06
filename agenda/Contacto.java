public class Contacto {
    private String nombre;
    private Telefono telefono;
    private Correo email;
    private Direccion direccion;
    private FechaDeNacimiento fechaDeNacimiento;

    public Contacto(String nombre, Telefono telefono, Correo email, Direccion direccion, FechaDeNacimiento fechaDeNacimiento) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Correo getEmail() {
        return email;
    }

    public void setEmail(Correo email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public FechaDeNacimiento getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(FechaDeNacimiento fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void mostrarContacto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono.getNumero());
        System.out.println("Email: " + email.getDireccionCorreo());
        System.out.println("Dirección: " + direccion.getCalle() + ", " + direccion.getCiudad() + ", " + direccion.getPais());
        System.out.println("Fecha de nacimiento: " + fechaDeNacimiento.getAnio());
        System.out.println("------");
    }
}