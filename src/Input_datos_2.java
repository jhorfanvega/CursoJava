import javax.swing.*;

public class Input_datos_2 {

    public static void main(String[] args) {

        String nombre;
        int edad;

        // ingreso de datos
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre.");
        String edad2 = JOptionPane.showInputDialog(null, "Ingrese su edad.");

        edad = Integer.parseInt(edad2);

        // mostrar datos
        JOptionPane.showMessageDialog(
                null,
                "Nombre: " + nombre + "\n" +
                        "Edad: " + edad
        );
    }
}
