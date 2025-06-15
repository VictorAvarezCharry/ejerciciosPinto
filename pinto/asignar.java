public class asignar {
  public static void asignarConductores(Vehiculo[] ambulancias, Conductor[] conductores) {
    int indiceConductor = 0;

    for (Vehiculo ambulancia : ambulancias) {
      
        while (indiceConductor < conductores.length && conductores[indiceConductor] == null) {
            indiceConductor++;
        }

        if (indiceConductor >= conductores.length) {
            System.out.println("No hay suficientes conductores para asignar a todas las ambulancias.");
            break;
        }

        ambulancia.asignarConductor(conductores[indiceConductor]);
        System.out.println("Conductor " + conductores[indiceConductor].nombre +
                           " asignado a ambulancia " + ambulancia.id);
        indiceConductor++;
    }
}


    public static void asignarCarroFunebre(Vehiculo carroFunebre, Conductor[] conductores) {
        carroFunebre.asignarConductor(conductores[conductores.length - 1]);
        System.out.println("Conductor " + carroFunebre.conductor.nombre + " asignado al carro fúnebre.");
    }
   
   
   
    public static void asignarPacientes(Vehiculo[] ambulancias, Paciente[] pacientes) {
    System.out.println("Asignando pacientes a ambulancias");
    int contador = 0;
    for (Paciente paciente : pacientes) {
        if (paciente != null && !paciente.fallecido) {
            Vehiculo ambulancia = ambulancias[contador % ambulancias.length];
            if (ambulancia.conductor != null) {
                System.out.println("Paciente " + paciente.nombre + " va en ambulancia " + ambulancia.id +
                        " con conductor " + ambulancia.conductor.nombre);
            } else {
                System.out.println("Paciente " + paciente.nombre + " va en ambulancia " + ambulancia.id +
                        " sin conductor asignado.");
            }
            contador++;
        }
    }
}


    public static void generarReportes(Vehiculo[] ambulancias, Vehiculo carroFunebre, Paciente[] pacientes) {
        System.out.println("REPORTE GENERAL");
        int contadorVivos = 0;
        
        System.out.println("--- PACIENTES ---");
        for (Paciente paciente : pacientes) {
            String estado = paciente.fallecido ? "FALLECIDO" : "VIVO";
            if (paciente.fallecido) {
                System.out.println("Paciente " + paciente.nombre + " " + paciente.apellido + 
                        " - Cédula: " + paciente.cedula + 
                        " - Estado: " + estado + 
                        " - Transportado por carro fúnebre (Conductor: " + carroFunebre.conductor.nombre + ")");
            } else {
                Vehiculo ambulancia = ambulancias[contadorVivos % ambulancias.length];
                System.out.println("Paciente " + paciente.nombre + " " + paciente.apellido + 
                        " - Cédula: " + paciente.cedula + 
                        " - Estado: " + estado + 
                        " - Transportado por ambulancia " + ambulancia.id + " (Conductor: " + ambulancia.conductor.nombre + ")");
                contadorVivos++;
            }
        }
        
        System.out.println("VEHÍCULOS ");
        for (Vehiculo ambulancia : ambulancias) {
            System.out.println("Ambulancia " + ambulancia.id + 
                    " - Conductor asignado: " + ambulancia.conductor.nombre + " " + ambulancia.conductor.apellido);
        }
        
        System.out.println("Carro fúnebre - Conductor asignado: " + 
                carroFunebre.conductor.nombre + " " + carroFunebre.conductor.apellido);
    }
}
