public class Vehiculo {
    int id;
    String tipo;
    Conductor conductor;


    public Vehiculo(int id, String tipo, Conductor conductor) {
        this.id = id;
        this.tipo = tipo;
        this.conductor = conductor;
    }

    //* vehiculo funebre */
    public Vehiculo(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
        this.conductor = null;
    }

    public void asignarConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}