package ulusanProjectBaslangic;

public class KarakterlerVeMantiksal {

	private static char karakter2;

	public static void main(String[] args) {
		char karakter =117;
		setKarakter2('u');
		System.out.println(karakter);
		
		boolean mantik = true;
		boolean mantik2 = false;
		System.out.println(mantik);
		System.out.println(mantik2);
		
		
	}

	public static char getKarakter2() {
		return karakter2;
	}

	public static void setKarakter2(char karakter2) {
		KarakterlerVeMantiksal.karakter2 = karakter2;
	}

}
