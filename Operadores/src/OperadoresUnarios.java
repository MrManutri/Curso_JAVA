public class OperadoresUnarios {
    public static void main(String[] args) {
        //Operadores Unarios
        int a = 3, b = 2, resultado;
        boolean c = true;

        //operador unario + define que sea positivo (opcional)

        resultado = +a;
        System.out.println("+a = " + resultado);

        //operador unario -

        resultado = -a;
        System.out.println("-a = " + resultado);

        //operador unario incremento/decremento

        //preincremento

        a = 3;
        resultado = ++a; //preincremento
        System.out.println("++a = " + resultado);

        //postincremento
        a = 3;
        resultado = a++;
        System.out.println("a++ = " + resultado);

        //predecremento

        b = -2;
        resultado = --b; //preincremento
        System.out.println("--b = " + resultado);

        //postdecremento
        b = -2;
        resultado = b--;
        System.out.println("b-- = " + resultado);


    }
}
