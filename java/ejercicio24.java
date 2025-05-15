import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ingrese usuario: ");
        String usuario = Scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        String clave = Scanner.nextLine();

        if (usuario.equals("hugo") && clave.equals("1234")) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
