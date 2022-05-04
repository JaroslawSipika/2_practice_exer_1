import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class CodziennePoradKlient {

	public void doDziela() {
	
		
		try {
			
			Socket gniazdo = new Socket("127.0.0.1", 4242);
			InputStreamReader strumien = new InputStreamReader(gniazdo.getInputStream());
			BufferedReader czytelnik = new BufferedReader(strumien);
			String porada = czytelnik.readLine();
			
			System.out.println("Dziœ powinieneœ: " + porada);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Nie uda³o siê");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CodziennePoradKlient klient = new CodziennePoradKlient();
		klient.doDziela();
		
		
	}

}
