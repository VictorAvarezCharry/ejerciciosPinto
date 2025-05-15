import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        
        double L1; 
        double L2; 
        double L3;
        String TT; 
        
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Ingrese el primer lado del triángulo: ");
        L1 = scanner.nextDouble();
      
        System.out.print("Ingrese el segundo lado del triángulo: ");
        L2 = scanner.nextDouble();
        
       
        System.out.print("Ingrese el tercer lado del triángulo: ");
        L3 = scanner.nextDouble();
        
        
        if ((L1 != L2) && (L2 != L3) && (L3 != L1)) {
            TT = "Escaleno";
        } else {
            if ((L1 == L2) && (L2 == L3)) {
                TT = "Equilátero";
            } else {
                TT = "Isósceles";
            }
        }
        
      
        System.out.println("El tipo de triángulo es: " + TT);
        
       
        scanner.close();
    }
}