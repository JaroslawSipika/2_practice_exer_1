import java.util.ArrayList;

class Pies{
	int rasa;
	
	
}



public class Test2 {

	public static void main(String[] args) {
		
		
		ArrayList<Pies> mojaListaPsow = new ArrayList<Pies>();
		Pies mojPies = new Pies();
		mojaListaPsow.add(mojPies);
		Pies p = mojaListaPsow.get(0);
		System.out.println(p.getClass());
		
		
		if (mojPies.equals(p)) {
			System.out.println("prawda");
		}
		
		ArrayList<Object> mojaListaPsow2 = new ArrayList<Object>();
		Pies mojPies2 = new Pies();
		mojaListaPsow2.add(mojPies2);
		Pies p2 = (Pies) mojaListaPsow2.get(0);
		
		
		if (mojPies2.equals(p2)) {
			System.out.println("prawda");
		}
		
		
		
		
	}

}
