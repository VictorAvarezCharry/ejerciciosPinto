import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la primera nota (N1): ");
        double N1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda nota (N2): ");
        double N2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera nota (N3): ");
        double N3 = scanner.nextDouble();

        
        double P = (N1 + N2 + N3) / 3;

        
        System.out.println("El promedio es: " + P);

        scanner.close();
    }
}
