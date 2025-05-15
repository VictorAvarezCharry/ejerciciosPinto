import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la longitud del lado A (LA): ");
        double LA = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado B (LB): ");
        double LB = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado C (LC): ");
        double LC = scanner.nextDouble();

        double LS = (LA + LB + LC) / 2;

      
        double AT = Math.sqrt(LS * (LS - LA) * (LS - LB) * (LS - LC));

        System.out.println("El área del triángulo es: " + AT);

        scanner.close();
    }
}

