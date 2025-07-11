import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class index {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GestorInstructores gestorInstructores = new GestorInstructores();
        GestorAmbientes gestorAmbientes = new GestorAmbientes();
        GestorAsignaciones gestorAsignaciones = new GestorAsignaciones(gestorInstructores, gestorAmbientes);

        int opcion;

        do {
            System.out.println(" MENÚ DE GESTIÓN");
            System.out.println("1. Registrar instructor");
            System.out.println("2. Registrar ambiente");
            System.out.println("3. Crear asignación");
            System.out.println("4. Listar instructores");
            System.out.println("5. Listar ambientes");
            System.out.println("6. Generar reporte de asignaciones");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                switch (opcion) {
                    case 1 -> registrarInstructor(gestorInstructores);
                    case 2 -> registrarAmbiente(gestorAmbientes);
                    case 3 -> crearAsignacion(gestorAsignaciones);
                    case 4 -> listarInstructores(gestorInstructores);
                    case 5 -> listarAmbientes(gestorAmbientes);
                    case 6 -> gestorAsignaciones.generarReporte();
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no válida.");
                }
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                sc.nextLine(); // limpiar buffer
                opcion = -1;
            }

        } while (opcion != 0);

        sc.close();
    }

    private static void registrarInstructor(GestorInstructores gestor) {
        System.out.print("Código: ");
        String codigoInstructor = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Documento: ");
        String documento = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        System.out.print("Especialidad: ");
        String especialidad = sc.nextLine();
        System.out.print("Programa de Formación: ");
        String programa = sc.nextLine();

        Instructor nuevoInstructor = new Instructor(
                codigoInstructor,
                nombre,
                apellido,
                documento,
                email,
                telefono,
                especialidad,
                programa
        );
        gestor.registrarInstructor(nuevoInstructor);
    }

    private static void registrarAmbiente(GestorAmbientes gestor) {
        System.out.print("Código: ");
        String codigoAmbiente = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ubicación: ");
        String ubicacion = sc.nextLine();

        int capacidad;
        try {
            System.out.print("Capacidad: ");
            capacidad = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número entero para la capacidad.");
            sc.nextLine();
            return;
        }
        sc.nextLine();

        System.out.print("¿Es especializado? (true/false): ");
        boolean especializado;
        try {
            especializado = sc.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar true o false.");
            sc.nextLine();
            return;
        }
        sc.nextLine();

        System.out.print("Descripción: ");
        String descripcion = sc.nextLine();

        Ambiente nuevoAmbiente = new Ambiente(
                codigoAmbiente,
                nombre,
                ubicacion,
                capacidad,
                especializado,
                descripcion
        );
        gestor.registrarAmbiente(nuevoAmbiente);
    }

    private static void crearAsignacion(GestorAsignaciones gestor) {
        System.out.print("Código Instructor: ");
        String codigoInstructor = sc.nextLine();
        System.out.print("Código Ambiente: ");
        String codigoAmbiente = sc.nextLine();

        System.out.print("Fecha (AAAA-MM-DD): ");
        LocalDate fecha;
        try {
            fecha = LocalDate.parse(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Formato inválido. Use AAAA-MM-DD.");
            return;
        }

        System.out.print("Hora inicio (HH:MM): ");
        LocalTime horaInicio;
        try {
            horaInicio = LocalTime.parse(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Formato inválido. Use HH:MM.");
            return;
        }

        System.out.print("Hora fin (HH:MM): ");
        LocalTime horaFin;
        try {
            horaFin = LocalTime.parse(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Formato inválido. Use HH:MM.");
            return;
        }

        System.out.print("Jornada: ");
        String jornada = sc.nextLine();
        System.out.print("Actividad: ");
        String actividad = sc.nextLine();

        gestor.crearAsignacion(codigoInstructor, codigoAmbiente, fecha, horaInicio, horaFin, jornada, actividad);
    }

    private static void listarInstructores(GestorInstructores gestor) {
        System.out.println("\n=== LISTADO DE INSTRUCTORES ===");
        List<Instructor> instructores = gestor.listarInstructores();
        if (instructores.isEmpty()) {
            System.out.println("No hay instructores registrados.");
        } else {
            for (Instructor i : instructores) {
                System.out.println(i);
            }
        }
    }

    private static void listarAmbientes(GestorAmbientes gestor) {
        System.out.println("\n=== LISTADO DE AMBIENTES ===");
        List<Ambiente> ambientes = gestor.listarAmbientes();
        if (ambientes.isEmpty()) {
            System.out.println("No hay ambientes registrados.");
        } else {
            for (Ambiente a : ambientes) {
                System.out.println(a);
            }
        }
    }
}

class Instructor {
    private String codigo;
    private String nombre;
    private String apellido;
    private String documento;
    private String email;
    private String telefono;
    private String especialidad;
    private String programa;

    public Instructor(String codigo, String nombre, String apellido, String documento, String email, String telefono, String especialidad, String programa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.programa = programa;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " " + apellido + " (" + especialidad + ")";
    }
}

class GestorInstructores {
    private List<Instructor> lista = new ArrayList<>();

    public void registrarInstructor(Instructor instructor) {
        lista.add(instructor);
        System.out.println("Instructor registrado.");
    }

    public List<Instructor> listarInstructores() {
        return lista;
    }

    public Instructor buscarPorCodigo(String codigo) {
        for (Instructor i : lista) {
            if (i.getCodigo().equalsIgnoreCase(codigo)) {
                return i;
            }
        }
        return null;
    }
}

class Ambiente {
    private String codigo;
    private String nombre;
    private String ubicacion;
    private int capacidad;
    private boolean especializado;
    private String descripcion;

    public Ambiente(String codigo, String nombre, String ubicacion, int capacidad, boolean especializado, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.especializado = especializado;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " (" + ubicacion + ")";
    }
}

class GestorAmbientes {
    private List<Ambiente> lista = new ArrayList<>();

    public void registrarAmbiente(Ambiente ambiente) {
        lista.add(ambiente);
        System.out.println("Ambiente registrado.");
    }

    public List<Ambiente> listarAmbientes() {
        return lista;
    }

    public Ambiente buscarPorCodigo(String codigo) {
        for (Ambiente a : lista) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                return a;
            }
        }
        return null;
    }
}

class Asignacion {
    private Instructor instructor;
    private Ambiente ambiente;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String jornada;
    private String actividad;

    public Asignacion(Instructor instructor, Ambiente ambiente, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, String jornada, String actividad) {
        this.instructor = instructor;
        this.ambiente = ambiente;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.jornada = jornada;
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "Instructor: " + instructor +
               "\nAmbiente: " + ambiente +
               "\nFecha: " + fecha +
               "\nHora: " + horaInicio + " - " + horaFin +
               "\nJornada: " + jornada +
               "\nActividad: " + actividad + "\n";
    }
}

class GestorAsignaciones {
    private List<Asignacion> asignaciones = new ArrayList<>();
    private GestorInstructores gestorInstructores;
    private GestorAmbientes gestorAmbientes;

    public GestorAsignaciones(GestorInstructores gi, GestorAmbientes ga) {
        this.gestorInstructores = gi;
        this.gestorAmbientes = ga;
    }

    public void crearAsignacion(String codigoInstructor, String codigoAmbiente, LocalDate fecha, LocalTime inicio, LocalTime fin, String jornada, String actividad) {
        Instructor instructor = gestorInstructores.buscarPorCodigo(codigoInstructor);
        Ambiente ambiente = gestorAmbientes.buscarPorCodigo(codigoAmbiente);

        if (instructor == null) {
            System.out.println("Instructor no encontrado con código: " + codigoInstructor);
            return;
        }
        if (ambiente == null) {
            System.out.println("Ambiente no encontrado con código: " + codigoAmbiente);
            return;
        }

        Asignacion asignacion = new Asignacion(instructor, ambiente, fecha, inicio, fin, jornada, actividad);
        asignaciones.add(asignacion);
        System.out.println("Asignación creada.");
    }

    public void generarReporte() {
        System.out.println("REPORTE DE ASIGNACIONES ");
        if (asignaciones.isEmpty()) {
            System.out.println("No hay asignaciones registradas.");
        } else {
            for (Asignacion a : asignaciones) {
                System.out.println(a);
            }
        }
    }
}
