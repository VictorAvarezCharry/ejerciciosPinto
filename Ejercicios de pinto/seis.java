import java.util.Scanner;

public class seis {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de datos del usuario
        System.out.print("Tamaño original de entrada (n): ");
        long tamanoOriginal = entrada.nextLong();

        System.out.print("Factor de aumento de tiempo disponible (por ejemplo, 3 si ahora tienes 3 veces más tiempo): ");
        double factorTiempo = entrada.nextDouble();

        // Menú de opciones
        System.out.println("\nSelecciona la complejidad del algoritmo:");
        System.out.println("a) T(n) = k · n       (lineal)");
        System.out.println("b) T(n) = k · n^2     (cuadrática)");
        System.out.println("c) T(n) = k · 10^n    (exponencial)");

        char opcion = entrada.next().toLowerCase().charAt(0);
        long nuevoTamano = 0;

        // Cálculo según la complejidad seleccionada
        switch (opcion) {
            case 'a':
                nuevoTamano = (long) (factorTiempo * tamanoOriginal);
                System.out.println("Nuevo tamaño de entrada máximo (T(n) = k·n): " + nuevoTamano);
                break;

            case 'b':
                nuevoTamano = (long) (Math.sqrt(factorTiempo) * tamanoOriginal);
                System.out.println("Nuevo tamaño de entrada máximo (T(n) = k·n²): " + nuevoTamano);
                break;

            case 'c':
                double logNuevoTamano = Math.log10(factorTiempo) + Math.log10(tamanoOriginal);
                nuevoTamano = (long) Math.floor(logNuevoTamano);
                System.out.println("Nuevo tamaño de entrada máximo (T(n) = k·10^n): " + nuevoTamano);
                break;

            default:
                System.out.println("Opción inválida. Intenta con a, b o c.");
        }

        entrada.close();
    }
}
