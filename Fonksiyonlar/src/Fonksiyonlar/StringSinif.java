package Fonksiyonlar;

public class StringSinif {

	public static void main(String[] args) {
		// str.length() : Girilen karakterin say�s�n� d�nd�r�r
		// str.concat(str2):String birle�tirme
		// str.indexOf('K):karakterin konumunu verir
		// str.charAt(5): indexOf metoduna benzer �ekilde bu sefer de konumu verilen
		// karakteri
		// str.compareTo("Kodlama"):b�y�k/k���k fark duyarl� olarak kar��la�t�r�r
		// str.compareToIgnoreCase("KODlama"):b�y�k k���k harf duyarl� olmadan
		// kar��la�t�r�r
		// str.contains("kod"):girilen de�er string i�inde ge�iyor mu diye kontrol eder
		// str.endsWith("a"):belirtlilen karakter(ler) ile bitiyorsa true de�erini
		// d�nd�r�r.
		// str.replace("Kodlama" , "Vakti"):string de�i�tirme i�in kullan�l�r
		// str.toLowerCase(); , str.toUpperCase();

		// char[] str = {'U','L','U','S','A','N' };
		// String metin = new String(str);
		// System.out.println(metin);

		String metin = "EMRE HELLO";
		String metin2 = "ULUSAN";
		System.out.println(metin.length());
		System.out.println(metin + metin2);
		System.out.println(metin.concat(metin2));
		System.out.println(metin.indexOf('L'));
		System.out.println(metin.charAt(3));
		System.out.println(metin.compareTo("EmRe"));
		System.out.println(metin.contains("EM"));
		System.out.println(metin.endsWith("RE"));
		System.out.println(metin.replace("EMRE", "HELLO"));
		System.out.println(metin.toLowerCase());
		System.out.println(metin.toUpperCase());
		
	}

}
