import java.util.Scanner;

public class SistemaDescuentosVip {
    public static void main(String[] args) {
        final var N_PRODUCTOS_DESCUENTO = 10;
        var scanner = new Scanner(System.in);

        System.out.println("Cuantos articulos a comprado hoy");
        int articulo = Integer.parseInt(scanner.nextLine());
        System.out.println("Cuenta con una membresia true/false");
        boolean hasMenbresia = Boolean.parseBoolean(scanner.nextLine());

        var isVip = articulo >= N_PRODUCTOS_DESCUENTO && hasMenbresia;
        System.out.println("es Vip = " + isVip);
    }
}
