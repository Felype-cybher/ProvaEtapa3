import java.util.Arrays;

public class Questao03 {
    public static void main(String[] args) {

        int matriz[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}


        };
        int vetor[] = new int[4];

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 3; j++) {
                vetor[i] += matriz[i][j];
            }
        }
        System.out.println("Vetor resultante: "+ Arrays.toString(vetor));
    }
}
