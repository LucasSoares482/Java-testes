// App.java
import CursoEmVideo.DetectarIdioma;
import CursoEmVideo.DetectarResolucao;
import CursoEmVideo.PrimeiroPrograma;

public class App {
    public static void main(String[] args) {
        PrimeiroPrograma programa = new PrimeiroPrograma();
        programa.main(args);
        DetectarIdioma idioma = new DetectarIdioma();
        idioma.main(args);
        DetectarResolucao resolucao = new DetectarResolucao();
        resolucao.main(args);
    }
}