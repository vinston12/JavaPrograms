package meta3;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Scanner;

public class Logowanie extends JFrame implements ActionListener {
	JButton bZaloguj,bWyjscie;
	JLabel lUserName,lPassw;
	JTextField tWpiszLogin,tWpiszHaslo;
	String podajLogin,podajHaslo;
	Component ramka;
	public Logowanie() {
	setSize(500,300);
	setTitle("Zaloguj Siê");
	setLayout(null);
	
	 bZaloguj = new JButton("Zaloguj");
	 bWyjscie = new JButton("Wyjœcie");
	 
	 bZaloguj.setBounds(100,200,80,20);
	 bZaloguj.addActionListener(this);
	 add(bZaloguj);
	 
	 
	 bWyjscie.setBounds(300,200,80,20);
	 bWyjscie.addActionListener(this);
	 add(bWyjscie);
	 
	 lUserName = new JLabel("Nazwa u¿ytkownika: ");
	 lPassw = new JLabel("Has³o: ");
	 
	 lUserName.setBounds(50,50,150,20);
	 lUserName.setFont(new Font("SansSerif",Font.BOLD,13));
	 add(lUserName);
	
	 lPassw.setBounds(140,100,150,20);
	 lPassw.setFont(new Font("SansSerif",Font.BOLD,13));
	 add(lPassw);

	tWpiszLogin= new JTextField();
	tWpiszHaslo= new JPasswordField();
	
	tWpiszLogin.setBounds(200,50,150,20);
	tWpiszLogin.setToolTipText("Wpisz nazwê u¿ytkownika");
	add(tWpiszLogin);
	
	tWpiszHaslo.setBounds(200,100,150,20);
	tWpiszHaslo.setToolTipText("Wpisz swoje has³o");
	add(tWpiszHaslo);
	
	}
	
	
public static void main(String[] args) {
	Logowanie logowanie = new Logowanie();
	logowanie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	logowanie.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	Object zrodlo = e.getSource();
	if (zrodlo == bWyjscie) {
		dispose();
		}
	
	if (zrodlo == bZaloguj) {
	podajLogin = tWpiszLogin.getText();
	podajHaslo = tWpiszHaslo.getText();
	  if (podajLogin.equals("admin") && podajHaslo.equals("admin")) {
		JOptionPane.showMessageDialog(ramka, "Zalogowa³eœ siê!");
	} 
	  
	  else {
		  JOptionPane.showMessageDialog(ramka, "Z³a nazwa u¿ytkownika lub has³o");
		 
	  }
	}
	
}
}
