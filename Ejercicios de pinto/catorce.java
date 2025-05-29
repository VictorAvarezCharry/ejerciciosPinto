public class catorce {

    // Algoritmo trivial con complejidad O(n^2)
    public static double calcularTiempoTrivial(double n, double k) {
        return k * n * n;
    }

    // Estrategia de Divide y Vencerás:
    // Resuelve la recurrencia T(n) = 2T(n/2) + 2n log n
    public static double calcularTiempoDivideYVenceras(double n) {
        if (n <= 1) return 1; // caso base
        double tiempoDividir = 2 * n * Math.log(n); // 2n log n
        return 2 * calcularTiempoDivideYVenceras(n / 2) + tiempoDividir;
    }

    public static void main(String[] args) {
        double k = 1; // constante arbitraria para el algoritmo trivial
        int[] tamanios = { 1000, 2000, 4000, 8000, 16000, 32000 };

        System.out.printf("%10s %25s %30s%n", "n", "Tiempo Trivial (n^2)", "Tiempo Divide y Vencerás");
        System.out.println("--------------------------------------------------------------------------");

        for (int n : tamanios) {
            double tiempoTrivial = calcularTiempoTrivial(n, k);
            double tiempoDividir = calcularTiempoDivideYVenceras(n);
            System.out.printf("%10d %25.2f %30.2f%n", n, tiempoTrivial, tiempoDividir);
        }
    }
}
