import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("cuantos años tienes?");
        var edad = Integer.parseInt(console.nextLine());
        System.out.println("tienes miedo a la oscuridad? (true/false)");
        var miedo = Boolean.parseBoolean(console.nextLine());
        if (edad > 10 && !miedo){
            System.out.println("entraste a la casa");
        }else{
            System.out.println("no puedes entrar, no cumples las condiciones");
        }
    }
}
