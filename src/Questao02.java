import java.util.Arrays;

public class Questao02 {
    public static void main(String[] args) {

        int vetor1[] = {1,2,3,4,5};
        int vetor2[] = {6,7,8,9,10};
        int vetorSoma[] = new int[5];

        for (int i = 0; i < 5; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
        System.out.println("Vetor soma:"+ Arrays.toString(vetorSoma));
    }
}
