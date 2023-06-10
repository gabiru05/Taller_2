package new2;

import java.io.BufferedReader;
import java.io.IOException;



public class ImprimirTotalCalificacionesYPromedioFinal {
    // Método para imprimir el total de calificaciones y el promedio final de un
    // usuario

    public static void imprimirTotalCalificacionesYPromedioFinal(Estudiante[] estudiantes, int cantidadEstudiantes,
            BufferedReader lector) throws IOException {

        Utilidades.animarTexto("Ingrese el nombre de usuario: ");
        String nombre = lector.readLine();
        Estudiante estudiante = buscarEstudiantePorNombre(estudiantes, cantidadEstudiantes, nombre);

        if (estudiante != null) {
            Utilidades.animarTexto("Ingrese la contraseña: ");
            String contraseñaIngresada = lector.readLine();
            estudiante.imprimirTotalCalificacionesYPromedioFinal(contraseñaIngresada);
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    // Método para buscar un estudiante por su nombre
    private static Estudiante buscarEstudiantePorNombre(Estudiante[] estudiantes, int cantidadEstudiantes,
            String nombre) {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].nombre.equals(nombre)) {
                return estudiantes[i];
            }
        }
        // sino encuentra mandamos al > else "no encontrado"
        return null;
    }
}