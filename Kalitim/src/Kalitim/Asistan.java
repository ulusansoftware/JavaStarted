package Kalitim;

public class Asistan extends Akademisyen {
	protected String yuksekLisans;

	public Asistan(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String ders,
			String yuksekLisans) {
		super(adSoyad, eposta, telefon, bolum, gorevler, ders);
		this.yuksekLisans = yuksekLisans;
	}

	@Override
	public String giris() {
		return "Asistan" + super.giris();
	}

	public String getYuksekLisans() {
		return yuksekLisans;
	}

	public void setYuksekLisans(String yuksekLisans) {
		this.yuksekLisans = yuksekLisans;
	}
	@Override
	public void derseGir(int dersSaati) {
		System.out.println(getAdSoyad()+ " " + getDers()+ "time : " + dersSaati + "Entered to Class ");
	}

}
