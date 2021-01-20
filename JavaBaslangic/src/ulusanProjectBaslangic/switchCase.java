
package ulusanProjectBaslangic;
import java.util.Scanner;

public class switchCase {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Sayý giriniz :");
		int sayi = scan.nextInt();
		switch(sayi) {
		case 1 :
			System.out.println("Sayi 1 e eþittir");
			break ;
		case 2 :
			System.out.println("Sayi 2 ye eþittir");
			break;
		case 3 :
			System.out.println("Sayi 3 e eþittir");
			break;
			default:
				System.out.println("Geçersiz sayý.");
		}
		
		
	}

}
