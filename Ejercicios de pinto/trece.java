import java.util.Random;

public class trece {

    static int comparaciones; // contador global de comparaciones

    // Función PAL que verifica si un arreglo de caracteres es palíndromo
    public static boolean esPalindromo(char[] cadena, int i, int j) {
        if (i >= j) {
            return true; // caso base
        }
        comparaciones++; // cuenta la comparación entre caracteres
        if (cadena[i] != cadena[j]) {
            return false;
        } else {
            return esPalindromo(cadena, i + 1, j - 1); // llamada recursiva
        }
    }

    // Genera una cadena aleatoria de longitud n con caracteres 'a' o 'b'
    public static char[] generarCadenaAleatoria(int n, Random aleatorio) {
        char[] cadena = new char[n];
        for (int i = 0; i < n; i++) {
            cadena[i] = aleatorio.nextBoolean() ? 'a' : 'b';
        }
        return cadena;
    }

    // Estima el número medio de comparaciones para verificar palíndromos
    public static void estimarCasoMedio(int n, int iteraciones) {
        Random aleatorio = new Random();
        long sumaComparaciones = 0;
        int maxComparaciones = 0;

        for (int i = 0; i < iteraciones; i++) {
            char[] cadena = generarCadenaAleatoria(n, aleatorio);
            comparaciones = 0;
            esPalindromo(cadena, 0, n - 1);
            sumaComparaciones += comparaciones;
            if (comparaciones > maxComparaciones) {
                maxComparaciones = comparaciones;
            }
        }

        System.out.printf("Para n = %d, después de %d iteraciones:%n", n, iteraciones);
        System.out.printf("Promedio de comparaciones (caso medio): %.4f%n", (double) sumaComparaciones / iteraciones);
        System.out.printf("Máximo de comparaciones (caso peor): %d%n", maxComparaciones);
    }

    public static void main(String[] args) {
        int n = 20;                // longitud de la cadena
        int iteraciones = 100000; // número de cadenas generadas aleatoriamente

        estimarCasoMedio(n, iteraciones);
    }
}

