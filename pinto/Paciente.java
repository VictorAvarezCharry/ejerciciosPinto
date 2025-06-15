public class Paciente extends Persona {
    boolean fallecido;

    public Paciente(String nombre, String apellido, String cedula, String telefono ,boolean fallecido) {
        super(nombre, apellido, telefono,cedula);
        this.fallecido = fallecido;
    }
}