import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto de compra: ");
        double monto = Scanner.nextDouble();
        double descuento = 0;

        if (monto >= 200) {
            descuento = monto * 0.15;
        } else if (monto >= 100) {
            descuento = monto * 0.10;
        } else {
            descuento = monto * 0.05;
        }

        double total = monto - descuento;
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);
    }
}
