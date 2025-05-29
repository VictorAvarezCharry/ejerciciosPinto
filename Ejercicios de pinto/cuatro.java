import java.util.Scanner;

public class cuatro {

    // Contador global para registrar las "líneas ejecutadas"
    static long totalLineas = 0;

    // Función recursiva que combina bucles anidados y llamadas recursivas
    public static void ejecutarProceso(int valor) {
        if (valor <= 0) return;

        // Parte 1: doble bucle anidado
        for (int i = 1; i <= valor; i++) {
            for (int j = 1; j <= i; j++) {
                contarLinea(i, j, valor);
            }
        }

        // Parte 2: cuatro llamadas recursivas con la mitad del valor
        for (int i = 1; i <= 4; i++) {
            ejecutarProceso(valor / 2);
        }
    }

    // Método que simula una impresión de línea (incrementa el contador)
    public static void contarLinea(int i, int j, int valor) {
        totalLineas++;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar entrada al usuario
        System.out.print("Ingrese un valor para n: ");
        int n = entrada.nextInt();

        // Medición del tiempo de ejecución
        long tiempoInicio = System.nanoTime();
        ejecutarProceso(n);
        long tiempoFin = System.nanoTime();

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Valor de n: " + n);
        System.out.println("Total de líneas ejecutadas: " + totalLineas);
        System.out.printf("Estimación teórica (n^2 * log₂(n)) ≈ %.0f%n", n * n * (Math.log(n) / Math.log(2)));
        System.out.printf("Tiempo de ejecución: %.3f ms%n", (tiempoFin - tiempoInicio) / 1e6);

        entrada.close();
    }
}
