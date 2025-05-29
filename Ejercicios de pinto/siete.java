import java.util.Scanner;

public class siete {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de datos del usuario
        System.out.print("Ingrese el tamaño original de entrada n (ej. 1000000): ");
        long tamanoOriginal = entrada.nextLong();

        System.out.print("Ingrese cuántas veces es más rápida la nueva máquina (ej. 100): ");
        double velocidad = entrada.nextDouble();

        // Menú de opciones de complejidad
        System.out.println("\nSeleccione la complejidad del algoritmo:");
        System.out.println("a) T(n) = k · n       (lineal)");
        System.out.println("b) T(n) = k · n^2     (cuadrática)");
        System.out.println("c) T(n) = k · 10^n    (exponencial)");

        char opcion = entrada.next().toLowerCase().charAt(0);

        // Cálculo según la complejidad
        switch (opcion) {
            case 'a':
                long nuevoNLineal = (long) (velocidad * tamanoOriginal);
                System.out.println("Nuevo tamaño máximo de entrada (lineal): " + nuevoNLineal);
                break;

            case 'b':
                long nuevoNCuadratico = (long) (Math.sqrt(velocidad) * tamanoOriginal);
                System.out.println("Nuevo tamaño máximo de entrada (cuadrático): " + nuevoNCuadratico);
                break;

            case 'c':
                double nuevoNExponencial = tamanoOriginal + Math.log10(velocidad);
                System.out.println("Nuevo tamaño máximo de entrada (exponencial): " + (long) nuevoNExponencial);
                break;

            default:
                System.out.println("Opción no válida. Elija a, b o c.");
        }

        entrada.close();
    }
}
