package Fonksiyonlar;

public class StringSinif {

	public static void main(String[] args) {
		// str.length() : Girilen karakterin sayýsýný döndürür
		// str.concat(str2):String birleþtirme
		// str.indexOf('K):karakterin konumunu verir
		// str.charAt(5): indexOf metoduna benzer þekilde bu sefer de konumu verilen
		// karakteri
		// str.compareTo("Kodlama"):büyük/küçük fark duyarlý olarak karþýlaþtýrýr
		// str.compareToIgnoreCase("KODlama"):büyük küçük harf duyarlý olmadan
		// karþýlaþtýrýr
		// str.contains("kod"):girilen deðer string içinde geçiyor mu diye kontrol eder
		// str.endsWith("a"):belirtlilen karakter(ler) ile bitiyorsa true deðerini
		// döndürür.
		// str.replace("Kodlama" , "Vakti"):string deðiþtirme için kullanýlýr
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
