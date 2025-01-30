import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("ingresa un numero");
        var numeroUno = Integer.parseInt(console.nextLine());
        System.out.println("ingresa otro numero");
        var numeroDos = Integer.parseInt(console.nextLine());
        var mayor = (numeroUno > numeroDos) ? "numero uno es mayor" : "numero dos es mayor";
        System.out.println(mayor);
    }
}
