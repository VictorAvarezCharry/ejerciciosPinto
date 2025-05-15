import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        
        int E1; 
        int E2; 
        int DE; 
        
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingrese la edad del primer hermano: ");
        E1 = scanner.nextInt();
        
        
        System.out.print("Ingrese la edad del segundo hermano: ");
        E2 = scanner.nextInt();
        
        
        if (E1 > E2) {
            System.out.println("El Primer Hermano es el Mayor, por " + (E1 - E2) + " años");
            DE = E1 - E2;
        } else {
            System.out.println("El segundo Hermano es el Mayor, por " + (E2 - E1) + " años");
            DE = E2 - E1;
        }
        
        
        System.out.println("La diferencia de edades es: " + DE + " años");
        
        scanner.close();
    }
}