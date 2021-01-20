package Fonksiyonlar;

public class PalindromSayýlar {

	
	static boolean isPalindrom(int input) {
		int tmp,tersSayi=0,kalan;
		tmp =input;
		
		while(tmp !=0) {
			kalan = tmp % 10;
			tersSayi = tersSayi * 10 + kalan;
			tmp /= 10;
			
		}
		if (input == tersSayi)
			return true;
		else
		return false;
	}
	public static void main(String[] args) {
		// 123321 121
		
		// 121  % 10 =1 , tersSayi =1 , 121 /10= 12
		// 12 ½ 10 =2 , tersSayi = tersSayi * 10 +2 =12 , 12 / 10=1	
        // 1 % 10 =1 , tersSayi = tersSayi * 10 +1 = 121  , 1 /10 =0.1 =0		
	
			System.out.println(isPalindrom(123));
	}
	
	

}
