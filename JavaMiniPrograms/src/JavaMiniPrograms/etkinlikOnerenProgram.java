package JavaMiniPrograms;
import java.util.Scanner;
public class etkinlikOnerenProgram {

	public static void main(String[] args) {
		try (//Hava Sýcaklýðýný al.
				//Sýcaklýk 30 veya daha yüksekse yüzmeyi öner.
				//5 ile 30 derece arasýndaysa sinema izlemeyi öner.
				//5 derecenin altýndaysa daha az ise kayak yapmayý öner
		Scanner scan = new Scanner(System.in)) {
			int sýcaklik;
			System.out.println("HAVA SICAKLIÐINI GÝRÝNÝZ :");
			sýcaklik = scan.nextInt();
			
			if (sýcaklik > 30) {
				System.out.println("Bu havada yüzmenizi öneriyorum.");
			}else if(sýcaklik <= 30 && sýcaklik >=5) {
				System.out.println("Bu havada sinemaya gitmeniz çok iyi olur :) .");
			} else {
				System.out.println("Bu havada en iyi kayaða gidilirr.");
			}
		}
	}
}
