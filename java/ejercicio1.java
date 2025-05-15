import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingrese la velocidad constante (m/s): ");
        double V = scanner.nextDouble();
        
       
        System.out.print("Ingrese el tiempo (segundos): ");
        double T = scanner.nextDouble();
        
       
        double D = V * T;
        
        System.out.println("La distancia recorrida es: " + D + " metros");
        
        scanner.close();
    }
}
