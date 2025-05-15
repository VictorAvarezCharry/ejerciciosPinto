import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        
        int NE;     
        int Q;      
        int R;      
        String MSG; 
        
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingrese un número entero: ");
        NE = scanner.nextInt();
        
        
        Q = NE / 2;
        R = NE - (Q * 2);
        
       
        if (R == 0) {
            MSG = "Es Par";
        } else {
            MSG = "Es Impar";
        }
        
     
        System.out.println(MSG);
        
        scanner.close();
    }
}