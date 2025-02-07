import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("ingresa un password de al menos 6 caracteres");
        var password = consola.nextLine();

        while (password.length()<6){
            System.out.println("este password no cuenta con los requisitos");
            System.out.println("ingresa un nuevo password");
            password = consola.nextLine();
        }
        System.out.println("el valor es valido: " + password);
    }
}
