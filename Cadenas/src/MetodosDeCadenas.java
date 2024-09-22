public class MetodosDeCadenas {
    public static void main(String[] args) {
        //Metodos de cadenas
        var cadena1 = "Hola Mundo";
        
        //obtener longitud de cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        // Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        //Convertir Mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //convertir minusculas
        System.out.println(cadena1.toLowerCase());
        
        //Eliminar espacios al inicio y al final
        var cadena2 = " Leo Reyes     ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2.trim() = " + cadena2.trim());
    }
}
