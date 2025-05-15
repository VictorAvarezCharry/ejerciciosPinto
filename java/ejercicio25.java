import java.util.Scanner;

public class ejercicio25{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora (0 a 23): ");
        int hora = Scanner.nextInt();

        if (hora >= 6 && hora < 12) {
            System.out.println("Buenos días.");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Buenas tardes.");
        } else if (hora >= 18 && hora <= 23 || hora >= 0 && hora < 6) {
            System.out.println("Buenas noches.");
        } else {
            System.out.println("Hora no válida.");
        }
    }
}
