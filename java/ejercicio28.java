import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = Scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = Scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = Scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("El mayor es: " + a);
        } else if (b > a && b > c) {
            System.out.println("El mayor es: " + b);
        } else if (c > a && c > b) {
            System.out.println("El mayor es: " + c);
        } else {
            System.out.println("Hay números iguales.");
        }
    }
}
