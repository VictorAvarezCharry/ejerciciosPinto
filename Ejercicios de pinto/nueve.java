public class nueve {

    // Función recursiva que calcula T(n) = 2*T(n/4) + log2(n)
    public static double calcularT(int n) {
        if (n == 1) {
            return 1; // Caso base: a = 1
        }
        // Recursión: 2*T(n/4) + log2(n)
        return 2 * calcularT(n / 4) + Math.log(n) / Math.log(2);
    }

    public static void main(String[] args) {
        int n = 1024; // n debe ser potencia de 4 para simplicidad

        System.out.printf("T(%d) = %.4f%n", n, calcularT(n));

        System.out.println("n\tT(n)");
        for (int i = 1; i <= n; i *= 4) {
            System.out.printf("%d\t%.4f%n", i, calcularT(i));
        }
    }
}
