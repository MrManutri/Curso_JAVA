import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        var numeroUno = 0;
        var numeroDos = 0;

        while (!salir){
            System.out.printf("""
                    *******Calculadora*******
                    1- Suma
                    2- Resta
                    3- Multiplicacion
                    4- Division
                    5- Salir
                    
                    Elija una opcion
                    """);
            var opcion = Integer.parseInt(consola.nextLine());

            if (opcion >= 1 && opcion <= 4) {
                System.out.println("escriba un numero");
                 numeroUno = Integer.parseInt(consola.nextLine());
                System.out.println("escriba otro numero");
                 numeroDos = Integer.parseInt(consola.nextLine());
            }

                switch (opcion) {
                    case 1 -> {
                        System.out.println("la suma de " + numeroUno + " + " + numeroDos + " es= " + (numeroUno + numeroDos));
                    }
                    case 2 -> {
                        System.out.println("la resta de " + numeroUno + " - " + numeroDos + " es= " + (numeroUno - numeroDos));
                    }
                    case 3 -> {
                        System.out.println("la multiplicion de " + numeroUno + " * " + numeroDos + " es= " + (numeroUno * numeroDos));
                    }
                    case 4 -> {
                        if (numeroDos == 0) {
                            System.out.println("la multiplicacion por 0 no existe");
                        } else {
                            System.out.println("la division de " + numeroUno + " / " + numeroDos + " es= " + (numeroUno / numeroDos));
                        }
                    }
                    case 5 -> {
                        System.out.println("saliendo...");
                        salir = true;
                    }
                    default -> System.out.println("Opcion invalida");
                }

        }
    }
}
