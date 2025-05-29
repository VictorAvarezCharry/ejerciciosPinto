import java.util.Scanner;

public class dos {

    // Función que calcula 2^(log base 'base' de n)
    public static double calcularPotenciaLogaritmica(double base, int numero) {
        return Math.pow(2, Math.log(numero) / Math.log(base));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar las bases a y b al usuario
        System.out.print("Ingrese la base 'a' del logaritmo (a > 1): ");
        double baseA = entrada.nextDouble();

        System.out.print("Ingrese la base 'b' del logaritmo (b > 1): ");
        double baseB = entrada.nextDouble();

        // Validación mínima de las bases
        if (baseA <= 1 || baseB <= 1) {
            System.out.println("Error: las bases deben ser mayores que 1.");
            entrada.close();
            return;
        }

        // Encabezado de la tabla
        System.out.printf("%-5s %20s %20s %20s%n", "n", "2^log_a(n)", "2^log_b(n)", "Relación (a/b)");
        System.out.println("-------------------------------------------------------------------------------");

        // Calcular y mostrar resultados para n del 1 al 20
        for (int n = 1; n <= 20; n++) {
            double valorA = calcularPotenciaLogaritmica(baseA, n);
            double valorB = calcularPotenciaLogaritmica(baseB, n);
            double relacion = valorA / valorB;

            System.out.printf("%-5d %20.5f %20.5f %20.5f%n", n, valorA, valorB, relacion);
        }

        entrada.close();
    }
}
