import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        // Declaración de variables
        double PL;  // Producción del día Lunes
        double PMa; // Producción del día Martes
        double PMi; // Producción del día Miércoles
        double PJ;  // Producción del día Jueves
        double PV;  // Producción del día Viernes
        double PS;  // Producción del día Sábado
        double PT;  // Producción Total
        double PP;  // Producción Promedio
        String MSG; // Mensaje
        
        // Crear objeto Scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Leer PL
        System.out.print("Ingrese la producción del día Lunes: ");
        PL = scanner.nextDouble();
        
        // Leer PMa
        System.out.print("Ingrese la producción del día Martes: ");
        PMa = scanner.nextDouble();
        
        // Leer PMi
        System.out.print("Ingrese la producción del día Miércoles: ");
        PMi = scanner.nextDouble();
        
        // Leer PJ
        System.out.print("Ingrese la producción del día Jueves: ");
        PJ = scanner.nextDouble();
        
        // Leer PV
        System.out.print("Ingrese la producción del día Viernes: ");
        PV = scanner.nextDouble();
        
        // Leer PS
        System.out.print("Ingrese la producción del día Sábado: ");
        PS = scanner.nextDouble();
        
        // Calcular PT y PP
        PT = PL + PMa + PMi + PJ + PV + PS;
        PP = PT / 6;
        
        // Determinar si recibe incentivos
        if (PP >= 100) {
            MSG = "Recibirá Incentivos";
        } else {
            MSG = "No Recibirá Incentivos";
        }
        
        // Mostrar resultados
        System.out.println("Producción Total: " + PT);
        System.out.println("Producción Promedio: " + PP);
        System.out.println("Mensaje: " + MSG);
        
        // Cerrar el scanner
        scanner.close();
    }
}