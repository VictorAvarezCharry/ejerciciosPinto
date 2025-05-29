import java.util.Scanner;

public class cinco {

    // Método para verificar si un número es triangular
    public static boolean esNumeroTriangular(int numero) {
        int sumaAcumulada = 0;
        for (int k = 1; sumaAcumulada < numero; k++) {
            sumaAcumulada += k;
            if (sumaAcumulada == numero) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar número al usuario
        System.out.print("Ingrese un número entero positivo (n ≥ 1): ");
        int n = entrada.nextInt();

        // Validación mínima
        if (n < 1) {
            System.out.println("El número debe ser mayor o igual a 1.");
        } else {
            boolean esTriangular = esNumeroTriangular(n);
            if (esTriangular) {
                System.out.println(n + " es un número triangular.");
            } else {
                System.out.println(n + " NO es un número triangular.");
            }
        }

        entrada.close();
    }
}
