
class Zgadywanka {
	Gracz p1;
	Gracz p2;
	Gracz p3;
	
	public void ropocznijGre() {
		p1 = new Gracz();
		p2 = new Gracz();
		p3 = new Gracz();
		
		int typp1 = 0;
		int typp2 = 0;
		int typp3 = 0;
		
		boolean p1odgadl = false;
		boolean p2odgadl = false;
		boolean p3odgadl = false;
		
		int liczbaOdgadywana = (int)(Math.random() * 10);
		System.out.println("Myœlê o liczbie z zakresu od 0 do 9...");
		
		while(true) {
			System.out.println("Nale¿y wytypowaæ liczbê: " + liczbaOdgadywana );
			
			p1.zgaduj();
			p2.zgaduj();
			p3.zgaduj();
			
			typp1 = p1.liczba;
			System.out.println("Gracz pierwszy wytypowa³ liczbê: " + typp1);
			
			typp2 = p2.liczba;
			System.out.println("Gracz drugi wytypowa³ liczbê: " + typp2);
			
			typp3 = p3.liczba;
			System.out.println("Gracz trzeci wytypowa³ liczbê: " + typp3);
			
			if (typp1 == liczbaOdgadywana) {
				p1odgadl = true;
			}
			if (typp2 == liczbaOdgadywana) {
				p2odgadl = true;
			}
			if (typp3 == liczbaOdgadywana) {
				p3odgadl = true;
			}
			
			if (p1odgadl || p2odgadl || p3odgadl) {
				
				System.out.println("Mamy zwyciêzcê!");
				System.out.println("Czy gracz pierwszy wytypowa³ poprawnie? " + p1odgadl);
				System.out.println("Czy gracz drugi wytypowa³ poprawnie? " + p2odgadl);
				System.out.println("Czy gracz trzeci wytypowa³ poprawnie? " + p3odgadl);
				System.out.println("Koniec gry.");
				break;
			} else {
				System.out.println("Gracze musieli spróbowaæ jeszcze raz.");
			} // koniec if-else
		} // koniec while
	} // koniec metody rozpocznijGre
} // koniec klasy
