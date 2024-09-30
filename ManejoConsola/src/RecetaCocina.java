import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Nombre de la receta");
        var nombre = consola.nextLine();
        System.out.println("Ingrese ingredientes principales");
        var ingredientes = consola.nextLine();
        System.out.println("ingrese el tiempo de preparación");
        var tiempo = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese la dificultad");
        var dificultad = consola.nextLine();

        System.out.println("nombre = " + nombre);
        System.out.println("ingredientes = " + ingredientes);
        System.out.println("tiempo = " + tiempo + " min");
        System.out.println("dificultad = " + dificultad);
    }
}
