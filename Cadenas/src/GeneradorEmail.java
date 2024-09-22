public class GeneradorEmail {
    public static void main(String[] args) {
        var nombre = "                 Manuel Jesus Triviño Sandoval";
        var empresa = "         Google";
        var dominio = "         cl";

        var sinEspacioNombre = nombre.trim();
        var formatoNombre = sinEspacioNombre.replace(" ", ".");
        
        var formatoEmail= String.join("", formatoNombre, "@", empresa.trim(), ".", dominio.trim());
        var formatoFinal= formatoEmail.toLowerCase();
        System.out.println("formatoFinal = " + formatoFinal);
    }
}
