import java.util.Scanner;

public class PrestamoLibros {
    public static void main(String[] args) {
        final var KM_REDONDA = 3;
        var scanner = new Scanner(System.in);

        System.out.println("El usuario tiene credencial de estudiante?");
        var hasCredencial = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("a cuantos KM a la redonda vive");
        var kilometos = Float.parseFloat(scanner.nextLine());

        var puedeRecibirLibro = hasCredencial || kilometos <= KM_REDONDA;
        System.out.println("Puede recibir libro? = " + puedeRecibirLibro);
    }
}
