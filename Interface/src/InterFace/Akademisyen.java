package InterFace;

public class Akademisyen implements ICalisan {
	private String adSoyad, bolum, gorevler;

	public Akademisyen(String adSoyad, String bolum, String gorevler) {
		super();
		this.adSoyad = adSoyad;
		this.bolum = bolum;
		this.gorevler = gorevler;
	}

	@Override
	public void giris() {
		System.out.println("ENTERED");
	}

	@Override
	public void cikis() {
		System.out.println("CHECK OUT");

	}

	@Override
	public boolean yemek(int saat) {
		System.out.println("FOOD EATEN");
		return true;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getGorevler() {
		return gorevler;
	}

	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}

}
