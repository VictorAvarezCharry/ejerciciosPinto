import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {

        double MV; 
        double TB; 
        
        
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Ingrese el monto de venta: ");
        MV = scanner.nextDouble();
        
      
        if (MV >= 0 && MV < 1000) {
            TB = (0 * MV) / 100;
        } else if (MV >= 1000 && MV < 5000) {
            TB = (3 * MV) / 100;
        } else if (MV >= 5000 && MV < 20000) {
            TB = (5 * MV) / 100;
        } else if (MV >= 20000) {
            TB = (8 * MV) / 100;
        } else {
            TB = 0;
            System.out.println("El monto de venta no puede ser negativo.");
        }
        
       
        System.out.println("El total de bonificación es: " + TB);
        
        
        scanner.close();
    }
}