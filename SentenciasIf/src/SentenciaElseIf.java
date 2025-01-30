public class SentenciaElseIf {
    public static void main(String[] args) {
        var edad = 18;
        if (edad >= 18){
            System.out.println("eres un adulto");
        }else if (edad >=13 && edad < 18){
            System.out.println("eres un adolecente");
        }else{
            System.out.println("eres un niño");
        }
    }
}
