import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el año de nacimiento: ");
        int AN = scanner.nextInt();

        System.out.print("Ingrese el año actual: ");
        int AA = scanner.nextInt();

     
        int E = AA - AN;

        if (E > 17) {
            System.out.println("Debe solicitar su CUIL");
        } else {
            System.out.println("No debe solicitar su CUIL aun");
        }

        scanner.close();
    }
}
