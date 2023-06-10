package new2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        // Máximo de estudiantes, Datos del estudiante y toda su información
        Estudiante[] estudiantes = new Estudiante[5];
        int cantidadEstudiantes = 0;

        // Menu y seleccion de opción
        while (true) {
            Utilidades.animarTexto("1. Actualizar contraseña de usuario");
            Utilidades.animarTexto("2. Imprimir total de calificaciones y promedio final de un usuario");
            Utilidades.animarTexto("3. Ingresar nuevo usuario");
            Utilidades.animarTexto("4. Imprimir nombres de usuarios creados");
            Utilidades.animarTexto("5. Salir");
            Utilidades.animarTexto("Ingrese su elección: ");
            int eleccion;

            try {
                eleccion = Integer.parseInt(lector.readLine());
            } catch (Exception e) {
                // Si entra en algun posible error lo dirigimos al > else
                eleccion = -1;
            }

            if (eleccion == 1) {
                ActualizarContraseña.actualizarContraseña(estudiantes, cantidadEstudiantes, lector);
                Utilidades.esperar(3);
                Utilidades.limpiarConsola();
            } else if (eleccion == 2) {
                ImprimirTotalCalificacionesYPromedioFinal.imprimirTotalCalificacionesYPromedioFinal(estudiantes,
                        cantidadEstudiantes, lector);
                Utilidades.esperar(3);
                Utilidades.limpiarConsola();
            } else if (eleccion == 3) {
                cantidadEstudiantes = IngresarNuevoUsuario.ingresarNuevoUsuario(estudiantes, cantidadEstudiantes,
                        lector);
                Utilidades.esperar(3);
                Utilidades.limpiarConsola();
            } else if (eleccion == 4) {
                ImprimirNombresDeUsuariosCreados.imprimirNombresDeUsuariosCreados(estudiantes, cantidadEstudiantes);
                Utilidades.esperar(3);
                Utilidades.limpiarConsola();
            } else if (eleccion == 5) {
                break;
            } else {
                System.out.println("Elección inválida.");
            }
        }
    }
}