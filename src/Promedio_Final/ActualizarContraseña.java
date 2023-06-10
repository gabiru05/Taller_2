//Gabriel Ruiz, Jonathan Reyes, Keneth Benavidez.
package Promedio_Final;

import java.io.BufferedReader;
import java.io.IOException;

public class ActualizarContraseña {
    // Método para actualizar la contraseña de un usuario
    public static void actualizarContraseña(Estudiante[] estudiantes, int cantidadEstudiantes, BufferedReader lector)
            throws IOException {

        // primero seleccionar usuario y verificarlo
        Utilidades.animarTexto("Ingrese el nombre de usuario: ");
        String nombre = lector.readLine();
        Estudiante estudiante = buscarEstudiantePorNombre(estudiantes, cantidadEstudiantes, nombre);

        // luego proceder con la verificación y cambio de contraseña
        if (estudiante != null) {
            Utilidades.animarTexto("Ingrese la contraseña actual: ");
            String contraseñaActual = lector.readLine();

            if (estudiante.contraseña.equals(contraseñaActual)) {
                Utilidades.animarTexto("Ingrese la nueva contraseña: ");
                String nuevaContraseña = lector.readLine();
                estudiante.contraseña = nuevaContraseña;
                System.out.println("Contraseña actualizada con éxito.");
            } else {
                System.out.println("Contraseña actual incorrecta.");
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
        return null;
    }
}