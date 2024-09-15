import TarefasDeSala.GerenciadorPessoal;
import TarefasDeSala.Tarefa;

public class Tarefas {
    public static void main(String[] args) {
        GerenciadorPessoal gerenciadorPessoal = new GerenciadorPessoal();
        gerenciadorPessoal.main(args);
        
        Tarefa tarefa = new Tarefa();
        tarefa.main(args);
    }
}
