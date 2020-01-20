package swing;
import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame {

    public Formulario(){
        /*setTitle("marco centrado");
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Dimension tamano_pantalla = mipantalla.getScreenSize();

        int altura = tamano_pantalla.height;
        int ancho = tamano_pantalla.width;

        setSize(ancho/2, altura/2);

        setLocation(ancho/4, altura/4);

         */

        setTitle("marco centrado");
        setSize(600, 450);
        setLocation(400, 200);

        lamina marco = new lamina();
        add(marco);

    }

}

        class lamina extends JPanel {

            public void paintComponent(Graphics g){
                super.paintComponent(g);

                 g.drawString("Hola que ase", 100, 100);

            }
        }
