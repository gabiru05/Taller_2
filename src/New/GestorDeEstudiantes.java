package New;

import java.io.BufferedReader;
import java.io.IOException;

public class GestorDeEstudiantes {
    Estudiante[] estudiantes = new Estudiante[5];
    int cantidadEstudiantes = 0;

    // Método para actualizar la contraseña de un usuario
    public void actualizarContraseña(BufferedReader lector) throws IOException {
        System.out.print("Ingrese el nombre de usuario: ");
        String nombre = lector.readLine();
        Estudiante estudiante = buscarEstudiantePorNombre(nombre);
        if (estudiante != null) {
            System.out.print("Ingrese la contraseña actual: ");
            String contraseñaActual = lector.readLine();
            System.out.print("Ingrese la nueva contraseña: ");
            String nuevaContraseña = lector.readLine();
            estudiante.actualizarContraseña(contraseñaActual, nuevaContraseña);
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    // Método para imprimir el total de calificaciones y el promedio final de un
    // usuario
    public void imprimirTotalCalificacionesYPromedioFinal(BufferedReader lector) throws IOException {
        System.out.print("Ingrese el nombre de usuario: ");
        String nombre = lector.readLine();
        Estudiante estudiante = buscarEstudiantePorNombre(nombre);
        if (estudiante != null) {
            System.out.print("Ingrese la contraseña: ");
            String contraseñaIngresada = lector.readLine();
            estudiante.imprimirTotalCalificacionesYPromedioFinal(contraseñaIngresada);
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    // Método para ingresar un nuevo usuario
    public void ingresarNuevoUsuario(BufferedReader lector) throws IOException {
        if (cantidadEstudiantes < 5) {
            while (true) {
                System.out.print("Ingrese el nombre de usuario: ");
                String nombre = lector.readLine();
                if (!nombre.isEmpty()) {
                    while (true) {
                        System.out.print("Ingrese la contraseña: ");
                        String contraseña = lector.readLine();
                        if (!contraseña.isEmpty()) {
                            double[] calificaciones = new double[5];
                            for (int i = 0; i < 5; i++) {
                                while (true) {
                                    try {
                                        System.out.print("Ingrese la calificación " + (i + 1) + ": ");
                                        calificaciones[i] = Double.parseDouble(lector.readLine());
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

    // Método para imprimir los nombres de los usuarios creados
    public void imprimirNombresDeUsuariosCreados() {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println(estudiantes[i].nombre);
        }
    }

    // Método para buscar un estudiante por su nombre
    private Estudiante buscarEstudiantePorNombre(String nombre) {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].nombre.equals(nombre)) {
                return estudiantes[i];
            }
        }
        return null;
    }
}