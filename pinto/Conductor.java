public class Conductor extends Persona {
    int id;

    public Conductor(int id, String nombre, String apellido, String telefono, String cedula) {
        super(nombre, apellido, telefono, cedula);
        this.id = id;
    }
}