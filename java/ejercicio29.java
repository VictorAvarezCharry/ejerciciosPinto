import java.util.Scanner;

public class ejercicio29 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota (0-20): ");
        int nota = Scanner.nextInt();

        if (nota >= 19 && nota <= 20) {
            System.out.println("Sobresaliente");
        } else if (nota >= 16) {
            System.out.println("Muy bueno");
        } else if (nota >= 13) {
            System.out.println("Bueno");
        } else if (nota >= 10) {
            System.out.println("Regular");
        } else if (nota >= 0) {
            System.out.println("Desaprobado");
        } else {
            System.out.println("Nota no válida.");
        }
    }
}
