import java.util.Scanner;

public class tres {

    // Función que calcula 2^(logaritmo base 'base' de 'numero')
    public static double calcularPotenciaDeDos(double base, int numero) {
        return Math.pow(2, Math.log(numero) / Math.log(base));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar las bases al usuario
        System.out.print("Ingrese la base 'a' del logaritmo (debe ser mayor que 1): ");
        double baseA = entrada.nextDouble();

        System.out.print("Ingrese la base 'b' del logaritmo (debe ser mayor que 1): ");
        double baseB = entrada.nextDouble();

        // Validar que las bases sean mayores que 1
        if (baseA <= 1 || baseB <= 1) {
            System.out.println("Error: ambas bases deben ser mayores que 1.");
            entrada.close();
            return;
        }

        // Imprimir encabezado de la tabla
        System.out.printf("%-5s %20s %20s %20s%n", "n", "2^log_a(n)", "2^log_b(n)", "Relación (a/b)");
        System.out.println("-------------------------------------------------------------------------------");

        // Calcular e imprimir los valores desde n = 1 hasta n = 20
        for (int n = 1; n <= 20; n++) {
            double resultadoA = calcularPotenciaDeDos(baseA, n);
            double resultadoB = calcularPotenciaDeDos(baseB, n);
            double relacion = resultadoA / resultadoB;

            System.out.printf("%-5d %20.5f %20.5f %20.5f%n", n, resultadoA, resultadoB, relacion);
        }

        entrada.close();
    }
}
