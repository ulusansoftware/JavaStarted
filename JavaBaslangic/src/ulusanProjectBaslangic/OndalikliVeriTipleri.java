package ulusanProjectBaslangic;

public class OndalikliVeriTipleri {

	private static float sayi2;

	public static void main(String[] args) {
		float sayi1 = 34.5f;
		setSayi2(35.1f);
		System.out.println(sayi1);
		
		double ondalikliSayi3 =54.0;
 		System.out.println(ondalikliSayi3);
		
		
	}

	public static float getSayi2() {
		return sayi2;
	}

	public static void setSayi2(float sayi2) {
		OndalikliVeriTipleri.sayi2 = sayi2;
	}

}
