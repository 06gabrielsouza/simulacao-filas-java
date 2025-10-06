import java.util.PriorityQueue;

class Tarefa implements Comparable<Tarefa> {
    String nome;
    int prioridade; // 1 = alta, 2 = média, 3 = baixa

    public Tarefa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Tarefa outra) {
        return Integer.compare(this.prioridade, outra.prioridade);
    }

    @Override
    public String toString() {
        return nome + " (Prioridade " + prioridade + ")";
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Tarefa> filaPrioridade = new PriorityQueue<>();

        // 5 altas, 5 médias, 5 baixas
        for (int i = 1; i <= 5; i++) filaPrioridade.add(new Tarefa("Alta" + i, 1));
        for (int i = 1; i <= 5; i++) filaPrioridade.add(new Tarefa("Media" + i, 2));
        for (int i = 1; i <= 5; i++) filaPrioridade.add(new Tarefa("Baixa" + i, 3));

        System.out.println("Ordem de execução (menor número = maior prioridade):");
        while (!filaPrioridade.isEmpty()) {
            System.out.println("Executando: " + filaPrioridade.poll());
        }
    }
}
