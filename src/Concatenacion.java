public class Concatenacion {
    public static void main(String[] args) {
        String nombre = "Jhorfan";
        String apellido = "vega";
        int valor = 100;
        String palabra1="aprenidiendo", palabra2="JAVA", palabra3="Spring bot";
        String numero = palabra1 +", "+ palabra2 +", "+ palabra3;

        System.out.println("nombre: "+nombre);
        System.out.println("apellido: "+ apellido);
        System.out.println("nombre y apellido es: "+nombre +" "+ apellido);
        System.out.println("valor: "+valor);
        System.out.println("palabras concatenadas: "+numero);
        System.out.println(palabra1.concat(palabra2));
    }
}
