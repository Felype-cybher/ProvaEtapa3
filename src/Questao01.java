public class Questao01 {
    public static boolean Primo(int numero){

        if (numero<= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(numero) ; i++) {
            if (numero%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int numero = 21;

        System.out.println("É primo: "+Primo(numero));
    }
}
