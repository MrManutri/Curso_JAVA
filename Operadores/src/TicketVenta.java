import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** generar ticket de venta ***");
        var consola = new Scanner(System.in);

        System.out.print("precio leche");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("precio Pan");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("precio lechuga");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("precio platanos");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        //calculo sub total sin impuestos
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        // calculo iva chile (19%)

        var impuesto = subtotal * 0.19;

        //calculo total

        var costoTotalCompra = subtotal + impuesto;

        //imprimir venta
        System.out.printf("""
                Subtotal: $%.2f
                Impuesto: 19%%
                Total: $%.2f
                """, subtotal, costoTotalCompra);

    }
}
