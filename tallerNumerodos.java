import java.util.Scanner;

public class  swicthEjercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSeleccione un ejercicio (1-15):");
            System.out.println("1. Orden de f(n) - g(n)");
            System.out.println("2. Logaritmos en Θ");
            System.out.println("3. Afirmaciones sobre O(f(n))");
            System.out.println("4. Análisis del procedimiento G(n)");
            System.out.println("5. Número triangular");
            System.out.println("6. Tamaño de entrada con más CPU");
            System.out.println("7. Tamaño de entrada con máquina más rápida");
            System.out.println("8. Máximo y mínimo con < 3n/2 comparaciones");
            System.out.println("9. Ecuación de recurrencia T(n)");
            System.out.println("10. Orden temporal de funciones recursivas");
            System.out.println("11. Comparaciones StringSearch");
            System.out.println("12. Ordenación estilo Mergesort generalizado");
            System.out.println("13. Palíndromo recursivo");
            System.out.println("14. Análisis divide y vencerás vs cuadrático");
            System.out.println("15. Comparaciones en MAX_MIN recursivo");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("f(n) - g(n) ∈ O(h(n)) porque ambas están acotadas por Θ(h(n)) y su resta está acotada por una constante por h(n).");
                    break;
                case 2:
                    System.out.println("∀a,b>1, log_a(n) ∈ Θ(log_b(n)) porque log_a(n) = log_b(n)/log_b(a) y log_b(a) es constante.");
                    System.out.println("Pero 2^log_a(n) no ∈ Θ(2^log_b(n)) si a ≠ b, ya que base distinta implica crecimiento distinto.");
                    break;
                case 3:
                    System.out.println("(a) FALSA. Igual orden no garantiza que los logaritmos también lo tengan.");
                    System.out.println("(b) FALSA. Igual orden en los logaritmos no implica igual orden en las funciones originales.");
                    break;
                case 4:
                    System.out.println("T(n) = n(n+1)/2 + 4T(n/2) ⇒ T(n) ∈ Θ(n log n)");
                    break;
                case 5:
                    System.out.println("Ingrese un número:");
                    int num = scanner.nextInt();
                    int sum = 0, i = 1;
                    while (sum < num) sum += i++;
                    System.out.println(sum == num ? "Es triangular" : "No es triangular");
                    break;
                case 6:
                    System.out.println("Tiempos nuevos con 3 veces más CPU:");
                    System.out.println("(a) n: 3,000,000");
                    System.out.println("(b) √3 * 1,000,000 ≈ 1,732,050");
                    System.out.println("(c) log base 10: n + log_10(3) ≈ 1,000,000 + 0.48");
                    break;
                case 7:
                    System.out.println("Máquina 100 veces más rápida:");
                    System.out.println("(a) n: 100,000,000");
                    System.out.println("(b) √100 * 1,000,000 = 10,000,000");
                    System.out.println("(c) log base 10: n + log_10(100) ≈ 1,000,000 + 2");
                    break;
                case 8:
                    System.out.println("Algoritmo por pares, comparación cruzada, ≈ 3n/2 comparaciones");
                    break;
                case 9:
                    System.out.println("T(n) = 2T(n/4) + log n ⇒ Usando Master Theorem: T(n) ∈ Θ(log^2 n)");
                    break;
                case 10:
                    System.out.println("(a) total depende de parcial que es exponencial: Θ(2^n)");
                    System.out.println("(b) cada llamada duplica m ⇒ total = m(2^n-1): Θ(m·2^n)");
                    break;
                case 11:
                    System.out.println("Peor caso: B = 'aaa', A = 'aaaaaa...' ⇒ Comparaciones: (n - m + 1) * m");
                    break;
                case 12:
                    System.out.println("División en n/2 bloques y mezcla en n log n ⇒ T(n) ∈ Θ(n log n)");
                    break;
                case 13:
                    System.out.println("Caso peor: Θ(n). Caso medio: también Θ(n), ya que en promedio recorre toda la cadena");
                    break;
                case 14:
                    System.out.println("Divide y vencerás hace D(n)+C(n) = 2n log n ⇒ Mejor que Θ(n^2)");
                    break;
                case 15:
                    System.out.println("Caso peor: ≈ 3n/2 comparaciones, igual que algoritmo óptimo de comparaciones por pares");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
        scanner.close();
    }
}
