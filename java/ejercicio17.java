import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
      
        int NE;  
        int Q;  
        int R;   
        int D;   
        int U;  
        
       
        Scanner scanner = new Scanner(System.in);
   
        System.out.print("Ingrese un número entero de 2 dígitos: ");
        NE = scanner.nextInt();
        
        if (NE < 10 || NE > 99) {
            System.out.println("Error: Debe ingresar un número de 2 dígitos (10-99)");
            scanner.close();
            return;
        }
        
        Q = NE / 10;
        R = NE - (Q * 10);
        
        D = Q;
        U = R;
     
        System.out.println("Número de Decenas: " + D);
        System.out.println("Número de Unidades: " + U);
        
        scanner.close();
    }
}