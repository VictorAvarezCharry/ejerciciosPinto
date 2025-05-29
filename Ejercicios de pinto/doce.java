import java.util.PriorityQueue;

public class doce {

    // Clase para representar un elemento del heap
    static class Elemento implements Comparable<Elemento> {
        int valor;
        int indiceBloque;
        int posicionEnBloque;

        public Elemento(int valor, int indiceBloque, int posicionEnBloque) {
            this.valor = valor;
            this.indiceBloque = indiceBloque;
            this.posicionEnBloque = posicionEnBloque;
        }

        // Comparación por valor para el PriorityQueue (mínimo primero)
        @Override
        public int compareTo(Elemento otro) {
            return Integer.compare(this.valor, otro.valor);
        }
    }

    public static int[] mezclaGeneralizada(int[] arreglo) {
        int n = arreglo.length;

        if (n % 2 != 0) {
            throw new IllegalArgumentException("El tamaño del arreglo debe ser par.");
        }

        int cantidadBloques = n / 2;

        // Paso 1: ordenar los bloques de tamaño 2
        int[][] bloques = new int[cantidadBloques][2];
        for (int i = 0; i < cantidadBloques; i++) {
            bloques[i][0] = arreglo[2 * i];
            bloques[i][1] = arreglo[2 * i + 1];
            if (bloques[i][0] > bloques[i][1]) {
                int temp = bloques[i][0];
                bloques[i][0] = bloques[i][1];
                bloques[i][1] = temp;
            }
        }

        // Paso 2: aplicar mezcla generalizada usando un heap mínimo
        PriorityQueue<Elemento> heap = new PriorityQueue<>();

        // Inicializar heap con el primer elemento de cada bloque
        for (int i = 0; i < cantidadBloques; i++) {
            heap.add(new Elemento(bloques[i][0], i, 0));
        }

        int[] resultado = new int[n];
        int posicionResultado = 0;

        while (!heap.isEmpty()) {
            Elemento actual = heap.poll();
            resultado[posicionResultado++] = actual.valor;

            int siguientePos = actual.posicionEnBloque + 1;
            if (siguientePos < 2) { // cada bloque tiene 2 elementos
                heap.add(new Elemento(bloques[actual.indiceBloque][siguientePos], actual.indiceBloque, siguientePos));
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] arreglo = {5, 3, 8, 1, 7, 6, 4, 2}; // Debe tener tamaño par

        int[] ordenado = mezclaGeneralizada(arreglo);

        System.out.print("Arreglo ordenado: ");
        for (int valor : ordenado) {
            System.out.print(valor + " ");
        }
    }
}
