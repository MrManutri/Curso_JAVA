import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        Random numero = new Random();
        var contadorIntentos = 0;
        int numeroValor = numero.nextInt(50) + 1;
        System.out.println("ingresa un numero del 1 al 10 y trata de adivinarlo");
        var n = Integer.parseInt(consola.nextLine());
            while (numeroValor != n) {
                if (contadorIntentos < 10) {
                    contadorIntentos++;
                    if (n > numeroValor) {
                        System.out.println("el numero ingresado es mayor al numero random");
                    } else {
                        System.out.println("el numero ingresado es menor al numero random");
                    }
                    System.out.printf("""
                                numero de intentos maximos: 10
                                Numero de Intentos: %d
                                el numero ingresado: %d
                                    no coincide, intentelo nuevamente
                            """, contadorIntentos, n);
                    n = Integer.parseInt(consola.nextLine());
                }else{
                    System.out.println("FIN DEL JUEGO, NUMERO DE INTENTOS MAXIMOS ALCANZADOS");
                    break;
                }
            }
            System.out.printf("""
                    felicidades los numeros coinciden
                    numero de intentos: %d
                    """, contadorIntentos);
    }
}
