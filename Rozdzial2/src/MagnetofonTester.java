class Magnetofon {
	boolean mozeNagrywac = false;
	
	void odtworzTasme() {
		System.out.println("odtwarzam taœmê");
	}
	
	void nagrajTasme() {
		System.out.println("nagrywam taœmê");
	}
}


class MagnetofonTester {

	public static void main(String[] args) {
		Magnetofon m = new Magnetofon();
		m.mozeNagrywac = true;
		m.odtworzTasme();
		
		if (m.mozeNagrywac == true) {
			m.nagrajTasme();
		}
	}
}
