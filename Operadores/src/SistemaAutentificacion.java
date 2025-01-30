import java.util.Scanner;

public class SistemaAutentificacion {
    public static void main(String[] args) {
        final String USUARIO = "manuel";
        final String PASSWORD = "123";

        var consola = new Scanner(System.in);

        System.out.println("ESCRIBA SU USUARIO");
        var usuarioEscrito = consola.nextLine();

        System.out.println("ESCRIBA SU CONTRASEÑA");
        var passwordEscrito = consola.nextLine();

        var resultado = USUARIO.equals(usuarioEscrito) && PASSWORD.equals(passwordEscrito);

        System.out.println(resultado);
    }
}
