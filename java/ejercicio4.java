import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el número de partidos ganados (PG): ");
        int PG = scanner.nextInt();

        System.out.print("Ingrese el número de partidos empatados (PE): ");
        int PE = scanner.nextInt();

        System.out.print("Ingrese el número de partidos perdidos (PP): ");
        int PP = scanner.nextInt();

        
        int PPG = PG * 3;
        int PPE = PE * 1;

       
        int PT = PPG + PPE;

        
        System.out.println("El puntaje total es: " + PT);

        scanner.close();
    }
}
