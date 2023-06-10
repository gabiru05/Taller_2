import java.io.BufferedReader;
import java.io.IOException;

public class print_notas_prom {
    // Método para imprimir el total de calificaciones y el promedio final de un
    // usuario
    public static void print_Notas_prom(Estudiante[] estudiantes, int cantidadEstudiantes,
            BufferedReader lecuta) throws IOException {
        System.out.print("Ingrese el nombre de usuario: ");
        String nombre = lecuta.readLine();
        Estudiante estudiante = buscarEstudiantePorNombre(estudiantes, cantidadEstudiantes, nombre);
        if (estudiante != null) {
            System.out.print("Ingrese la contraseña: ");
            String contraseñaIngresada = lecuta.readLine();
            estudiante.notas(contraseñaIngresada);
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

    public static void notas(Estudiante[] estudiantes, int cantidadEstudiantes, BufferedReader lecuta) {
    }
}