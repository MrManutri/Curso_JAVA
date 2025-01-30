import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("DESEA salir del SISTEMA (true/false)");
        var salirSistema = Boolean.parseBoolean(console.nextLine());
        if (!salirSistema){
            System.out.println("aun en el sistema");
        }else{
            System.out.println("salir del sistema");
        }
    }
}
