import java.util.Scanner;

public class ejercicio27 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        double a = Scanner.nextDouble();
        System.out.print("Ingrese el divisor: ");
        double b = Scanner.nextDouble();

        if (b != 0) {
            double resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Error: división entre cero.");
        }
    }
}
