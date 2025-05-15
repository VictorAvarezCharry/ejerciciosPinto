import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        
        int NE;      
        double SE;   
        int K;       
        double SS;   
        double SP;  
        
       
        Scanner Scanner = new Scanner(System.in);
        
        // Leer NE
        System.out.print("Ingrese el número de empleados: ");
        NE = Scanner.nextInt();
        
       
        if (NE <= 0) {
            System.out.println("Error: El número de empleados debe ser positivo");
            Scanner.close();
            return;
        }
        
        SS = 0;
        
        for (K = 1; K <= NE; K++) {
            System.out.print("Ingrese el sueldo del empleado " + K + ": ");
            SE = Scanner.nextDouble();
            SS = SS + SE;
        }
        
        SP = SS / NE;
        
       
        System.out.println("El sueldo promedio es: " + SP);

        Scanner.close();
    }
}