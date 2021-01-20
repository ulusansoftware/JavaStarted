package Kalitim;

public class Main {

	public static void main(String[] args) {

		//Akademisyen a = new Akademisyen(" Ahmet", " a@gmail.com", " 05500000000", " CENG", " Hoca", " CENG 101");

		OgretimUyesi o = new OgretimUyesi(" Mehmet", " m@gmail.com ", " 000 ", " CENG ", " Hoca ", "MIS102 ",
				"Yard. Doç.");

		Memurlar m = new Memurlar(" Cengiz ", " c@gmail.com ", " 05510000000 ", " Bilgi Ýþlem ", " Tam Zamanlý ");

		// Calisan c = new Akademisyen(" Ahmet", " a@gmail.com", " 05500000000", "
		// CENG", " Hoca", " CENG 101");
		// Calisan [] girisListesi = {a,o,m};
		// Calisan.listele(girisListesi);
		
		o.derseGir(10 );

		
		
	}
}
