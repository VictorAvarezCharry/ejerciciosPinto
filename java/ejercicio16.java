import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
       
        int NE;     
        String V;   
        
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero (1-5): ");
        NE = scanner.nextInt();
        
        switch (NE) {
            case 1:
                V = "A";
                break;
            case 2:
                V = "E";
                break;
            case 3:
                V = "I";
                break;
            case 4:
                V = "O";
                break;
            case 5:
                V = "U";
                break;
            default:
                V = "Valor Incorrecto";
                break;
        }
        
       
        System.out.println("La vocal correspondiente es: " + V);
        
        
        scanner.close();
    }
}
