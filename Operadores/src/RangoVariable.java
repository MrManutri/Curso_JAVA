import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("proporciona un entero");
        var dato = Integer.parseInt(scanner.nextLine());
        
        //Revisamos si esta dentro 1 a 10
        
        var isRangoValido = dato >= 1 && dato <= 10;
        System.out.println("isRangoValido = " + isRangoValido);

        //logica inversa, si el dato esta fuera de rango

        isRangoValido = !(dato >= 1 && dato <= 10);
        System.out.println("isRangoInvalido = " + isRangoValido);
    }
}
