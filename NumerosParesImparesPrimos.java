import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite, opcion;

        System.out.println("Digite un número de 1 a 500:");
        limite = teclado.nextInt();
        

        System.out.println("Seleccione qué números desea mostrar:");
        System.out.println("1. Números pares");
        System.out.println("2. Números impares");
        System.out.println("3. Números primos");
        System.out.print("Ingrese su opción (1-3): ");
        opcion = teclado.nextInt();

       
        switch (opcion) {
            case 1:
                System.out.println("Números pares hasta " + limite + ":");
                for (int numero = 1; numero <= limite; numero++) {
                    if (numero % 2 == 0) {
                        System.out.println(numero);
                    }
                }
                break;

            case 2:
                System.out.println("Números impares hasta " + limite + ":");
                for (int numero = 1; numero <= limite; numero++) {
                    if (numero % 2 != 0) {
                        System.out.println(numero);
                    }
                }
                break;

            case 3:
                System.out.println("Números primos hasta " + limite + ":");
                for (int numero = 2; numero <= limite; numero++) {
                    boolean esPrimo = true;
                    for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
                        if (numero % divisor == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    if (esPrimo) {
                        System.out.print(numero + " ");
                    }
                }
                System.out.println(); 
                break;
        }
    }
}
