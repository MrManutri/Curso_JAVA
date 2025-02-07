import java.util.Scanner;

public class MenuIterativo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;

        while(!salir){
            System.out.println("""
                    ***** Sistema de administracion de cuentas******
                    Menu:
                    1) Crear Cuenta
                    2) Eliminar Cuenta
                    3) Salir
                    
                    Escoge una opcion: \s
                    """);
            var opcion = consola.nextInt();
            switch (opcion){
                case 1 -> System.out.println("creando cuenta...");
                case 2 -> System.out.println("Eliminando cuenta");
                case 3 -> {
                    System.out.println("saliendo");
                    salir = true;
                }
                default -> System.out.println("Opcion Invalida");
            }
        }
    }
}
