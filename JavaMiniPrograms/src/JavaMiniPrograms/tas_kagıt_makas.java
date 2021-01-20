package JavaMiniPrograms;
import java.util.Scanner;

public class tas_kagýt_makas {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int kul_puan = 0;
		int bil_puan = 0;
		System.out.println("Taþ kaðýt makas oyununa hoþ geldiniz!");
		System.out.println("1-Taþ 2-Kaðýt 3-Makas");
		while (true) {
			System.out.println("Seçiminiz: ");
			int secim = s.nextInt();
			int bil_secim = (int) (Math.random() * 3);
			if (secim == 1) {
				if (bil_secim == 1) {
					System.out.println("Bilgisayarýn seçimi: TaþnSonuç: Berabere");
					System.out.println("Puanýnýz: " + kul_puan + " Bilgisayarýn puaný:" + bil_puan);
				} else if (bil_secim == 2) {
					System.out.println("Bilgisayarýn seçimi: KaðýtnSonuç: Kaybettiniz");
					bil_puan++;
					System.out.println("Puanýnýz: " + kul_puan + " Bilgisayarýn puaný:" + bil_puan);
				} else {
					System.out.println("Bilgisayarýn seçimi: MakasnSonuç: Kazandýnýz");
					kul_puan++;
					System.out.println("Puanýnýz: " + kul_puan + " Bilgisayarýn puaný:" + bil_puan);
				}
			} else if (secim == 2) {
				if (bil_secim == 1) {
					System.out.println("Bilgisayarýn seçimi: TaþnSonuç: Kazandýnýz");
					kul_puan++;
					System.out.println("Puanýnýz: " + kul_puan + " Bilgisayarýn puaný:" + bil_puan);
				} else if (bil_secim == 2) {
					System.out.println("Bilgisayarýn seçimi: KaðýtnSonuç: Berabere");
					System.out.println("Puanýnýz: " + kul_puan + " Bilgisayarýn puaný:" + bil_puan);
				} else {
					System.out.println("Bilgisayarýn seçimi: MakasnSonuç: Kaybettiniz");
					bil_puan++;
					System.out.println("Puanýnýz: " + kul_puan + " Bilgisayarýn puaný:" + bil_puan);
				}
			} else if (secim == 3) {
				if (bil_secim == 1) {
					System.out.println("Bilgisayarýn seçimi: TaþnSonuç: Kaybettiniz");
					bil_puan++;
					System.out.println("Puanýnýz: " + kul_puan + " Bilgisayarýn puaný:" + bil_puan);
				} else if (bil_secim == 2) {
					System.out.println("Bilgisayarýn seçimi: KaðýtnSonuç: Kazandýnýz");
					kul_puan++;
					System.out.println("Puanýnýz: " + kul_puan + " Bilgisayarýn puaný:" + bil_puan);
				} else {
					System.out.println("Bilgisayarýn seçimi: MakasnSonuç: Berabere");
					System.out.println("Puanýnýz: " + kul_puan + " Bilgisayarýn puaný:" + bil_puan);
				}
			} else {
				System.out.println("Hatalý giriþ yaptýnýz tekrar deneyin");
				continue;
			}
			if (kul_puan == 3) {
				System.out.println("Oyunu " + kul_puan + "-" + bil_puan + " kazandýnýz");
				break;
			} else if (bil_puan == 3) {
				System.out.println("Oyunu " + bil_puan + "-" + kul_puan + " kaybettiniz");
				break;
			}
		}
	}
}