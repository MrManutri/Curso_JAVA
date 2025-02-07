import java.util.Scanner;

public class ArbolNavidad {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("ingrese el numero de filas");
        var numeroFilas = Integer.parseInt(consola.nextLine());

        for(var fila = 1;fila <=numeroFilas; fila++){
            var espacionBlanco = " ".repeat(numeroFilas-fila);
            var asteriscos = "*".repeat(2*fila-1);

            System.out.println(espacionBlanco + asteriscos);
        }
    }
}
