import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("propociona el largo del arreglo");
        var largo = Integer.parseInt(consola.nextLine());
        var entero = new int[largo];
        for (var indice=0;indice<largo;indice++) {

            System.out.println("ingresa el numero en el indice " + indice);
            entero[indice] = Integer.parseInt(consola.nextLine());
        }
        System.out.println("Su arreglo:");
        for (var i=0;i<entero.length;i++){
            System.out.print(entero[i] + ",");
        }

    }
}
