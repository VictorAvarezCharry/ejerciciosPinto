import java.util.*;

public class GestorInstructores {
    private List<Instructor> instructores;
    
    public GestorInstructores() {
        this.instructores = new ArrayList<>();
    }
    
    // RF1: Registrar instructor
    public boolean registrarInstructor(Instructor instructor) {
        if (buscarInstructorPorCodigo(instructor.getCodigo()) != null) {
            System.out.println("Error: Ya existe un instructor con el código " + instructor.getCodigo());
            return false;
        }
        if (buscarInstructorPorDocumento(instructor.getDocumento()) != null) {
            System.out.println("Error: Ya existe un instructor con el documento " + instructor.getDocumento());
            return false;
        }
        instructores.add(instructor);
        System.out.println("Instructor registrado exitosamente: " + instructor.getNombre() + " " + instructor.getApellido());
        return true;
    }
    
    // RF7: Buscar instructor por código
    public Instructor buscarInstructorPorCodigo(String codigo) {
        return instructores.stream()
                .filter(instructor -> instructor.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }
    
    // Buscar instructor por documento
    public Instructor buscarInstructorPorDocumento(String documento) {
        return instructores.stream()
                .filter(instructor -> instructor.getDocumento().equals(documento))
                .findFirst()
                .orElse(null);
    }
    
    // RF8: Asignar instructor a ambiente
    public boolean asignarInstructor(String codigoInstructor, String codigoAmbiente) {
        Instructor instructor = buscarInstructorPorCodigo(codigoInstructor);
        if (instructor == null) {
            System.out.println("Error: Instructor no encontrado");
            return false;
        }
        if (!instructor.isDisponible()) {
            System.out.println("Error: El instructor no está disponible");
            return false;
        }
        System.out.println("Instructor " + instructor.getNombre() + " asignado al ambiente " + codigoAmbiente);
        return true;
    }
    
    // Listar todos los instructores
    public List<Instructor> listarInstructores() {
        return new ArrayList<>(instructores);
    }
    
    // Listar instructores disponibles
    public List<Instructor> listarInstructoresDisponibles() {
        return instructores.stream()
                .filter(Instructor::isDisponible)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}