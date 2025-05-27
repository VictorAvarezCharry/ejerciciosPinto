import java.util.Scanner;

public class Quince {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Variables comunes para los ejercicios
        int n, m;
        int[] vector;
        String cadena, C;
        long comparaciones;

        do {
            System.out.println("\nSeleccione ejercicio (1-15), 0 para salir:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ejercicio 1:");
                    System.out.println("Si f(n),g(n) ∈ Θ(h(n)) y ∀n≥n0 f(n)≥g(n)≥0,");
                    System.out.println("entonces f(n)-g(n) ∈ O(h(n)) (pero no necesariamente Θ(h(n))).");
                    break;

                case 2:
                    System.out.println("Ejercicio 2:");
                    System.out.println("Para a,b > 1, log_a n ∈ Θ(log_b n) porque:");
                    System.out.println("log_a n = (log_b n) / (log_b a),");
                    System.out.println("una constante multiplicativa.");
                    System.out.println("Sin embargo, 2^(log_a n) no es Θ(2^(log_b n)) si a ≠ b,");
                    System.out.println("porque 2^(log_a n) = n^{log_a 2} y 2^(log_b n) = n^{log_b 2},");
                    System.out.println("que son diferentes potencias de n.");
                    break;

                case 3:
                    System.out.println("Ejercicio 3:");
                    System.out.println("(a) Si O(f(n))=O(h(n)) ⇒ O(log f(n))=O(log h(n)) es cierto.");
                    System.out.println("(b) La inversa no siempre es cierta: O(log f(n))=O(log h(n)) no implica O(f(n))=O(h(n)).");
                    break;

                case 4:
                    System.out.println("Ejercicio 4:");
                    System.out.println("El número de líneas t(n) satisface:");
                    System.out.println("t(n) = sum_{i=1}^n i + 4*t(n/2) para n>0, y t(0)=0.");
                    System.out.println("La suma de 1 a n es n(n+1)/2 = Θ(n^2).");
                    System.out.println("Resolviendo la recurrencia, t(n) ∈ Θ(n^2).");
                    break;

                case 5:
                    System.out.println("Ejercicio 5:");
                    System.out.print("Ingrese un entero positivo n: ");
                    n = sc.nextInt();
                    int suma = 0;
                    boolean esTriangular = false;
                    for (int i = 1; i <= n; i++) {
                        suma += i;
                        if (suma == n) {
                            esTriangular = true;
                            break;
                        } else if (suma > n) {
                            break;
                        }
                    }
                    System.out.println("¿El número " + n + " es triangular? " + esTriangular);
                    System.out.println("Complejidad: O(n), espacio extra constante.");
                    break;

                case 6:
                    System.out.println("Ejercicio 6:");
                    System.out.print("Ingrese complejidad (1=n, 2=n^2, 3=10^n): ");
                    int comp = sc.nextInt();
                    n = 1_000_000;
                    System.out.println("Con 1 hora se procesa tamaño máximo: " + n);
                    System.out.println("Con 3 horas:");
                    switch (comp) {
                        case 1:
                            System.out.println("T(n) = k*n: nuevo n = 3*n = " + (3L * n));
                            break;
                        case 2:
                            System.out.println("T(n) = k*n^2: nuevo n = sqrt(3)*n = " + (int)(Math.sqrt(3)*n));
                            break;
                        case 3:
                            System.out.println("T(n) = k*10^n: nuevo n = n + log10(3) ≈ " + (n + (int)(Math.log10(3))));
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;

                case 7:
                    System.out.println("Ejercicio 7:");
                    System.out.print("Ingrese complejidad (1=n, 2=n^2, 3=10^n): ");
                    comp = sc.nextInt();
                    n = 1_000_000;
                    System.out.println("Con máquina 100 veces más rápida:");
                    switch (comp) {
                        case 1:
                            System.out.println("T(n)=k*n: nuevo n=100*n=" + (100L * n));
                            break;
                        case 2:
                            System.out.println("T(n)=k*n^2: nuevo n = sqrt(100)*n= " + (10L * n));
                            break;
                        case 3:
                            System.out.println("T(n)=k*10^n: nuevo n = n + log10(100) = " + (n + 2));
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;

                case 8:
                    System.out.println("Ejercicio 8:");
                    System.out.print("Ingrese tamaño del vector n: ");
                    n = sc.nextInt();
                    vector = new int[n];
                    System.out.println("Ingrese los elementos:");
                    for (int i = 0; i < n; i++) vector[i] = sc.nextInt();
                    int max, min;
                    int comparaciones8 = 0;
                    if (n % 2 == 0) {
                        comparaciones8++;
                        if (vector[0] > vector[1]) {
                            max = vector[0];
                            min = vector[1];
                        } else {
                            max = vector[1];
                            min = vector[0];
                        }
                        int i = 2;
                        while (i < n) {
                            comparaciones8++; // comparación para decidir max y min en par
                            int localMax, localMin;
                            if (vector[i] > vector[i+1]) {
                                localMax = vector[i];
                                localMin = vector[i+1];
                            } else {
                                localMax = vector[i+1];
                                localMin = vector[i];
                            }
                            comparaciones8++; // comparar localMax con max
                            if (localMax > max) max = localMax;
                            comparaciones8++; // comparar localMin con min
                            if (localMin < min) min = localMin;
                            i += 2;
                        }
                    } else {
                        max = min = vector[0];
                        int i = 1;
                        while (i < n) {
                            if (i + 1 < n) {
                                comparaciones8++;
                                int localMax, localMin;
                                if (vector[i] > vector[i+1]) {
                                    localMax = vector[i];
                                    localMin = vector[i+1];
                                } else {
                                    localMax = vector[i+1];
                                    localMin = vector[i];
                                }
                                comparaciones8++;
                                if (localMax > max) max = localMax;
                                comparaciones8++;
                                if (localMin < min) min = localMin;
                                i += 2;
                            } else {
                                comparaciones8++;
                                if (vector[i] > max) max = vector[i];
                                comparaciones8++;
                                if (vector[i] < min) min = vector[i];
                                i++;
                            }
                        }
                    }
                    System.out.println("Máximo: " + max);
                    System.out.println("Mínimo: " + min);
                    System.out.println("Comparaciones realizadas: " + comparaciones8);
                    System.out.println("Número de comparaciones < 3n/2: " + (3*n/2));
                    break;

                case 9:
                    System.out.println("Ejercicio 9:");
                    System.out.println("Ecuación de recurrencia:");
                    System.out.println("T(1) = a");
                    System.out.println("T(n) = 2 T(n/4) + log n");
                    System.out.println("Por el Teorema Maestro: a=2, b=4, f(n)=log n");
                    System.out.println("log_b a = log_4 2 = 1/2");
                    System.out.println("f(n) = O(n^c) con c=0 < 1/2,");
                    System.out.println("por lo que T(n) = Θ(n^{1/2}) = Θ(√n)");
                    break;

                case 10:
                    System.out.println("Ejercicio 10:");
                    System.out.print("Ingrese n (positivo): ");
                    n = sc.nextInt();
                    System.out.print("Ingrese m (positivo): ");
                    m = sc.nextInt();

                    // (a)
                    long parcial = 1;
                    for (int i = 2; i <= n; i++) {
                        parcial = 2 * parcial;
                    }
                    long total = 1;
                    for (int i = 2; i <= n; i++) {
                        total += 2 * parcial; // parcial(m-1) asumiendo parámetro i
                    }
                    System.out.println("(a) total(n) ≈ " + total);

                    // (b)
                    total = m;
                    int mm = m;
                    for (int i = 2; i <= n; i++) {
                        mm *= 2;
                        total += mm;
                    }
                    System.out.println("(b) total(n,m) ≈ " + total);
                    break;

                case 11:
                    System.out.println("Ejercicio 11:");
                    sc.nextLine(); // limpiar buffer
                    System.out.print("Ingrese string A: ");
                    String A = sc.nextLine();
                    System.out.print("Ingrese string B: ");
                    String B = sc.nextLine();

                    int N = A.length();
                    int M = B.length();
                    int limite = N - M + 1;
                    boolean encontrado = false;
                    int comparaciones11 = 0;
                    int comienzo = 0;
                    for (int com = 0; com < limite && !encontrado; com++) {
                        int i = com;
                        int j = 0;
                        while (j < M && A.charAt(i) == B.charAt(j)) {
                            comparaciones11++;
                            i++;
                            j++;
                        }
                        if (j == M) {
                            encontrado = true;
                            comienzo = com;
                        } else if (j > 0) {
                            comparaciones11++;
                        }
                    }
                    if (encontrado) {
                        System.out.println("Encontrado en índice: " + comienzo);
                    } else {
                        System.out.println("No encontrado");
                    }
                    System.out.println("Comparaciones en peor caso: " + comparaciones11);
                    break;

                case 12:
                    System.out.println("Ejercicio 12:");
                    System.out.print("Ingrese n (tamaño del vector, múltiplo de 2): ");
                    n = sc.nextInt();
                    System.out.println("Dividiendo el vector en n/2 pares, fusionando n/2 secuencias.");
                    System.out.println("Tiempo para dividir: 0 (simple división en pares).");
                    System.out.println("Tiempo para fusionar n/2 secuencias: Θ(n).");
                    System.out.println("Recurrencia: T(n) = 2 T(n/2) + Θ(n), por lo que T(n) ∈ Θ(n log n).");
                    break;

                case 13:
                    System.out.println("Ejercicio 13:");
                    System.out.println("Ingrese cadena C (solo 'a' y 'b'):");
                    sc.nextLine(); // limpiar buffer
                    C = sc.nextLine();

                    int izquierda = 0;
                    int derecha = C.length() - 1;
                    boolean esPalindromo = true;
                    int comparacionesPal = 0;

                    while (izquierda < derecha) {
                        comparacionesPal++;
                        if (C.charAt(izquierda) != C.charAt(derecha)) {
                            esPalindromo = false;
                            break;
                        }
                        izquierda++;
                        derecha--;
                    }

                    System.out.println("¿Es palíndromo? " + esPalindromo);
                    System.out.println("Número de comparaciones realizadas: " + comparacionesPal);
                    break;

                case 14:
                    System.out.println("Ejercicio 14:");
                    System.out.println("Algoritmo trivial: t(n) ∈ Θ(n^2).");
                    System.out.println("Divide y vencerás:");
                    System.out.println("Divide en 2 subproblemas de tamaño n/2,");
                    System.out.println("Divide y combina con n log n operaciones.");
                    System.out.println("Recurrencia: T(n) = 2T(n/2) + n log n.");
                    System.out.println("Según Master, T(n) ∈ Θ(n log^2 n), que es mejor que n^2.");
                    System.out.println("Por tanto, la estrategia Divide y Vencerás es más eficiente.");
                    break;

                case 15:
                    System.out.println("Ejercicio 15:");
                    System.out.print("Ingrese tamaño del vector n: ");
                    n = sc.nextInt();
                    vector = new int[n];
                    System.out.println("Ingrese los elementos:");
                    for (int i = 0; i < n; i++) vector[i] = sc.nextInt();

                    int comparaciones15 = 0;
                    int maxVal, minVal;
                    if (vector[0] > vector[1]) {
                        maxVal = vector[0];
                        minVal = vector[1];
                    } else {
                        maxVal = vector[1];
                        minVal = vector[0];
                    }
                    comparaciones15++; // 1 comparación

                    for (int i = 2; i < n; i++) {
                        comparaciones15++;
                        if (vector[i] > maxVal) maxVal = vector[i];
                        else {
                            comparaciones15++;
                            if (vector[i] < minVal) minVal = vector[i];
                        }
                    }
                    System.out.println("Máximo: " + maxVal);
                    System.out.println("Mínimo: " + minVal);
                    System.out.println("Comparaciones realizadas: " + comparaciones15);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
