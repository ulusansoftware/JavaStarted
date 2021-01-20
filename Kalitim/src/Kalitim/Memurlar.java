package Kalitim;

public class Memurlar extends Calisan {
	String departman, mesai;

	public Memurlar(String adSoyad, String eposta, String telefon, String departman, String mesai) {
		super(adSoyad, eposta, telefon);
		this.departman = departman;
		this.mesai = mesai;
	}

}
