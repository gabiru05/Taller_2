//Gabriel Ruiz, Jonathan Reyes, Keneth Benavidez.
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
            if (estudiante.contraseña.equals(contraseñaIngresada)) {
                double total = 0;
                for (double calificacion : estudiante.calificaciones) {
                    total += calificacion;
                }
                double promedio = total / estudiante.calificaciones.length;
                System.out.println("Total de calificaciones: " + total);
                System.out.println("Promedio final: " + promedio);
            } else {
                System.out.println("Contraseña incorrecta.");
            }
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