import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("Cual es su nombre?");
        var nombre = console.nextLine();
        System.out.println("cuantos dias estara hospedado?");
        var dias = Integer.parseInt(console.nextLine());
        System.out.println("Desea un cuarto con vista al mar?(true/false)");
        var mar = Boolean.parseBoolean(console.nextLine());
        var precioFinal = 0.0f;
        var cuartoVista = 0.0f;
        if (mar){
             cuartoVista = 190.50f;
             precioFinal = dias * cuartoVista;
        }else{
             cuartoVista = 150.50f;
             precioFinal = dias * cuartoVista;
        }
        System.out.printf("""
                %n nombre: %s
                ha pedido un cuarto por %d dias
                vista al mar: %b
                precio habitación: %.2f
                valor final: %.2f
                """, nombre, dias, mar, cuartoVista, precioFinal);
    }
}
