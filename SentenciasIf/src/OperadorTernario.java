public class OperadorTernario {
    public static void main(String[] args) {
        //sintaxis
        //condicion ? exp1 : exp2

        //determinar si un numero es par o no

        var numero = 5;
        var resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("el numero " + numero + " es " + resultado);
    }
}
