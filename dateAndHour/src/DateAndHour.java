import java.util.Date;
import java.util.Locale;
import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.Dimension;

public class DateAndHour {

    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("A hora do sistema é:");
        System.out.println(data.toString());
        System.out.println("-------------------------------");

        Idioma indio = new Idioma();
        indio.Lingua();

        Tela tela = new Tela();
        tela.Dimensoes();

        TelaAwt telaawt = new TelaAwt();
        telaawt.Dimetion();
    }


    public static class Idioma {
        public void Lingua(){
            Locale loc = Locale.getDefault();
            System.out.println(loc.getDisplayLanguage());
            System.out.println(loc.getLanguage());
            System.out.println("------------------------------");
        }
    }

    public static class Tela {
        public void Dimensoes(){
            GraphicsEnvironment ge;
            ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            DisplayMode dm = ge.getDefaultScreenDevice().getDisplayMode();
            System.out.println("A resolucao da maquina e:");
            System.out.println("Width: " + dm.getWidth());
            System.out.println("Height " + dm.getHeight());
            System.out.println("---------------------------");
        }
    }

    public static class TelaAwt {
        public void Dimetion() {
            Toolkit tol = Toolkit.getDefaultToolkit();
            Dimension dimen = tol.getScreenSize();
            System.out.println("Dimensões pela biblioteca Toolkit");
            System.out.println("Width: " + dimen.getWidth() + " x " + "Height: " + dimen.getHeight());
        }
    }
}