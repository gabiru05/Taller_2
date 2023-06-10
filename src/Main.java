import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Estudiante[] estudiantes = new Estudiante[5];
    static int cantidadEstudiantes = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader lecuta = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("1. Actualizar contraseña de usuario");
            System.out.println("2. Imprimir total de calificaciones y promedio final de un usuario");
            System.out.println("3. Ingresar nuevo usuario");
            System.out.println("4. Imprimir nombres de usuarios creados");
            System.out.println("5. Salir");
            System.out.print("Ingrese su elección: ");
            int eleccion;
            try {
                eleccion = Integer.parseInt(lecuta.readLine());
            } catch (Exception e) {
                eleccion = -1;
            }
            if (eleccion == 1) {
                ActualizarContraseña.actualizarContraseña(estudiantes, cantidadEstudiantes, lecuta);
            } else if (eleccion == 2) {
                print_notas_prom.notas(estudiantes,
                        cantidadEstudiantes, lecuta);
            } else if (eleccion == 3) {
                IngresarNuevoUsuario.ingresarNuevoUsuario(estudiantes, cantidadEstudiantes, lecuta);
            } else if (eleccion == 4) {
                Imprimirnombres.ImprimirNombres(estudiantes, cantidadEstudiantes);
            } else if (eleccion == 5) {
                break;
            } else {
                System.out.println("Elección inválida.");
            }
        }
    }
}