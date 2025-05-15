import java.util.Scanner;

public class ExerciseSwitch {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int mayores, menores, edad;
        int num1, num2, producto;
        int contadorImpares, numeroActual, distancia;
        
        int opcion;

        do{
        System.out.println("MENÚ DE EJERCICIOS");
        System.out.println("1. Cálculo de la distancia");
        System.out.println("2. Contador de mayores y menores de edad");
        System.out.println("3. Multiplicación por sumas sucesivas");
        System.out.println("4. Mostrar números impares");
        System.out.println("5. Planilla de empleado");
        System.out.println("6: Area de un triangulo");
        System.out.println("7: Conversión de Disco Duro a número de CDs");
        System.out.println("8: Distancia entre dos puntos plano cartesiano");
        System.out.println("9: Verificar si debe solicitar su CUIL");
        System.out.println("10. Comparar edad de dos hermanos");
        System.out.println("11. Evaluación de incentivos por producción semanal");
        System.out.println("12. Determinar el número mayor entre tres números");
        System.out.println("13: Determinar el tipo de triángulo");
        System.out.println("14: Conversión de número entero a número romano (1 al 10)");
        System.out.println("15: Calcular bonificación según monto de venta");
        System.out.println("16: Conversión de número a vocal");
        System.out.println("17: Descomposición en decenas y unidades");
        System.out.println("18: Verificar si un número es par o impar");
        System.out.println("19: Secuencia de números pares");
        System.out.println("20: Cálculo de sueldo promedio");

        opcion = teclado.nextInt(); 

        System.out.print("Seleccione un ejercicio (1-20): ");


        switch (opcion) {
            case 1:
                // Ejercicio 1: Cálculo de distancia
                System.out.println("Ejercicio 1: Cálculo de distancia");
                System.out.print("Introduce la velocidad constante (m/s): ");
                num1 = teclado.nextInt();
                System.out.print("Introduce el tiempo (segundos): ");
                num2 = teclado.nextInt();

                distancia = num1 * num2;
                System.out.println("La distancia recorrida es: " + distancia + " metros");
                break;

            case 2:
                // Ejercicio 2: Contador de edades
                System.out.println("Ejercicio 2: Contador de edades");
                mayores = 0;
                menores = 0;

                for (int i = 1; i <= 5; i++) {
                    System.out.print("Ingrese la edad de la persona " + i + ": ");
                    edad = teclado.nextInt();

                    if (edad < 18) {
                        menores++;
                    } else {
                        mayores++;
                    }
                }

                System.out.println("Mayores de edad: " + mayores);
                System.out.println("Menores de edad: " + menores);
                break;

            case 3:
                // Ejercicio 3: Multiplicación por sumas sucesivas
                System.out.println("Ejercicio 3: Multiplicación por sumas");
                System.out.print("Ingrese el primer número: ");
                num1 = teclado.nextInt();
                System.out.print("Ingrese el segundo número: ");
                num2 = teclado.nextInt();
                producto = 0;

                for (int i = 1; i <= num2; i++) {
                    producto += num1;
                }

                System.out.println("Resultado: " + producto);
                break;

            case 4:
                // Ejercicio 4: Mostrar números impares
                System.out.println("Ejercicio 4: Primeros 10 números impares");
                contadorImpares = 0;
                numeroActual = 1;

                while (contadorImpares < 10) {
                    if (numeroActual % 2 != 0) {
                        System.out.println(numeroActual);
                        contadorImpares++;
                    }
                    numeroActual++;
                }
                break;

            case 5:
                // Ejercicio 5: Planilla de empleado
                System.out.println("Ejercicio 5: Planilla de un empleado");

                int horaLaborales;
                int tarifaPorHora;
                int planilla;

                System.out.print("Ingrese la cantidad de horas laborales: ");
                horaLaborales = teclado.nextInt();

                System.out.print("Ingrese la tarifa por hora: ");
                tarifaPorHora = teclado.nextInt();

                planilla = horaLaborales * tarifaPorHora;

                System.out.println("La planilla del empleado es:  " + planilla);
                break;

            default:
                System.out.println("Opción no válida.");
                break;
                case 6:
                //ejercicico 6: Area de un triangulo
                System.out.println("Ejercicio 6: Área de un triángulo (fórmula de Herón)");
                double ladoA, ladoB, ladoC, semiperimetro, area;

                System.out.print("Ingrese la longitud del lado A: ");
                ladoA = teclado.nextDouble();

                System.out.print("Ingrese la longitud del lado B: ");
                ladoB = teclado.nextDouble();

                System.out.print("Ingrese la longitud del lado C: ");
                ladoC = teclado.nextDouble();

                semiperimetro = (ladoA + ladoB + ladoC) / 2;
                area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));

                System.out.println("El área del triángulo es: " + area);

                break;

                case 7:
                // Conversión de Disco Duro a número de CDs
                System.out.println("Ejercicio 7: Conversión de Disco Duro a número de CDs");

                int GB;
                double MG;
                int CD;

                System.out.print("Ingrese la capacidad del disco duro en GB: ");
                GB = teclado.nextInt();

                MG = GB * 1024.0;
                CD = (int) ((MG / 700) + 1); // truncamiento con (int)

                System.out.println("Se necesitan aproximadamente " + CD + " CD(s) para almacenar " + GB + " GB");
                break;

                case 8:
                // Distancia entre dos puntos
                System.out.println("Ejercicio 8: Distancia entre dos puntos (plano cartesiano)");

                double AA, AB, OA, OB, D;

                System.out.print("Ingrese la abscisa del punto A (AA): ");
                AA = teclado.nextDouble();

                System.out.print("Ingrese la ordenada del punto A (OA): ");
                OA = teclado.nextDouble();

                System.out.print("Ingrese la abscisa del punto B (AB): ");
                AB = teclado.nextDouble();

                System.out.print("Ingrese la ordenada del punto B (OB): ");
                OB = teclado.nextDouble();

                D = Math.sqrt(Math.pow(AB - AA, 2) + Math.pow(OB - OA, 2));

                System.out.println("La distancia entre los puntos A y B es: " + D);
                break;

                case 9:
                //Verificar si una persona debe solicitar su CUIL
                System.out.println("Ejercicio 9: Verificar si debe solicitar su CUIL");

                
                int añoNacimiento;
                int añoActual;
                int edad1;

                
                System.out.print("Ingrese el año de nacimiento: ");
                añoNacimiento = teclado.nextInt();

                System.out.print("Ingrese el año actual: ");
                añoActual = teclado.nextInt();

                
                edad1 = añoActual - añoNacimiento;

               
                if (edad1 > 17) {
                    System.out.println("Debe solicitar su CUIL");
                } else {
                    System.out.println("No debe solicitar su CUIL aún");
                }
                break;
                case 10:
                //Comparar edades de dos hermanos y mostrar quién es mayor y la diferencia
                System.out.println("Ejercicio 10: Comparar edades de dos hermanos");

                int edadPrimerHermano;
                int edadSegundoHermano;
                int diferenciaEdad;

                System.out.print("Ingrese la edad del primer hermano: ");
                edadPrimerHermano = teclado.nextInt();

                System.out.print("Ingrese la edad del segundo hermano: ");
                edadSegundoHermano = teclado.nextInt();

                if (edadPrimerHermano > edadSegundoHermano) {
                    diferenciaEdad = edadPrimerHermano - edadSegundoHermano;
                    System.out.println("El primer hermano es el mayor por " + diferenciaEdad + " año(s).");
                } else if (edadSegundoHermano > edadPrimerHermano) {
                    diferenciaEdad = edadSegundoHermano - edadPrimerHermano;
                    System.out.println("El segundo hermano es el mayor por " + diferenciaEdad + " año(s).");
                } else {
                 System.out.println("Ambos hermanos tienen la misma edad.");
                }

                break;

                case 11:
                //Cálculo de producción semanal y evaluación de incentivos
                System.out.println("Ejercicio 11: Evaluación de incentivos por producción semanal");

                int produccionLunes;
                int produccionMartes;
                int produccionMiercoles;
                int produccionJueves;
                int produccionViernes;
                int produccionSabado;
                int produccionTotal;
                double produccionPromedio;
                String mensaje;

                System.out.print("Ingrese la producción del día Lunes: ");
                produccionLunes = teclado.nextInt();

                System.out.print("Ingrese la producción del día Martes: ");
                produccionMartes = teclado.nextInt();

                System.out.print("Ingrese la producción del día Miércoles: ");
                produccionMiercoles = teclado.nextInt();

                System.out.print("Ingrese la producción del día Jueves: ");
                produccionJueves = teclado.nextInt();

                System.out.print("Ingrese la producción del día Viernes: ");
                produccionViernes = teclado.nextInt();

                System.out.print("Ingrese la producción del día Sábado: ");
                produccionSabado = teclado.nextInt();

                produccionTotal = produccionLunes + produccionMartes + produccionMiercoles + produccionJueves + produccionViernes + produccionSabado;
                produccionPromedio = produccionTotal / 6.0;

                if (produccionPromedio >= 100) {
                    mensaje = "Recibirá Incentivos";
                } else {
                    mensaje = "No Recibirá Incentivos";
                }

                System.out.println("Producción total: " + produccionTotal);
                System.out.println("Promedio de producción diaria: " + produccionPromedio);
                System.out.println(mensaje);
                break;

                case 12:
                //Determinar el número mayor entre tres números enteros
                System.out.println("Ejercicio 12: Determinar el número mayor entre tres enteros");

                int primerNumero;
                int segundoNumero;
                int tercerNumero;
                int numeroMayor;

                System.out.print("Ingrese el primer número entero: ");
                primerNumero = teclado.nextInt();

                System.out.print("Ingrese el segundo número entero: ");
                segundoNumero = teclado.nextInt();

                System.out.print("Ingrese el tercer número entero: ");
                tercerNumero = teclado.nextInt();

                if (primerNumero > segundoNumero && primerNumero > tercerNumero) {
                    numeroMayor = primerNumero;
                } else if (segundoNumero > tercerNumero) {
                 numeroMayor = segundoNumero;
                } else {
                    numeroMayor = tercerNumero;
                }

                System.out.println("El número mayor es: " + numeroMayor);
                break;

                case 13:
                //Determinar el tipo de triángulo según sus lados
                System.out.println("Ejercicio 13: Determinar el tipo de triángulo");

                int primerLado;
                int segundoLado;
                int tercerLado;
                String tipoTriangulo;

                System.out.print("Ingrese la longitud del primer lado: ");
                primerLado = teclado.nextInt();

                System.out.print("Ingrese la longitud del segundo lado: ");
                segundoLado = teclado.nextInt();

                System.out.print("Ingrese la longitud del tercer lado: ");
                tercerLado = teclado.nextInt();

                if (primerLado != segundoLado && segundoLado != tercerLado && tercerLado != primerLado) {
                    tipoTriangulo = "Escaleno";
                } else if (primerLado == segundoLado && segundoLado == tercerLado) {
                    tipoTriangulo = "Equilátero";
                } else {
                    tipoTriangulo = "Isósceles";
                }

                System.out.println("El triángulo es: " + tipoTriangulo);
                break;

                
                case 14:
                //Convertir número del 1 al 10 a número romano
                System.out.println("Ejercicio 14: Conversión de número entero a número romano (1 al 10)");

                int numeroEntero;
                String equivalenteRomano;

                System.out.print("Ingrese un número entero del 1 al 10: ");
                numeroEntero = teclado.nextInt();
            
                switch (numeroEntero) {
                    case 1:
                        equivalenteRomano = "I";
                        break;
                    case 2:
                        equivalenteRomano = "II";
                        break;
                    case 3:
                        equivalenteRomano = "III";
                    break;
                    case 4:
                        equivalenteRomano = "IV";
                        break;
                    case 5:
                                    equivalenteRomano = "V";
                        break;
                    case 6:
                        equivalenteRomano = "VI";
                        break;
                    case 7:
                        equivalenteRomano = "VII";
                        break;
                    case 8:
                        equivalenteRomano = "VIII";
                        break;
                    case 9:
                        equivalenteRomano = "IX";
                        break;
                    case 10:
                        equivalenteRomano = "X";
                        break;
                    default:
                        equivalenteRomano = "Número fuera de rango (1-10)";
                }

                     System.out.println("Equivalente en número romano: " + equivalenteRomano);
                     break;

                     case 15:
                    //Calcular total de bonificación según monto de venta
                    System.out.println("Ejercicio 15: Calcular bonificación según monto de venta");

                    double montoVenta;
                    double totalBonificacion;

                    System.out.print("Ingrese el monto de venta: ");
                    montoVenta = teclado.nextDouble();

                    if (montoVenta >= 0 && montoVenta < 1000) {
                        totalBonificacion = (0 * montoVenta) / 100;
                    }                 else if (montoVenta >= 1000 && montoVenta < 5000) {
                        totalBonificacion = (3 * montoVenta) / 100;
                    } else if (montoVenta >= 5000 && montoVenta < 20000) {
                        totalBonificacion = (5 * montoVenta) / 100;
                    } else if (montoVenta >= 20000) {
                        totalBonificacion = (8 * montoVenta) / 100;
                    } else {
                        System.out.println("Monto de venta inválido.");
                        break;
                    }

                    System.out.println("Total de bonificación: " + totalBonificacion);
                    break;

                    case 16:
                    //Obtener vocal según número entero
                    System.out.println("Ejercicio 16: Conversión de número a vocal");

                    int numeroE;
                    String vocal;

                    System.out.print("Ingrese un número entero del 1 al 5: ");
                    numeroE = teclado.nextInt();

                    switch (numeroE) {
                        case 1:
                            vocal = "A";
                             break;
                        case 2:
                             vocal = "E";
                             break;
                         case 3:
                            vocal = "I";
                             break;
                        case 4:
                            vocal = "O";
                             break;
                        case 5:
                             vocal = "U";
                            break;
                        default:
                            vocal = "Valor Incorrecto";
                     }

                    System.out.println("Vocal: " + vocal);
                    break;

                    case 17:
                    // Obtener decenas y unidades de un número entero de 2 dígitos
                    System.out.println("Ejercicio 17: Descomposición en decenas y unidades");

                    int numeroEntero3;
                    int cociente;
                    int residuo;
                    int decenas;
                    int unidades;

                    System.out.print("Ingrese un número entero de 2 dígitos: ");
                    numeroEntero3 = teclado.nextInt();

                    // Validar que el número tenga dos dígitos
                    if (numeroEntero3 >= 10 && numeroEntero3 <= 99) {
                        cociente = numeroEntero3 / 10;
                        residuo = numeroEntero3 % 10;

                        decenas = cociente;
                        unidades = residuo;

                        System.out.println("Número de decenas: " + decenas);
                        System.out.println("Número de unidades: " + unidades);
                    } else {
                        System.out.println("Número incorrecto, debe ser de 2 dígitos.");
                    }
                    break;

                    case 18:
                    //Determinar si un número es par o impar
                    System.out.println("Ejercicio 18: Verificar si un número es par o impar");

                    int numeroEntero4;
                    int cociente1;
                    int residuo1;
                    String mensaje1;

                    System.out.print("Ingrese un número entero: ");
                    numeroEntero4 = teclado.nextInt();

                    cociente1 = numeroEntero4 / 2;
                    residuo1 = numeroEntero4 - (cociente1 * 2);

                    if (residuo1 == 0) {
                        mensaje1 = "Es Par";
                    } else {
                       mensaje1 = "Es Impar";
                    }

                    System.out.println(mensaje1);
                    break;
                    case 19:
                    //Imprimir números pares empezando desde 2, 5 números en total
                    System.out.println("Ejercicio 19: Secuencia de números pares");

                    int N = 2;
                    int K;

                    System.out.println(N); // Escribir N inicial

                    for (K = 1; K <= 4; K++) {
                        N = N + 2;
                        System.out.println(N);
                    }
                    break;

                    case 20:
                    //Calcular sueldo promedio de empleados
                    System.out.println("Ejercicio 20: Cálculo de sueldo promedio");

                    int numeroEmpleados;
                    int contador;
                    double sueldoEmpleado;
                    double sumaSueldos = 0;
                    double sueldoPromedio;

                    System.out.print("Ingrese el número de empleados: ");
                    numeroEmpleados = teclado.nextInt();

                 for (contador = 1; contador <= numeroEmpleados; contador++) {
                    System.out.print("Ingrese el sueldo del empleado " + contador + ": ");
                        sueldoEmpleado = teclado.nextDouble();
                        sumaSueldos += sueldoEmpleado;
                    }

                 if (numeroEmpleados > 0) {
                     sueldoPromedio = sumaSueldos / numeroEmpleados;
                        System.out.println("Sueldo promedio: " + sueldoPromedio);
                 } else {
                     System.out.println("Número de empleados inválido.");
                 }

                    break;

        }

        } while (opcion != 0);
        teclado.close();
    }
}