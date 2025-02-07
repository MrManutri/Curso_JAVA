public class AcumuladorSumaWhile {
    public static void main(String[] args) {
        final var MAXIMO = 5;
        var contador = 0;
        var numero = 1;
        while (numero<=MAXIMO){
            contador += numero++;
            System.out.println(contador);

        }
    }
}
