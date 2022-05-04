
class CPole {
	
	int obliczPole(int wysokosc, int szerokosc) {
		return wysokosc * szerokosc;
	}
	
	
}





public class Pole {

	public static void main(String[] args) {
		
		
		CPole pol = new CPole();
		
		
		int a = pol.obliczPole(7,12);
		short c = 7;
		int b = pol.obliczPole(c, 15);
	//	int d = pol.obliczPole(57); 
		long t = 42;
	//	int f = pol.obliczPole(t, 17);
	//	int g = pol.obliczPole();
		
	//	byte h = pol.obliczPole(4, 20);
	//	int j = pol.obliczPole(2, 3, 5)
		
		
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
