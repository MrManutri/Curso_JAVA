import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        System.out.println("valor positivo?");
        var console = new Scanner(System.in);
        System.out.println("ingresa un numero");
        var numero = Integer.parseInt(console.nextLine());
        if (numero> 0){
            System.out.println("el numero es positivo");
        }else if(numero < 0){
            System.out.println("el numero es negativo");
        }else{
            System.out.println("el numero es 0");
        }
    }
}
