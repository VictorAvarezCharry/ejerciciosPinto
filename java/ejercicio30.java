import java.util.Scanner;

public class ejercicio30 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura: ");
        double temp = Scanner.nextDouble();

        if (temp < 0) {
            System.out.println("Congelación");
        } else if (temp >= 0 && temp < 10) {
            System.out.println("Frío");
        } else if (temp >= 10 && temp < 20) {
            System.out.println("Templado");
        } else if (temp >= 20 && temp < 30) {
            System.out.println("Caluroso");
        } else {
            System.out.println("Muy caluroso");
        }
    }
}
