import java.util.Scanner;

public class CalculaAreaPerimetro {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("ingresa la altura de tu rectangulo");
        var altura = Integer.parseInt(consola.nextLine());

        System.out.println("ingresa el ancho de tu rectangulo");
        var ancho = Integer.parseInt(consola.nextLine());

        var perimetro = 2 * (altura + ancho);
        var area = altura * ancho;

        System.out.println("el perimetro es: " + perimetro);
        System.out.println("el area es: " + area);
    }
}
