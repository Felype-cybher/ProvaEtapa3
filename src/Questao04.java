import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questao04 {
    public static void main(String[] args) {

        List<Integer> valores = Arrays.asList(1,2,3,4,5,6);
        List<Integer> pares = new ArrayList<>();

        valores.forEach(v->{
            if (v%2==0){
                pares.add(v);
            }
        });
        System.out.println("Numeros pares:"+ pares);
    }
}
