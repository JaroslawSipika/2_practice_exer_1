interface Nos {
	public int iMetoda();
}


abstract class Picasso implements Nos {
	public int iMetoda() {
		return 7;
	}
	
	public Picasso() {
		System.out.println("Konstruktor Picasso");
	}
}

class Klaun extends Picasso {
	
//	public int iMetoda() {
//		return 10;
//	}
	
	public Klaun() {
		System.out.println("Konstruktor Klaun");
	}
	
	
	
}


class Akty extends Picasso {
	public int iMetoda() {
		return 5;
	}
}

public class Of76 extends Klaun {

	public Of76() {
		System.out.println("Konstruktor Of76");
	}
	
	
	public static void main(String[] args) {
		Picasso[] i = new Picasso[3];
		i[0] = new Akty();
		i[1] = new Klaun();
		i[2] = new Of76();
		for (int x = 0; x < 3; x++) {
			System.out.println( i[x].iMetoda() + " " + i[x].getClass());
		}

	}

}
