import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<Operacao> operacoes;

    public Historico() {
        this.operacoes = new ArrayList<>();
    }

    public void adicionarOperacao(Operacao op) {
        this.operacoes.add(op);
    }

    public void mostrarHistorico() {
        if (operacoes.isEmpty()) {
            System.out.println("Histórico vazio.");
            return;
        }
        System.out.println("\n+----Histórico de Operações----+");
        for (int i = 0; i < operacoes.size(); i++) {
            System.out.println((i + 1) + "° " + operacoes.get(i).toHistorico());
        }
        System.out.println("+------------------------------+\n");
    }
}