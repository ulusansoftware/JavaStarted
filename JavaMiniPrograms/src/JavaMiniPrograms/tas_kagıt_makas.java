package JavaMiniPrograms;
import java.util.Scanner;

public class tas_kag�t_makas {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int kul_puan = 0;
		int bil_puan = 0;
		System.out.println("Ta� ka��t makas oyununa ho� geldiniz!");
		System.out.println("1-Ta� 2-Ka��t 3-Makas");
		while (true) {
			System.out.println("Se�iminiz: ");
			int secim = s.nextInt();
			int bil_secim = (int) (Math.random() * 3);
			if (secim == 1) {
				if (bil_secim == 1) {
					System.out.println("Bilgisayar�n se�imi: Ta�nSonu�: Berabere");
					System.out.println("Puan�n�z: " + kul_puan + " Bilgisayar�n puan�:" + bil_puan);
				} else if (bil_secim == 2) {
					System.out.println("Bilgisayar�n se�imi: Ka��tnSonu�: Kaybettiniz");
					bil_puan++;
					System.out.println("Puan�n�z: " + kul_puan + " Bilgisayar�n puan�:" + bil_puan);
				} else {
					System.out.println("Bilgisayar�n se�imi: MakasnSonu�: Kazand�n�z");
					kul_puan++;
					System.out.println("Puan�n�z: " + kul_puan + " Bilgisayar�n puan�:" + bil_puan);
				}
			} else if (secim == 2) {
				if (bil_secim == 1) {
					System.out.println("Bilgisayar�n se�imi: Ta�nSonu�: Kazand�n�z");
					kul_puan++;
					System.out.println("Puan�n�z: " + kul_puan + " Bilgisayar�n puan�:" + bil_puan);
				} else if (bil_secim == 2) {
					System.out.println("Bilgisayar�n se�imi: Ka��tnSonu�: Berabere");
					System.out.println("Puan�n�z: " + kul_puan + " Bilgisayar�n puan�:" + bil_puan);
				} else {
					System.out.println("Bilgisayar�n se�imi: MakasnSonu�: Kaybettiniz");
					bil_puan++;
					System.out.println("Puan�n�z: " + kul_puan + " Bilgisayar�n puan�:" + bil_puan);
				}
			} else if (secim == 3) {
				if (bil_secim == 1) {
					System.out.println("Bilgisayar�n se�imi: Ta�nSonu�: Kaybettiniz");
					bil_puan++;
					System.out.println("Puan�n�z: " + kul_puan + " Bilgisayar�n puan�:" + bil_puan);
				} else if (bil_secim == 2) {
					System.out.println("Bilgisayar�n se�imi: Ka��tnSonu�: Kazand�n�z");
					kul_puan++;
					System.out.println("Puan�n�z: " + kul_puan + " Bilgisayar�n puan�:" + bil_puan);
				} else {
					System.out.println("Bilgisayar�n se�imi: MakasnSonu�: Berabere");
					System.out.println("Puan�n�z: " + kul_puan + " Bilgisayar�n puan�:" + bil_puan);
				}
			} else {
				System.out.println("Hatal� giri� yapt�n�z tekrar deneyin");
				continue;
			}
			if (kul_puan == 3) {
				System.out.println("Oyunu " + kul_puan + "-" + bil_puan + " kazand�n�z");
				break;
			} else if (bil_puan == 3) {
				System.out.println("Oyunu " + bil_puan + "-" + kul_puan + " kaybettiniz");
				break;
			}
		}
	}
}