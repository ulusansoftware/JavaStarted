package JavaMiniPrograms;
import java.util.Scanner;
public class etkinlikOnerenProgram {

	public static void main(String[] args) {
		try (//Hava S�cakl���n� al.
				//S�cakl�k 30 veya daha y�ksekse y�zmeyi �ner.
				//5 ile 30 derece aras�ndaysa sinema izlemeyi �ner.
				//5 derecenin alt�ndaysa daha az ise kayak yapmay� �ner
		Scanner scan = new Scanner(System.in)) {
			int s�caklik;
			System.out.println("HAVA SICAKLI�INI G�R�N�Z :");
			s�caklik = scan.nextInt();
			
			if (s�caklik > 30) {
				System.out.println("Bu havada y�zmenizi �neriyorum.");
			}else if(s�caklik <= 30 && s�caklik >=5) {
				System.out.println("Bu havada sinemaya gitmeniz �ok iyi olur :) .");
			} else {
				System.out.println("Bu havada en iyi kaya�a gidilirr.");
			}
		}
	}
}
