import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CodziennePoradySerwer {

	String[] listaPorad = {"U¿ywaj mniejszych bitów", "Chodz w dopasowanych spodniach. Nie, te nie sprawiaj¹, ¿e wygl¹dasz grubo.", "Jedno s³owo: nieodpowiednie", "Tylko dziœ - b¹dz uczciwy - powiedz swojemy szefowi, co *naprawdê* czujesz", "Mo¿e chcesz zastanowiæ siê nad swoj¹ fryzur¹."};
		
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
			System.out.println("Nie uda³o siê");
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
