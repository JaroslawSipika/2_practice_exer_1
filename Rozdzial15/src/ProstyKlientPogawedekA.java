import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ProstyKlientPogawedekA {

	JTextField wiadomosc;
	PrintWriter pisarz;
	Socket gniazdo;
	
	public void doDziela() {
		JFrame ramka = new JFrame("�miesznie prosty klient pogaw�dek");
		JPanel panelGlowny = new JPanel();
		wiadomosc = new JTextField(20);
		JButton przyciskWyslij = new JButton("Wyslij");
		przyciskWyslij.addActionListener(new PrzyciskWyslijListener());
		panelGlowny.add(wiadomosc);
		panelGlowny.add(przyciskWyslij);
		konfigurujKomunikacje();
		ramka.getContentPane().add(BorderLayout.CENTER, panelGlowny);
		ramka.setSize(400, 90);
		ramka.setVisible(true);
	}
	
	private void konfigurujKomunikacje() {
		
		try {
			gniazdo = new Socket("127.0.0.1", 5000);
			pisarz = new PrintWriter(gniazdo.getOutputStream());
			System.out.println("obs�uga sieci gotowa do u�ycia");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public class PrzyciskWyslijListener implements ActionListener {
		
		public void actionPerformed(ActionEvent ev) {
			
			try {
				pisarz.println(wiadomosc.getText());
				pisarz.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			wiadomosc.setText("");
			wiadomosc.requestFocus();
		
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		new ProstyKlientPogawedekA().doDziela();

	}

}
