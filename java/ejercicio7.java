import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el tamaño del disco duro en GB: ");
        double GB = scanner.nextDouble();

        
        double MG = GB * 1024;

        
        int CD = (int)((MG / 700) + 1);

     
        System.out.println("Se necesitan " + CD + " CDs para almacenar el disco duro.");

        scanner.close();
    }
}

