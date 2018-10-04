package metaLogowanie;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Scanner;

public class Logowanie extends JFrame implements ActionListener {
	JButton bZaloguj,bReset,bWyjscie;
	public Logowanie() {
	setSize(500,500);
	setTitle("Zaloguj Siê");
	setLayout(null);
	
	 bZaloguj = new JButton();
	 bReset = new JButton();
	 bWyjscie = new JButton();
	 bZaloguj.setBounds(50,50,100,50);
	 add(bZaloguj);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
