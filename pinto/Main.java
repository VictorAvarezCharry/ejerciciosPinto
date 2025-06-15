import java.util.Scanner;

public class Main {
    static Vehiculo[] ambulancias = new Vehiculo[10];
    static Vehiculo carroFunebre = new Vehiculo(1, "funebre");
    static Conductor[] conductores = new Conductor[10];
    static Paciente[] pacientes = new Paciente[100];
    static int contadorConductores = 0;
    static int contadorPacientes = 0;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarAmbulancias();
        int opcion;
        do {
            System.out.println("\nMENU DE EMERGENCIA");
            System.out.println("1. Registrar conductor");
            System.out.println("2. Registrar paciente");
            System.out.println("3. Asignar conductores a ambulancias");
            System.out.println("4. Asignar pacientes a ambulancias");
            System.out.println("5. Asignar conductor al carro funebre");
            System.out.println("6. Generar reportes");
            System.out.println("0. Salir");
            System.out.print("Seleccione opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    registrarConductor();
                    break;
                case 2:
                    registrarPaciente();
                    break;
                case 3:
                    asignar.asignarConductores(ambulancias, conductores);
                    break;
                case 4:
                    asignar.asignarPacientes(ambulancias, pacientes);
                    break;
                case 5:
                    asignar.asignarCarroFunebre(carroFunebre, conductores);
                    break;
                case 6:
                    asignar.generarReportes(ambulancias, carroFunebre, pacientes);
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    static void inicializarAmbulancias() {
        int numeroAmbulancia = 1;
        for (int i = 0; i < ambulancias.length; i++) {
            ambulancias[i] = new Vehiculo(numeroAmbulancia++, "ambulancia");
        }
    }

    static void registrarConductor() {
        if (contadorConductores >= conductores.length) {
            System.out.println("No se pueden registrar más conductores. Límite alcanzado.");
            return;
        }

        System.out.println("Registro de nuevo conductor:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();

        conductores[contadorConductores] = new Conductor(
            contadorConductores + 1,
            nombre,
            apellido,
            telefono,
            cedula
        );
        contadorConductores++;
        System.out.println("Conductor registrado exitosamente.");
    }

    static void registrarPaciente() {
        if (contadorPacientes >= pacientes.length) {
            System.out.println("No se pueden registrar más pacientes. Límite alcanzado.");
            return;
        }

        System.out.println("Registro de nuevo paciente:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("¿Está fallecido? (s/n): ");
        boolean fallecido = scanner.nextLine().equalsIgnoreCase("s");

        pacientes[contadorPacientes] = new Paciente(
            nombre,
            apellido,
            cedula,
            telefono,
            fallecido
        );
        contadorPacientes++;
        System.out.println("Paciente registrado exitosamente.");
    }
}