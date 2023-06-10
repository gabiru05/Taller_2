//Gabriel Ruiz, Jonathan Reyes, Keneth Benavidez.
package Promedio_Final;

public class ImprimirNombresDeUsuariosCreados {
    // Método para imprimir los nombres de los usuarios creados
    public static void imprimirNombresDeUsuariosCreados(Estudiante[] estudiantes, int cantidadEstudiantes) {
        if (cantidadEstudiantes == 0) {
            System.out.println("Ningún estudiante ingresado.");
        } else {
            for (int i = 0; i < cantidadEstudiantes; i++) {
                System.out.println(estudiantes[i].nombre);
            }
        }
    }
}