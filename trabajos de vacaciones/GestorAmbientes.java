import java.util.*;

public class GestorAmbientes {
    private List<Ambiente> ambientes;
    
    public GestorAmbientes() {
        this.ambientes = new ArrayList<>();
    }
    
    // RF2: Registrar ambiente
    public boolean registrarAmbiente(Ambiente ambiente) {
        if (buscarAmbientePorCodigo(ambiente.getCodigo()) != null) {
            System.out.println("Error: Ya existe un ambiente con el código " + ambiente.getCodigo());
            return false;
        }
        ambientes.add(ambiente);
        System.out.println("Ambiente registrado exitosamente: " + ambiente.getNombre());
        return true;
    }
    
    // RF3: Buscar ambiente por código
    public Ambiente buscarAmbientePorCodigo(String codigo) {
        return ambientes.stream()
                .filter(ambiente -> ambiente.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }
    
    // RF4: Identificar si ambiente es especializado
    public boolean esAmbienteEspecializado(String codigo) {
        Ambiente ambiente = buscarAmbientePorCodigo(codigo);
        return ambiente != null && ambiente.isEspecializado();
    }
    
    // RF5: Verificar cantidad de aprendices en ambiente
    public boolean verificarCapacidadAmbiente(String codigo, int numeroAprendices) {
        Ambiente ambiente = buscarAmbientePorCodigo(codigo);
        if (ambiente == null) {
            System.out.println("Error: Ambiente no encontrado");
            return false;
        }
        return ambiente.getCapacidad() >= numeroAprendices;
    }
    
    // Listar todos los ambientes
    public List<Ambiente> listarAmbientes() {
        return new ArrayList<>(ambientes);
    }
    
    // Listar ambientes disponibles
    public List<Ambiente> listarAmbientesDisponibles() {
        return ambientes.stream()
                .filter(Ambiente::isDisponible)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
    
    // Listar ambientes especializados
    public List<Ambiente> listarAmbientesEspecializados() {
        return ambientes.stream()
                .filter(Ambiente::isEspecializado)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}