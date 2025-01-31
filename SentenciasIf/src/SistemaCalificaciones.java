import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("Ingrese su calificacion numerica");
        var calificacion = Integer.parseInt(console.nextLine());
        var resultado = switch (calificacion){
          case 10,9 -> "A";
          case 8 -> "B";
          case 7 -> "C";
          case 6 -> "D";
          case 5,4,3,2,1,0 -> "F";
            default -> "Valor Desconocido";
        };
        System.out.printf("""
                Su calificación es: %d
                Su nota es: %s
                """, calificacion, resultado);
    }
}
