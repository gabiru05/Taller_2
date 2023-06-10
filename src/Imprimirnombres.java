public class Imprimirnombres {
    // Método para imprimir los nombres de los usuarios creados
    public static void ImprimirNombres (Estudiante[] estudiantes, int cantidadEstudiantes) {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println(estudiantes[i].nombre);
        }
    }
}