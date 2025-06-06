import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Contacto[] contactos = new Contacto[10]; 
        int numContactos = 0; 

        int opcion;

        do {
            System.out.println(" AGENDA ");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Editar contacto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // limpiar el buffer

            switch (opcion) {
                case 1:
                    if (numContactos >= contactos.length) {
                        System.out.println("Agenda llena, no se pueden agregar mas contactos");
                        break;
                    }
                    System.out.print("Ingrese el nombre: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Ingrese el teléfono: ");
                    String telefono = teclado.nextLine();
                    System.out.print("Ingrese el email: ");
                    String email = teclado.nextLine();
                    System.out.print("Ingrese la calle: ");
                    String calle = teclado.nextLine();
                    System.out.print("Ingrese la ciudad: ");
                    String ciudad = teclado.nextLine();
                    System.out.print("Ingrese el país: ");
                    String pais = teclado.nextLine();
                    System.out.print("Ingrese el año de nacimiento: ");
                    int anioNacimiento = teclado.nextInt();
                    teclado.nextLine(); // limpiar el buffer

                    Contacto nuevo = new Contacto(
                        nombre,
                        new Telefono(telefono),
                        new Correo(email),
                        new Direccion(calle, ciudad, pais),
                        new FechaDeNacimiento(anioNacimiento)
                    );
                    contactos[numContactos] = nuevo;
                    numContactos++;

                    System.out.println("Contacto agregado");
                    break;

                case 2:
                    System.out.println("Lista de contactos");
                    if (numContactos == 0) {
                        System.out.println("No hay contactos.");
                    } else {
                        for (int i = 0; i < numContactos; i++) {
                            contactos[i].mostrarContacto();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = teclado.nextLine();

                    boolean eliminado = false;
                    for (int i = 0; i < numContactos; i++) {
                        if (contactos[i].getNombre().equalsIgnoreCase(nombreEliminar)) {
                            for (int j = i; j < numContactos - 1; j++) {
                                contactos[j] = contactos[j + 1];
                            }
                            contactos[numContactos - 1] = null;
                            numContactos--;
                            eliminado = true;
                            System.out.println("Contacto eliminado");
                            break;
                        }
                    }
                    if (!eliminado) {
                        System.out.println("Contacto no encontrado");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del contacto a editar: ");
                    String nombreEditar = teclado.nextLine();

                    boolean encontrado = false;
                    for (int i = 0; i < numContactos; i++) {
                        if (contactos[i].getNombre().equalsIgnoreCase(nombreEditar)) {
                            System.out.print("Nuevo nombre (deje en blanco para mantener " + contactos[i].getNombre() + "): ");
                            String nuevoNombre = teclado.nextLine();
                            if (!nuevoNombre.isEmpty()) contactos[i].setNombre(nuevoNombre);

                            System.out.print("Nuevo teléfono (deje en blanco para mantener " + contactos[i].getTelefono().getNumero() + "): ");
                            String nuevoTelefono = teclado.nextLine();
                            if (!nuevoTelefono.isEmpty()) contactos[i].setTelefono(new Telefono(nuevoTelefono));

                            System.out.print("Nuevo email (deje en blanco para mantener " + contactos[i].getEmail().getDireccionCorreo() + "): ");
                            String nuevoEmail = teclado.nextLine();
                            if (!nuevoEmail.isEmpty()) contactos[i].setEmail(new Correo(nuevoEmail));

                            System.out.print("Nueva calle (deje en blanco para mantener " + contactos[i].getDireccion().getCalle() + "): ");
                            String nuevaCalle = teclado.nextLine();
                            if (!nuevaCalle.isEmpty()) contactos[i].getDireccion().setCalle(nuevaCalle);

                            System.out.print("Nueva ciudad (deje en blanco para mantener " + contactos[i].getDireccion().getCiudad() + "): ");
                            String nuevaCiudad = teclado.nextLine();
                            if (!nuevaCiudad.isEmpty()) contactos[i].getDireccion().setCiudad(nuevaCiudad);

                            System.out.print("Nuevo país (deje en blanco para mantener " + contactos[i].getDireccion().getPais() + "): ");
                            String nuevoPais = teclado.nextLine();
                            if (!nuevoPais.isEmpty()) contactos[i].getDireccion().setPais(nuevoPais);

                            System.out.print("Nuevo año de nacimiento (ingrese 0 para mantener " + contactos[i].getFechaDeNacimiento().getAnio() + "): ");
                            int nuevoAnio = teclado.nextInt();
                            teclado.nextLine(); // limpiar el buffer
                            if (nuevoAnio != 0) contactos[i].setFechaDeNacimiento(new FechaDeNacimiento(nuevoAnio));

                            System.out.println("Contacto actualizado");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contacto no encontrado");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo de la agenda");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 5);

        teclado.close();
    }
}