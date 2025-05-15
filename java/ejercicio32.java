import java.util.Scanner;

public class ejercicio32{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero distinto de cero: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("El número debe ser distinto de cero.");
        } else {
            System.out.println("Los divisores de " + n + " son:");
            for (int k = 1; k <= Math.abs(n); k++) {
                if (n % k == 0) {
                    System.out.println(k);
                }
            }
        }

        scanner.close();
    }
}
