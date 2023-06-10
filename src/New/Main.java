package New;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 900);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void animacion(String text) {

        for (int ix = 0; ix < text.length(); ix++) {
            System.out.print(text.charAt(ix));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        /* Separador de linea */
        System.out.println("  ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        GestorDeEstudiantes gestorDeEstudiantes = new GestorDeEstudiantes();
        while (true) {
            animacion("1. Actualizar contraseña de usuario");
            animacion("2. Imprimir total de calificaciones y promedio final de un usuario");
            animacion("3. Ingresar nuevo usuario");
            animacion("4. Imprimir nombres de usuarios creados");
            animacion("5. Salir");
            animacion("Ingrese su elección: ");
            int eleccion;
            try {
                eleccion = Integer.parseInt(lector.readLine());
            } catch (Exception e) {
                eleccion = -1;
            }
            if (eleccion == 1) {
                gestorDeEstudiantes.actualizarContraseña(lector);
            } else if (eleccion == 2) {
                gestorDeEstudiantes.imprimirTotalCalificacionesYPromedioFinal(lector);
            } else if (eleccion == 3) {
                gestorDeEstudiantes.ingresarNuevoUsuario(lector);
            } else if (eleccion == 4) {
                gestorDeEstudiantes.imprimirNombresDeUsuariosCreados();
            } else if (eleccion == 5) {
                break;
            } else {
                System.out.println("Elección inválida.");
            }
        }
    }
}