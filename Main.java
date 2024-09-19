import exemplo.AreaCirculo.AreaCirculo;
import exemplo.CelsiusParaFahrenheit.CelsiusParaFahrenheit;
import exemplo.HelloWorld.HelloWorld;
import exemplo.MaiorDeTresNumeros.MaiorDeTresNumeros;
import exemplo.MediaTresNumeros.MediaTresNumeros;
import exemplo.ParOuImpar.ParOuImpar;
import exemplo.SomaDoisNumeros.SomaDoisNumeros;
import exemplo.MetrosParaCentimetros.MetrosParaCentimetros;
import tarefa.Tarefa;

public class Main {
    public static void main(String[] args) {

        //codigos exemplos feitos para repositorio
        AreaCirculo.main(args);
        CelsiusParaFahrenheit.main(args);
        HelloWorld.main(args);
        MaiorDeTresNumeros.main(args);
        MediaTresNumeros.main(args);
        ParOuImpar.main(args);
        SomaDoisNumeros.main(args);
        MetrosParaCentimetros.main(args);

        //========================================codigos do professor=======================================

        //novo objeto tarefa chamando construtores e definindo elementos. não aparece no terminal
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar os conceitos de classes e objetos", "2024-15-48", 1);

        //utiliza o novo objeto tarefa1 para imprimir apenas titulo e descrição, sendo este objeto usando uma as tags dos gets.
        System.out.println("=============== Testando métodos gets ===============");
        System.out.println("Título: " + tarefa1.getTitulo());
        System.out.println("Descrição: " + tarefa1.getDescricao());
        System.out.println();

        //quando o objeto tarefa1 recebe os valores que serão armazenados no construtores. o exibir detalhes ira imprimir tambem.
        System.out.println("=============== Imprimindo com método exibitDetalhes() ===============");
        tarefa1.exibirDetalhes();

        //cria um objeto novo da tarefa sendo tarefa2 que recebe apenas valores de titulo e prazo, sendo o restante valores pre determinados no codigo tarefa
        System.out.println("=============== Imprimindo tarefa com o costrutor 2 ===============");

        Tarefa tarefa2 = new Tarefa("Estudar para provas", "2050-10-25"); //prazo: ao receber um valor com uma data que com meses e dias invalidos, ele dara uma mensagem de data invalida.

        tarefa2.exibirDetalhes(); //o objeto tarefa2 interagindo com valores armazenados do objeto tarefa1 


        System.out.println("Dias restantes para a tarefa 1: " + tarefa2.calcularDiasRestantes());//o objeto tarefa2 utiliza de seu prazo para ser calculado sendo que esta com dados invalidos como dia e meses assim dando uma mensagem de data invalida 

        System.out.print("Novo prazo da tarefa 1: ");
        tarefa1.setPrazo("2024-15-48");
    }
}
