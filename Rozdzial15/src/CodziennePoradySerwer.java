import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CodziennePoradySerwer {

	String[] listaPorad = {"U�ywaj mniejszych bit�w", "Chodz w dopasowanych spodniach. Nie, te nie sprawiaj�, �e wygl�dasz grubo.", "Jedno s�owo: nieodpowiednie", "Tylko dzi� - b�dz uczciwy - powiedz swojemy szefowi, co *naprawd�* czujesz", "Mo�e chcesz zastanowi� si� nad swoj� fryzur�."};
		
	public void doDziela() {
	
		
		try {
			
			ServerSocket gniazdoSrw = new ServerSocket(4242);
			
			
			
			while(true) {
			
			Socket gniazdo = gniazdoSrw.accept();
			
			PrintWriter pisarz = new PrintWriter(gniazdo.getOutputStream());
			String porada = wybierzPorade();
			pisarz.println(porada);
			pisarz.close();
			System.out.println(porada);
			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Nie uda�o si�");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CodziennePoradySerwer serwer = new CodziennePoradySerwer();
		serwer.doDziela();
		
		
	}
	
	
	private String wybierzPorade() {
		int random = (int) (Math.random()* listaPorad.length);
		return listaPorad[random];
	}
	
	

}
