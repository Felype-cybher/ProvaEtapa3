import java.util.Arrays;
import java.util.List;

public class Questao05 {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Felype" , "Diogo" , "Myllena");

        long contador = nomes.stream()
                .filter(n-> n.length() > 5)
                .count();

        System.out.println("Quantidade de nomes com mais de 5 caracteres:"+ contador);
    }
}
