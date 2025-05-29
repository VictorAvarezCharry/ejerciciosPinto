public class quince {

    // Clase auxiliar para almacenar el resultado del algoritmo
    static class Resultado {
        int maximo;
        int minimo;
        int comparaciones;

        Resultado(int maximo, int minimo, int comparaciones) {
            this.maximo = maximo;
            this.minimo = minimo;
            this.comparaciones = comparaciones;
        }
    }

    // Algoritmo Max-Min que cuenta el número de comparaciones realizadas
    public static Resultado encontrarMaximoMinimo(int[] arreglo, int inicio, int fin) {
        if (inicio == fin) {
            // Solo un elemento, no hay comparaciones
            return new Resultado(arreglo[inicio], arreglo[inicio], 0);
        }

        int comparaciones = 1; // comparación entre arreglo[inicio] y arreglo[fin]

        int maximo, minimo;
        if (arreglo[inicio] > arreglo[fin]) {
            maximo = arreglo[inicio];
            minimo = arreglo[fin];
        } else {
            maximo = arreglo[fin];
            minimo = arreglo[inicio];
        }

        if (inicio + 1 <= fin - 1) {
            Resultado parcial = encontrarMaximoMinimo(arreglo, inicio + 1, fin - 1);
            comparaciones += parcial.comparaciones;

            // Comparación para el máximo
            comparaciones++;
            if (maximo < parcial.maximo) {
                maximo = parcial.maximo;
            }

            // Comparación para el mínimo
            comparaciones++;
            if (parcial.minimo < minimo) {
                minimo = parcial.minimo;
            }
        }

        return new Resultado(maximo, minimo, comparaciones);
    }

    public static void main(String[] args) {
        int[] arreglo = {5, 3, 8, 6, 2, 9, 1, 7};

        Resultado resultado = encontrarMaximoMinimo(arreglo, 0, arreglo.length - 1);

        System.out.println("Máximo: " + resultado.maximo);
        System.out.println("Mínimo: " + resultado.minimo);
        System.out.println("Número de comparaciones: " + resultado.comparaciones);
    }
}
