import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Cuantas calificaciones desea agregar?");
        var numeroNotas = Integer.parseInt(consola.nextLine());
        var notas = new int[numeroNotas];
        for(var i = 0; i < numeroNotas; i++){
            System.out.println("Calificacion" + i);
            notas[i] = Integer.parseInt(consola.nextLine());
        }
        var sumaPromedio = 0;
        for (var i = 0; i < notas.length; i++){
            sumaPromedio += notas[i];
        }
        var promedio = sumaPromedio / numeroNotas;
        System.out.println("el promedio es" + promedio);
    }
}
