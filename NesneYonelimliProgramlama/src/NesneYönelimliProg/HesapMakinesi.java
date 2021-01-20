package NesneYönelimliProg;

public class HesapMakinesi {
	public int sayi1;
	public int sayi2;
	public String renk;
	final static double PI = 3.14;

	HesapMakinesi(int sayi1, int sayi2, String renk) {
		this.sayi1 = sayi1;
		this.sayi2 = sayi2;
		this.renk = renk;
	}

	public int toplama() {
		return this.sayi1 + this.sayi2;
	}

	public int cıkarma() {
		return this.sayi1 - this.sayi2;
	}

	public int carpma() {
		return this.sayi1 * this.sayi2;
	}

	public int bolme() {
		return this.sayi1 / this.sayi2;
	}

	public double area(int r) {
		return HesapMakinesi.PI * (Math.pow(r, 2));
	}
}
