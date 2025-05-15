import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = Scanner.nextInt();

        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}
