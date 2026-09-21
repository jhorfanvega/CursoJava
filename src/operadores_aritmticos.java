import java.util.Scanner;

public class operadores_aritmticos {
    public static void main(String[] args) {
        int valor1, valor2;

        //operador suma
        Scanner entrada = new Scanner(System.in);

        //ingrese datos
        System.out.println("ingrese valor1...");
        valor1 = entrada.nextInt();
        System.out.println("ingrese datios del valor2");
        valor2 = entrada.nextInt();

        //operacion suma
        int resultado = valor1 + valor2;
        System.out.println("la suma es..." + resultado);
    }
}
