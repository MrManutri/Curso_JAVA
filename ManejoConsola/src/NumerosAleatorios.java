import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        //numeros aleatorios
        var random  = new Random();

        //Generar un numero aleatorio
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio = " + numeroAleatorio);
        
        //generar un numero aleatorio entre 1 y 10
        
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);
        
        //simular el lanzamiento de un dado
        
        var dado = random.nextInt(6)+1;
        System.out.println("dado = " + dado);
    }
}
