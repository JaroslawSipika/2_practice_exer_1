class OdtwarzaczDVD{
	boolean mozeNagrywac = false;
	
	
	void odtworzPlyteDVD() {
		System.out.println("odtwarzam p�yt� DVD");
	}
	
	
	void nagrajPlyteDVD() {
		System.out.println("nagrywam p�yt� DVD");
	}
}


public class OdtwarzaczDVDTester {

	public static void main(String[] args) {
		
		OdtwarzaczDVD o = new OdtwarzaczDVD();
		o.mozeNagrywac = true;
		o.odtworzPlyteDVD();
		
		if (o.mozeNagrywac == true) {
			o.nagrajPlyteDVD();
		}

	}

}
