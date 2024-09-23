import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //como leer distintos tipos de datos

        //entero
        var consola = new Scanner(System.in);
        System.out.println("ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        //leer doble
        System.out.println("ingresa tu altura");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);

        //consumir caracter salto de linea
        consola.nextLine();
        
        //leer string
        System.out.println("ingresa tu nombre");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        

        //conversion de datos
        System.out.println("proporciana un valor entero");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);

        //tipo flotante
        System.out.println("proporciona un flotante");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

    }


}
