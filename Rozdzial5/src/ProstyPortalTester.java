class ProstyPortal {
	int [] polePolozenia;
	int iloscTrafien;
	
	public void setPolaPolozenia (int[] ppol) {
		polePolozenia = ppol;
	}
	
	public String sprawdz(String stringPole) {
		int strzal = Integer.parseInt(stringPole);
		String wynik = "pud³o";
		for (int pole : polePolozenia) {
			if (strzal == pole) {
				wynik = "trafiony";
				iloscTrafien++;
				break;
			}
		}
		if (iloscTrafien == polePolozenia.length) {
			wynik = "zatopiony";
		}
		System.out.println(wynik);
		return wynik;
	}	
}


public class ProstyPortalTester {

	public static void main(String[] args) {
	
		int iloscRuchow = 0;
		PomocnikGry pomocnik = new PomocnikGry();
		
		ProstyPortal portal = new ProstyPortal();
		
		int liczbaLosowa = (int)(Math.random()*5);
		int[] polozenie = {liczbaLosowa, liczbaLosowa+1, liczbaLosowa+2};
		
		portal.setPolaPolozenia(polozenie);
		boolean czyIstnieje = true;
		
		while (czyIstnieje == true) {
			String pole = pomocnik.pobierzDaneWejsciowe("Podaj liczbê");
			String wynik = portal.sprawdz(pole);
			iloscRuchow++;
			
			if(wynik.equals("zatopiony")) {
				czyIstnieje = false;
				System.out.println(iloscRuchow + " ruchow");
			}
		}
	}

}


