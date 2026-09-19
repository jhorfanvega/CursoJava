import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class input_datos {
    public static void main(String[] args) {
        String nombre;
        int edad;

        // ingresos de dtaos
        Scanner datos = new Scanner(System.in);
        System.out.println("ingrese su nombre...");
        nombre = datos.next();
        System.out.println("ingrese edad,,,");
        edad = datos.nextInt();

        System.out.println("tu nombre es:  "+ nombre);
        System.out.println("tu edad es de:  "+ edad);

    }
}
