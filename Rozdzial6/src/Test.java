import java.util.ArrayList;

class Jajko{
	int x = 0;
}


public class Test {

	public static void main(String[] args) {
	
		
		ArrayList<Jajko> mojaTbl = new ArrayList<Jajko>();
		
		Jajko j = new Jajko();
		mojaTbl.add(j);
		
		Jajko k = new Jajko();
		mojaTbl.add(k);
		
		int ilosc = mojaTbl.size();
		System.out.println(ilosc);
		
		
		int indeks = mojaTbl.indexOf(j);
		System.out.println(indeks);
		
		int indeks1 = mojaTbl.indexOf(k);
		System.out.println(indeks1);

		mojaTbl.remove(k);
		mojaTbl.remove(j);
		
		int ilosc1 = mojaTbl.size();
		System.out.println(ilosc1);
		
		
		
		
		boolean czyJest = mojaTbl.contains(k);
		System.out.println(czyJest);
		
		

	}

}
