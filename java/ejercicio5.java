import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas laboradas en el mes (HL): ");
        double HL = scanner.nextDouble();

        System.out.print("Ingrese la tarifa por hora (TH): ");
        double TH = scanner.nextDouble();

      
        double P = HL * TH;

    
        System.out.println("La planilla (pago total) es: " + P);

        scanner.close();
    }
}
