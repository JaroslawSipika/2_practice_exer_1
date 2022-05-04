import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class DwaPrzyciski {
	JFrame ramka;
	JLabel etykieta;

	public static void main(String[] args) {
		DwaPrzyciski gui = new DwaPrzyciski();
		gui.doRoboty();
	}
	
	public void doRoboty() {
		ramka = new JFrame();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton przyciskEtyk = new JButton ("Zmie� etykiet�");
		przyciskEtyk.addActionListener(new EtykietaListener());
		
		
		JButton przyciskKolor = new JButton ("Zmiana koloru");
		przyciskKolor.addActionListener(new KolorListener());
		
		
		etykieta = new JLabel("Oto etykieta");
		MojPanelRysunkowy panel = new MojPanelRysunkowy ();
		
		ramka.getContentPane().add(BorderLayout.SOUTH, przyciskKolor);
		ramka.getContentPane().add(BorderLayout.CENTER, panel);
		ramka.getContentPane().add(BorderLayout.EAST, przyciskEtyk);
		ramka.getContentPane().add(BorderLayout.WEST, etykieta);
		
		ramka.setSize(400,300);
		ramka.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent zdarzenie) {
		ramka.repaint();
	}
	
	
	class EtykietaListener implements ActionListener {
		public void actionPerformed(ActionEvent zdarzenie) {
			etykieta.setText("Auuuuu!");
		}
	}
	
	class KolorListener implements ActionListener {
		public void actionPerformed(ActionEvent zdarzenie) {
			ramka.repaint();
		}
	}
	
	

}




