package JavaMiniPrograms;
import java.util.Scanner;

public class AskOlcer {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Ýsminizi giriniz: ");
		String isim1 = input.nextLine();
		System.out.println("Sevgilinizin isimini giriniz: ");
		String isim2 = input.nextLine();
		int puan = isim1.length() + isim2.length();
		if (isim1.length() > isim2.length()) {
			puan -= 3;
		} else {
			puan += 3;
		}
		puan = puan * 69 / (100 + isim2.length());
		if (puan > 10) {
			puan = 10;
		}
		System.out.println(isim1 + " ile " + isim2 + " çiftinin aþk puaný: " + puan);
	}
}
