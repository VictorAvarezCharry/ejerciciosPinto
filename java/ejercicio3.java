import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el número de respuestas correctas (RC): ");
        int RC = scanner.nextInt();

        System.out.print("Ingrese el número de respuestas incorrectas (RI): ");
        int RI = scanner.nextInt();

        System.out.print("Ingrese el número de respuestas en blanco (RB): ");
        int RB = scanner.nextInt();

       
        int PRC = RC * 4;
        int PRI = RI * -1;

        
        int PF = PRC + PRI;

        
        System.out.println("El puntaje final es: " + PF);

        scanner.close();
    }
}
