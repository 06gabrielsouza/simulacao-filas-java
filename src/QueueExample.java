import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Enfileirando elementos
        fila.add("Gabriel");
        fila.add("Maria");
        fila.add("João");
        fila.add("Ana");

        System.out.println("Fila inicial: " + fila);

        // Desenfileirando elementos
        while (!fila.isEmpty()) {
            String pessoa = fila.remove();
            System.out.println(pessoa + " foi atendido(a).");
        }

        System.out.println("Fila vazia: " + fila);
    }
}
