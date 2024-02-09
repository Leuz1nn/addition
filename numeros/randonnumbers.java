package numeros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class randonnumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        int tamanhoLista = 10; 
        for (int i = 0; i < tamanhoLista; i++) {
            int numero = random.nextInt(100); 
            numeros.add(numero);
        }
        System.out.println("Lista de números gerados: " + numeros);
        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
