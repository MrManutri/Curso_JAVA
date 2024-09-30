import java.util.Scanner;

public class SistemaEmpleado {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario");
        var nombreUsuario = consola.nextLine();
        System.out.println("Ingrese la edad");
        var edadUsuario = consola.nextInt();
        consola.nextLine();
        System.out.println("ingrese Salario");
        var salario = Double.parseDouble(consola.nextLine());
        System.out.println("Es jefe de departamento (true/false) ");
        var isJefe = Boolean.parseBoolean(consola.nextLine());

        System.out.println("El Emplado " + nombreUsuario + " tiene " + edadUsuario + " de edad y su salario es $"
        + salario +" " + isJefe + " Es jefe de departamento");
    }
}
