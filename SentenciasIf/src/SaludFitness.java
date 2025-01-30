import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {
        final int META_PASOS_DIARIO = 10000;
        final float CALORIAS_POR_PASO = 0.04f;
        var console = new Scanner(System.in);

        System.out.println("Ingrese si nombre de usuario");
        var nombre = console.nextLine();
        System.out.println("ingrese sus pasos del dia de hoy");
        var pasos = Integer.parseInt(console.nextLine());
        var caloriasQuemadas = pasos * CALORIAS_POR_PASO;
        var metaAlcanzada = pasos>=META_PASOS_DIARIO;
        if (metaAlcanzada){
            System.out.println("Meta de Pasos alcanzada " + pasos + " pasos");

        }else{
            System.out.println("Meta de Pasos no alcanzada " + pasos + " pasos");
            System.out.println("faltaron " + (META_PASOS_DIARIO - pasos) + " pasos" );
        }
        System.out.println("cantidad de calorias quemadas " + caloriasQuemadas + " kcal");

    }
}
