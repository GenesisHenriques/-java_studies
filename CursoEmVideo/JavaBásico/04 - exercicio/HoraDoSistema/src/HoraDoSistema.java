import java.awt.*;
import java.util.*;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());

        String pais = System.getProperty("user.country");

        System.out.println("Eu estou no " + pais);


        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução da sua máquina é: " +d.width + " x " +d.height);
    }
}
