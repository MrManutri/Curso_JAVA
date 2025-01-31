import java.util.Scanner;

public class SistemaAutentificacion {
    public static void main(String[] args) {
        final String USUARIO = "manuel";
        final String PASSWORD = "123hola";
        var console = new Scanner(System.in);
        System.out.println("ingrese su usuario");
        var usuario = console.nextLine().strip();
        System.out.println("ingrese su contraseña");
        var password = console.nextLine().strip();
         if (USUARIO.equals(usuario) && PASSWORD.equals(password)){
             System.out.println("bienvenido al sistema");
         }else if (!USUARIO.equals(usuario)){
             System.out.println("usuario invalido");
         }else if (!PASSWORD.equals(password)){
             System.out.println("Contraseña invalida");
         }else{
             System.out.println("usuario y contraseña invalidos");
         }
    }
}
