
public class Krasomowca {

	public static void main(String[] args) {
		
		String[] listaSlow1 = {"architektura wielowarstwowa", "30000 metrów", "rozwi¹zanie B-do-B", "aplikacja kliencka", "interfejs internetowy", "inteligenta karta", "rozwi¹zanie dynamiczne", "szeœæ sigma", "przenikliwoœæ"
		};
		String[] listaSlow2 = {"zwiêksza mo¿liwoœci", "poprawia atrakcyjnoœæ", "pomna¿a wartoœæ", "opracowana dla", "bazuj¹ca na", "rozproszona", "sieciowa", "skoncentrowana na", "podniesiona na wy¿szy poziom", "skierowanej", "udostêpniona"
		};
		String[] listaSlow3 = {"procesu", "punktu wpisywania", "rozwi¹zania", "strategii", "paradygmatu", "portalu", "witryny", "wersji", "misji"
		};
		
		
		int lista1Dlugosc = listaSlow1.length;
		int lista2Dlugosc = listaSlow2.length;
		int lista3Dlugosc = listaSlow3.length;
		
		int rnd1 = (int) (Math.random() * lista1Dlugosc);
		int rnd2 = (int) (Math.random() * lista2Dlugosc);
		int rnd3 = (int) (Math.random() * lista3Dlugosc);
		
		System.out.println(lista1Dlugosc);
		System.out.println(lista2Dlugosc);
		System.out.println(lista3Dlugosc);
		
		String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];
		
		System.out.println("To jest to czego nam trzeba: " + zdanie);
}
	
}