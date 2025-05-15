import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        
        int N1; 
        int N2; 
        int N3;
        int NM; 
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero: ");
        N1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        N2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número entero: ");
        N3 = scanner.nextInt();
        
        
        if ((N1 > N2) && (N1 > N3)) {
            NM = N1;
        } else {
            if (N2 > N3) {
                NM = N2;
            } else {
                NM = N3;
            }
        }
        
        
        System.out.println("El número mayor es: " + NM);
        
      
        scanner.close();
    }
}
