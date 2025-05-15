import java.util.Scanner;

public class ejercicio23{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = Scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }
    }
}
