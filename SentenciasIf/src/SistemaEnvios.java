import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        final int NACIONAL = 10;
        final int INTERNACIONAL = 20;
        var console = new Scanner(System.in);

        System.out.println("su paquete es nacional o internacional?");
        var destino = console.nextLine();
        System.out.println("cual es el peso de su paquete?");
        var peso = Float.parseFloat(console.nextLine());
        var valor = 0.0f;
        switch (destino){
            case "nacional":
                valor = peso * NACIONAL;
                break;
            case "internacional":
                valor = peso * INTERNACIONAL;
                break;
            default:
                System.out.println("Valor Invalido");
                break;
        }
        System.out.println("El costo de envio es de: $ " + valor);
    }
}
