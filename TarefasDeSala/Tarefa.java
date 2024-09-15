package TarefasDeSala;
public class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    // Construtor completo (já existente)
    public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        setPrioridade(prioridade);
    }

    // Construtor com título e prioridade (Desafio 1)
    public Tarefa(String titulo, int prioridade) {
        this.titulo = titulo;
        this.descricao = "Sem descrição";
        this.prazo = "Indefinido";
        setPrioridade(prioridade);
    }

    // Método para validar e setar a prioridade (Desafio 2)
    private void setPrioridade(int prioridade) {
        if (isPrioridadeValida(prioridade)) {
            this.prioridade = prioridade;
        } else {
            throw new IllegalArgumentException("Prioridade inválida. Deve estar entre 1 e 5.");
        }
    }

    private boolean isPrioridadeValida(int prioridade) {
        return prioridade >= 1 && prioridade <= 5;
    }

    // Métodos Get e Set para os outros atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    // Método para exibir detalhes
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prazo: " + prazo);
        System.out.println("Prioridade: " + prioridade);
    }

    public static void main(String[] args) {
        // Testando os construtores
        Tarefa tarefa1 = new Tarefa("Estudar para prova", "Revisar todos os conteúdos", "2024-12-31", 3);
        tarefa1.exibirDetalhes();

        Tarefa tarefa2 = new Tarefa("Ler um livro", 2);
        tarefa2.exibirDetalhes();
    }
}
