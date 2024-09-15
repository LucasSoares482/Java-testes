package CursoEmVideo;

import java.awt.Dimension;
import java.awt.Toolkit;

public class DetectarResolucao {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        System.out.println("A resolução da sua tela é: " + screenSize.width + " x " + screenSize.height);
    }
}
