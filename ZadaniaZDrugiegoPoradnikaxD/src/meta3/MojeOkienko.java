package meta3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MojeOkienko extends JFrame implements ActionListener {
	Scanner skaner = new Scanner(System.in);
	JButton bSrednia, bWyjscie, bDodaj;
	JLabel lwyswietlSrednia,lWyswietlPodajOceny, lWyswietlCzas;
	JTextField tPodajOceny, tWyswietlSrednia;
	double tempPodajOceny, tempSrednia, tempSuma=0;
	int tablicaOcen[] = new int[(int)tempPodajOceny];
	int i=0;
	int day,month,year;
	GregorianCalendar date = new GregorianCalendar();
	public MojeOkienko() {

	      day = date.get(Calendar.DAY_OF_MONTH);
	      month = date.get(Calendar.MONTH);
	      year = date.get(Calendar.YEAR);

		setSize(500,500);
		setTitle("Program do obliczania œredniej");
		setLayout(null);
		
		bSrednia =new JButton("Wcisnij aby obliczyæ œredni¹");
		bSrednia.setBounds(100,150,300,50);
		bSrednia.addActionListener(this);
		add(bSrednia);
		
		bDodaj =new JButton("Wczytaj");
		bDodaj.setBounds(150,50,100,20);
		bDodaj.addActionListener(this);
		add(bDodaj);
		
		bWyjscie =new JButton("Kliknij aby wyjsc");
		bWyjscie.setBounds(270,400,200,20);
		bWyjscie.addActionListener(this);
		add(bWyjscie);
		
		lwyswietlSrednia = new JLabel("Œrednia: ");
		lwyswietlSrednia.setBounds(65,100,400,20);
		lwyswietlSrednia.setForeground(new Color(0,128,128));
		lwyswietlSrednia.setFont(new Font("SansSerif",Font.ITALIC,18));
		add(lwyswietlSrednia);
		
		lWyswietlPodajOceny = new JLabel("Podaj oceny: ");
		lWyswietlPodajOceny.setBounds(30,20,400,20);
		lWyswietlPodajOceny.setForeground(new Color(0,128,128));
		lWyswietlPodajOceny.setFont(new Font("SansSerif",Font.ITALIC,18));
		add(lWyswietlPodajOceny);
		
		lWyswietlCzas = new JLabel("Dzisiejsza data: "+day+"/"+(month+1)+"/"+year);
		
		lWyswietlCzas.setBounds(50,430,400,20);
		lWyswietlCzas.setForeground(new Color(0,122,128));
		lWyswietlCzas.setFont(new Font("SansSerif",Font.ITALIC,13));
		add(lWyswietlCzas);
		
		tPodajOceny = new JTextField("");
		tPodajOceny.setBounds(150,20,300,25);
		tPodajOceny.setToolTipText("Wpisz oceny");
		add(tPodajOceny);
		
		tWyswietlSrednia = new JTextField("");
		tWyswietlSrednia.setBounds(150,100,300,25);
		add(tWyswietlSrednia);
	}

	public static void main(String[] args) {
		MojeOkienko okienko = new MojeOkienko();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okienko.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object zrodlo = e.getSource();
		if (zrodlo == bWyjscie) 
		{dispose();
		}
		else if(zrodlo==bDodaj) {
			tempSuma += Double.parseDouble(tPodajOceny.getText());
			tPodajOceny.setText("");
			i++;
		}
		else if(zrodlo==bSrednia) {
		tempSrednia = tempSuma/i;
		tWyswietlSrednia.setText(String.valueOf(tempSrednia));
		}
		
			
		
	
	}
	
}