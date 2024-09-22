public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparacion de Cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //Comparacion de cadenas (==) compara referencia

        System.out.println(cadena1 == cadena2);

        //comparar contenido metodo equals

        System.out.println(cadena1.equals(cadena3));
    }
}
