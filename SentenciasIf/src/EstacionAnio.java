import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("ingresa un numero de estacion del 1 al 12");
        var mes = Integer.parseInt(console.nextLine());
        var estacion = "";
        if (mes == 1 || mes == 2 || mes == 12){
            estacion = "verano";
        }else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "invierno";
        }else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "otoño";
        }else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "primavera";
        }else{
            estacion = "desconocida";
        }
        System.out.println(estacion);

    }
}
