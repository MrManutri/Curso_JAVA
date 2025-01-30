import java.util.Scanner;

public class SwitchMejorado {
    public static void main(String[] args) {
        String nombreDia;
        var console = new Scanner(System.in);
        System.out.println("ingresa un dia de la semana (1-7)");
        var dia = Integer.parseInt(console.nextLine());

        nombreDia = switch (dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia invalido";
        };
        System.out.println(nombreDia);
    }
}
