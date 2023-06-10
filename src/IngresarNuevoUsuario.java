import java.io.BufferedReader;
import java.io.IOException;

public class IngresarNuevoUsuario {
    // Método para ingresar un nuevo usuario
    public static void ingresarNuevoUsuario(Estudiante[] estudiantes, int cantidadEstudiantes, BufferedReader lecuta)
            throws IOException {
        if (cantidadEstudiantes < 5) {
            while (true) {
                System.out.print("Ingrese el nombre de usuario: ");
                String nombre = lecuta.readLine();
                if (!nombre.isEmpty()) {
                    while (true) {
                        System.out.print("Ingrese la contraseña: ");
                        String contraseña = lecuta.readLine();
                        if (!contraseña.isEmpty()) {
                            double[] calificaciones = new double[5];
                            for (int i = 0; i < 5; i++) {
                                while (true) {
                                    try {
                                        System.out.print("Ingrese la calificación " + (i + 1) + ": ");
                                        calificaciones[i] = Double.parseDouble(lecuta.readLine());
                                        if (calificaciones[i] < 1.0 || calificaciones[i] > 5.0) {
                                            throw new Exception();
                                        }
                                        break;
                                    } catch (Exception e) {
                                        System.out.println(
                                                "Calificación inválida. Por favor, ingrese un número entre 1.0 y 5.0.");
                                    }
                                }
                            }
                            estudiantes[cantidadEstudiantes++] = new Estudiante(nombre, contraseña, calificaciones);
                            System.out.println("Usuario creado con éxito.");
                            return;
                        } else {
                            System.out.println("La contraseña no puede estar vacía.");
                        }
                    }
                } else {
                    System.out.println("El nombre de usuario no puede estar vacío.");
                }
            }
        } else {
            System.out.println("Se ha alcanzado el número máximo de usuarios.");
        }
    }
}