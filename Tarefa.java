package tarefa;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeParseException;

public class Tarefa {

    // Atributos privados. so podem ser acessados via dados recebidos por metodos get e set e armazenados nos contrutores.
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    // Construtor 1: Construtor completo. define as variaveis privadas para receberem objetos com valores.
    public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    // Construtor 2: Construtor com menos parâmetros. define descrição como vazio e prioridade zerada
    public Tarefa(String titulo, String prazo) {
        this.titulo = titulo;
        this.prazo = prazo;
        this.descricao = "";    // Descrição padrão (vazio)
        this.prioridade = 0;    // Prioridade padrão (vazio)
    }

    // Métodos públicos para acessar os atributos privados (serve para tornar os dados concisos)
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrazo() {
        return this.prazo;
    }

    public void setPrazo(String prazo) {
        if (isPrazoValido(prazo)) {
            this.prazo = prazo;
        } else {
            System.out.println("Data inválida.");
        }
    }

    //exibição de detalhes utilizando valores da tarefa1 que estão armazenados nos construtores.
    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Prazo: " + this.prazo);
        System.out.println("Prioridade: " + this.prioridade);
    }

    //=======================Definição de prazos com import de biblioteca=========================

    // Método para calcular dias restantes
    public long calcularDiasRestantes() {
        LocalDate dataPrazo = LocalDate.parse(this.prazo);
        LocalDate hoje = LocalDate.now();

        return ChronoUnit.DAYS.between(hoje, dataPrazo);
    }

    // Método para validar prazo
    private boolean isPrazoValido(String prazo) {
        try {
            LocalDate.parse(prazo);
            return true;
        } catch (DateTimeParseException e){
            return false;
        }
    }
}