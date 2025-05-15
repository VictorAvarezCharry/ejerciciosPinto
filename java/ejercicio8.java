import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la abscisa de A (AA): ");
        double AA = scanner.nextDouble();

        System.out.print("Ingrese la abscisa de B (AB): ");
        double AB = scanner.nextDouble();

        System.out.print("Ingrese la ordenada de A (OA): ");
        double OA = scanner.nextDouble();

        System.out.print("Ingrese la ordenada de B (OB): ");
        double OB = scanner.nextDouble();

        
        double D = Math.sqrt(Math.pow((AB - AA), 2) + Math.pow((OB - OA), 2));

        
        System.out.println("La distancia entre los puntos A y B es: " + D);

        scanner.close();
    }
}
