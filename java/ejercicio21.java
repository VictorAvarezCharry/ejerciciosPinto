import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = Scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else if (edad >= 0) {
            System.out.println("Es menor de edad.");
        } else {
            System.out.println("Edad inválida.");
        }
    }
}
