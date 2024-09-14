
public class GerenciadorPessoal {
    public static void main(String[] args) {
        // Cálculo de gastos
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;
        int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
        System.out.println("Gasto total do trimestre: R$" + gastoTrimestre);

        // Criação de uma tarefa
        Tarefa tarefa1 = new Tarefa("Estudar para prova", "Revisar todos os conteúdos", "2024-12-31", 3);
        tarefa1.exibirDetalhes();

        // Outros exemplos
        int idade = 29;
        System.out.println("Idade: " + idade);

        // ... outros exemplos
    }

    static class Tarefa {
        private String titulo;
        private String descricao;
        private String prazo;
        private int prioridade;

        // Construtor completo
        public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
            this.titulo = titulo;
            this.descricao = descricao;
            this.prazo = prazo;
            this.prioridade = prioridade;
        }

        // Construtor com menos parâmetros
        public Tarefa(String titulo, String prazo) {
            this.titulo = titulo;
            this.prazo = prazo;
            this.prioridade = 0;
        }

        // Métodos Get e Set
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

        public void setPrioridade(int prioridade) {
            this.prioridade = prioridade;
        }

        // Método para exibir detalhes
        public void exibirDetalhes() {
            System.out.println("Título: " + titulo);
            System.out.println("Descrição: " + descricao);
            System.out.println("Prazo: " + prazo);
            System.out.println("Prioridade: " + prioridade);
        }
    }
}
