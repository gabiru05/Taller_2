//Gabriel Ruiz, Jonathan Reyes, Keneth Benavidez.
package Promedio_Final;

import java.io.BufferedReader;
import java.io.IOException;


public class IngresarNuevoUsuario {
    // Método para ingresar un nuevo usuario y retornarlo
    public static int ingresarNuevoUsuario(Estudiante[] estudiantes, int cantidadEstudiantes, BufferedReader lector)
            throws IOException {
        if (cantidadEstudiantes < 5) {

            while (true) {
                Utilidades.animarTexto("Ingrese el nombre de usuario: ");
                String nombre = lector.readLine();

                // Controlamos el nombre no quede vacio
                if (!nombre.isEmpty()) {
                    while (true) {

                        Utilidades.animarTexto("Ingrese la contraseña: ");
                        String contraseña = lector.readLine();
                        if (!contraseña.isEmpty()) {

                            // Ingreso de las notas y controlamos los datos Ingresados
                            double[] calificaciones = new double[5];
                            for (int i = 0; i < 5; i++) {
                                while (true) {
                                    try {
                                        Utilidades.animarTexto("Ingrese la calificación " + (i + 1) + ": ");
                                        calificaciones[i] = Double.parseDouble(lector.readLine());
                                        if (calificaciones[i] < 1.0 || calificaciones[i] > 5.0) {
                                            // forzamos un error por no cumplir condiciones
                                            throw new Exception();
                                        }
                                        // Caso de estar todo bien cerramos ciclo y continuamos con siguiente nota
                                        break;
                                    } catch (Exception e) {
                                        System.out.println(
                                                "Calificación inválida. Ingrese una Nota entre 1.0 y 5.0.");
                                    }
                                }
                            }

                            estudiantes[cantidadEstudiantes++] = new Estudiante(nombre, contraseña, calificaciones);
                            System.out.println("Usuario creado con éxito.");
                            return cantidadEstudiantes;
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
        return cantidadEstudiantes;
    }
}