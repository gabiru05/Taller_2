package New;

public class Estudiante {
    String nombre;
    String contraseña;
    double[] calificaciones = new double[5];

    public Estudiante(String nombre, String contraseña, double[] calificaciones) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.calificaciones = calificaciones;
    }

    // Método para actualizar la contraseña del usuario
    public void actualizarContraseña(String contraseñaActual, String nuevaContraseña) {
        if (this.contraseña.equals(contraseñaActual)) {
            this.contraseña = nuevaContraseña;
            System.out.println("Contraseña actualizada con éxito.");
        } else {
            System.out.println("Contraseña actual incorrecta.");
        }
    }

    // Método para imprimir el total de calificaciones y el promedio final de un
    // usuario
    public void imprimirTotalCalificacionesYPromedioFinal(String contraseñaIngresada) {
        if (this.contraseña.equals(contraseñaIngresada)) {
            double total = 0;
            for (double calificacion : calificaciones) {
                total += calificacion;
            }
            double promedio = total / calificaciones.length;
            System.out.println("Total de calificaciones: " + total);
            System.out.println("Promedio final: " + promedio);
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
}