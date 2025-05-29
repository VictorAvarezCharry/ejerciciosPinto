public class once {

    // Función que busca si B está contenido en A y devuelve la posición de inicio (índice base 0)
    public static int buscarPatron(String texto, String patron) {
        int n = texto.length();
        int m = patron.length();
        int limite = n - m + 1;

        boolean encontrado = false;
        int posicionInicio = 0;

        int inicio = 0;

        while (!encontrado && inicio < limite) {
            int i = inicio;
            int j = 0;

            // Comparación carácter por carácter
            while (j < m && texto.charAt(i) == patron.charAt(j)) {
                i++;
                j++;
            }

            encontrado = (j == m); // Se encontró el patrón completo

            if (!encontrado) {
                inicio++;
            } else {
                posicionInicio = inicio;
            }
        }

        if (encontrado) {
            return posicionInicio; // Retorna la posición inicial donde se encontró el patrón
        } else {
            return -1; // Patrón no encontrado
        }
    }

    public static void main(String[] args) {
        String texto = "aaaaaaaab";
        String patron = "aaaab";

        int posicion = buscarPatron(texto, patron);
        if (posicion != -1) {
            System.out.println("Patrón encontrado en la posición: " + posicion);
        } else {
            System.out.println("Patrón no encontrado");
        }
    }
}
