public class Cadenas {
    public static void main(String[] args) {
        // manejo de cadenas
        var cadena1 = "hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String("hola");
        System.out.println("cadena2 = " + cadena2);
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        var cadena4 = """
                    Este es un texto en 
                    bloque
                """;

    }
}
