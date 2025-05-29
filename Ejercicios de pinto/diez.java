public class diez {

    // Función parcial(m) - caso (a)
    public static int parcial(int m) {
        if (m == 1) {
            return 1;
        } else {
            return 2 * parcial(m - 1);
        }
    }

    // Función total(n) - caso (a)
    public static int totalA(int n) {
        if (n == 1) {
            return 1;
        } else {
            return totalA(n - 1) + 2 * parcial(n - 1);
        }
    }

    // Función total(n, m) - caso (b)
    public static int totalB(int n, int m) {
        if (n == 1) {
            return m;
        } else {
            return m + totalB(n - 1, 2 * m);
        }
    }

    public static void main(String[] args) {
        int n = 20; // valor para n, cuidado con valores muy grandes por recursión

        long inicio, fin;

        // Medir tiempo para totalA
        inicio = System.nanoTime();
        int resultadoA = totalA(n);
        fin = System.nanoTime();
        System.out.println("Caso (a): totalA(" + n + ") = " + resultadoA);
        System.out.println("Tiempo (nanosegundos): " + (fin - inicio));

        // Medir tiempo para totalB
        inicio = System.nanoTime();
        int resultadoB = totalB(n, 1);
        fin = System.nanoTime();
        System.out.println("Caso (b): totalB(" + n + ", 1) = " + resultadoB);
        System.out.println("Tiempo (nanosegundos): " + (fin - inicio));
    }
}

