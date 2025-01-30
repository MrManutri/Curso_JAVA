import java.sql.SQLOutput;
import java.util.Scanner;

public class DescuentoTienda {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("cuanto es el monto de su compra?");
        var montoCompra = Integer.parseInt(console.nextLine());
        System.out.println("es miembro de la tienda? (true o false)" );
        var isMiembro = Boolean.parseBoolean(console.nextLine());
        if (isMiembro && montoCompra > 1000){
            var descuento = montoCompra * 0.10;
            var valorFinal = montoCompra - descuento;
            System.out.println("el se le aplico un descuento del 10%% lo que da un valor final de: " + valorFinal);
        }else if(isMiembro){
            var descuento = montoCompra * 0.05;
            var valorFinal = montoCompra - descuento;
            System.out.println("el se le aplico un descuento del 10%% lo que da un valor final de: " + valorFinal);
        }else{
            System.out.println("no se le aplico descuento su valor final es:" + montoCompra);
        }
    }
}
