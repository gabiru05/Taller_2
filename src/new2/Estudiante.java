//Gabriel Ruiz, Jonathan Reyes, Keneth Benavidez.
package new2;

public class Estudiante {
    String nombre;
    String contraseña;
    double[] calificaciones = new double[5];

    public Estudiante(String nombre, String contraseña, double[] calificaciones) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.calificaciones = calificaciones;
    }
}