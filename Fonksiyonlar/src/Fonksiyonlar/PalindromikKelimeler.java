package Fonksiyonlar;

public class PalindromikKelimeler {

	public static void main(String[] args) {
		// kapak,yapay,yatak,teðet,121
		String str = "kapak",tmp="";
		
		for(int i=str.length()-1 ; i>=0; i--) {
			tmp+=str.charAt(i);
		}
			
		if(tmp.equals(str)) {
			System.out.println("polindromik");
		}
	}

}
