
public class Bottles {

	public static void main(String[] args) {
		
		int liczba = 99;
		String slowo = "bottles";
		
		while (liczba > 0) {
			
			
			System.out.println(liczba + " " + slowo + " of beer on the wall");
			System.out.println(liczba + " " + slowo + " of beer");
			System.out.println("Take one down and pass it around");
			liczba = liczba - 1;

			if ( liczba == 1 ) {
				slowo = "bottle";
			}
			
			if ( liczba == 0 ) {
				System.out.println("No more bottles of beer on the wall");
			}
			else {
			
					System.out.println(liczba + " " + slowo + " of beer on the wall");
			}
			System.out.println(" ");
		}
		
	}

}

