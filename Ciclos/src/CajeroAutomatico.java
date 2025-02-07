import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        var saldoBase = 1000.0f;
        while (!salir){
            System.out.printf("""
                    ***** Cajero Automatico******
                    Menu:
                    1) Depositar
                    2) Retirar
                    3) Consultar Saldo
                    4) Salir
                    
                    Escoge una opcion: \s
                    """);
            var opcion = Integer.parseInt(consola.nextLine());
            switch (opcion){
                case 1 -> {
                    System.out.println("cuanto desea depositar?");
                    var deposito = Float.parseFloat(consola.nextLine());
                    saldoBase += deposito;
                    System.out.println("Su saldo actual es: "+saldoBase);
                }
                case 2 ->{
                    System.out.println("Cuanto desea retirar");
                    var retiro = Float.parseFloat(consola.nextLine());
                    saldoBase -= retiro;
                    System.out.println("Su saldo actual es: "+saldoBase);
                }
                case 3-> System.out.println("Su saldo es de: " +saldoBase);
                case 4 -> {
                    System.out.println("*********saliendo*********");
                    salir = true;
                }
                default -> System.out.println("opcion invalida");
            }
        }
    }
}
