import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window extends JFrame
{
    private JFrame frame;
    private JButton button;
    private TextArea text;
    private JScrollPane scroll;


    public Window(){
        frame = new JFrame();
        button = new JButton();
        text = new TextArea();
        scroll = new JScrollPane();


        frame.setTitle("Notatnik");
        frame.setSize(1000,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        text.setFont(new Font("Serif",Font.ITALIC, 32));
        text.setEditable(true);
        text.setSize(900,600);
        text.setBackground(Color.white);
        text.setForeground(Color.darkGray);

        scroll.createHorizontalScrollBar();
        pack();


        frame.add(text);
        frame.setVisible(true);
    }

    public static void setWarningMsg(String text){
        Toolkit.getDefaultToolkit().beep();
        JOptionPane optionPane;
        JDialog dialog;

        optionPane = new JOptionPane(text,JOptionPane.INFORMATION_MESSAGE);

        dialog = optionPane.createDialog("Ostrzeżenie");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }


    public static void main(String[] args) {


        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
               new Window();
               setWarningMsg("Nie zapomnij zapisać pracy!");
            }
        });

    }
}
