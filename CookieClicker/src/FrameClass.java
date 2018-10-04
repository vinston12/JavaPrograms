import javax.swing.*;
import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("serial")
public class FrameClass extends JFrame {

    final Color kTlo = new Color(100,100,255);


    JPanel panel;

    public FrameClass(){


        super("Ciasteczko");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(kTlo);



        add(panel);
        setSize(700,700);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }


  public static void main(String[] args) {
        new FrameClass();

}
}
