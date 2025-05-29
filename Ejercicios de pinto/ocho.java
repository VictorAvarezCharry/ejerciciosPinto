import java.util.Scanner;

public class ocho {

    // Método para calcular el máximo y el mínimo con menos comparaciones
    public static void encontrarMaximoMinimo(int[] arreglo) {
        int n = arreglo.length;
        int maximo, minimo;
        int comparaciones = 0;
        int i = 0;

        if (n % 2 == 0) {
            // Comparar el primer par
            comparaciones++;
            if (arreglo[0] > arreglo[1]) {
                maximo = arreglo[0];
                minimo = arreglo[1];
            } else {
                maximo = arreglo[1];
                minimo = arreglo[0];
            }
            i = 2;
        } else {
            // Si el tamaño es impar, inicializar con el primer elemento
            maximo = minimo = arreglo[0];
            i = 1;
        }

        // Comparar en pares
        while (i < n - 1) {
            comparaciones++;
            int mayorLocal, menorLocal;

            if (arreglo[i] > arreglo[i + 1]) {
                mayorLocal = arreglo[i];
                menorLocal = arreglo[i + 1];
            } else {
                mayorLocal = arreglo[i + 1];
                menorLocal = arreglo[i];
            }

            comparaciones++;
            if (mayorLocal > maximo) {
                maximo = mayorLocal;
            }

            comparaciones++;
            if (menorLocal < minimo) {
                minimo = menorLocal;
            }

            i += 2;
        }

        // Resultados
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Número de comparaciones realizadas: " + comparaciones);
        System.out.println("¿Comparaciones < 3n/2?: " + (comparaciones < 1.5 * n));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo n: ");
        int n = entrada.nextInt();
        int[] arreglo = new int[n];

        System.out.println("Ingrese los " + n + " elementos:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = entrada.nextInt();
        }

        encontrarMaximoMinimo(arreglo);
        entrada.close();
    }
}

