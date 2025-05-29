import java.util.Scanner;

public class uno {

    // Función h(n) = n^2
    public static long calcularCuadrado(int numero) {
        return (long) numero * numero;
    }

    // Función f(n) = 5 * n^2
    public static long calcularFuncionF(int numero) {
        return 5 * calcularCuadrado(numero);
    }

    // Función g(n) = 2 * n^2
    public static long calcularFuncionG(int numero) {
        return 2 * calcularCuadrado(numero);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar valores al usuario
        System.out.print("Ingrese el valor inicial de n : ");
        int valorInicial = entrada.nextInt();

        System.out.print("Ingrese el valor máximo de n: ");
        int valorMaximo = entrada.nextInt();

        // Imprimir encabezado de la tabla
        System.out.printf("%-5s %-10s %-10s %-15s %-10s%n", "n", "f(n)", "g(n)", "f(n) - g(n)", "h(n)");
        System.out.println("-------------------------------------------------------------");

        // Calcular y mostrar los resultados en tabla
        for (int n = valorInicial; n <= valorMaximo; n++) {
            long resultadoF = calcularFuncionF(n);
            long resultadoG = calcularFuncionG(n);
            long resultadoH = calcularCuadrado(n);
            long diferencia = resultadoF - resultadoG;

            System.out.printf("%-5d %-10d %-10d %-15d %-10d%n", n, resultadoF, resultadoG, diferencia, resultadoH);
        }

        entrada.close();
    }

}
