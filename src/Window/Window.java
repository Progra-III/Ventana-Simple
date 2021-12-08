package Window;
import javax.swing.*;
import java.awt.*;

public class Window {

    public Window() {
        JFrame f = new JFrame ("Titulo de la ventana");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setMinimumSize(new Dimension(100,100));
        //f.setResizable(false);                                  //no permito usuario cambiar tam pantalla
        f.setBackground(Color.lightGray);
        f.setVisible(true);

    }

    public static void createShowGUI(){
        System.out.println("Create GUI on EDI? " +              //me dice si el evento fue creado
                SwingUtilities.isEventDispatchThread());        //hilo de ejecucion que despacha un evento
        Window window1 = new Window();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {                 //se encarga de manejar en un hilo especifico
            @Override                                               //ese ejecutable. Multitasking
            public void run() {
                createShowGUI();
            }
        });
    }

}
