public class PalabraBreakContinue {
    public static void main(String[] args) {
        for (var n = 1; n < 10; n++){
            if (n % 2 ==0){
                System.out.println(n);
                break;
            }
        }

        for (var n = 1; n < 10; n++){
            if (n % 2 !=0){

                continue;
            }
            System.out.println(n);
        }
    }
}
