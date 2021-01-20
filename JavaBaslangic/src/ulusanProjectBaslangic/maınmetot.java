package ulusanProjectBaslangic;

public class maýnmetot{
	
	private static int ahmet;

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		System.out.println("MERHABA DUNYA");
		System.out.println("Merhaba Ben Emre"
				+"sizlerle birlikte "
				+ "java öðreniyoruz");
		System.out.println("10 + 15");
		System.out.println(10+15);
		System.out.print("Merhaba\n");
		System.out.println("merhaba		\t		Dünya	");
		System.out.println("\tMerhaba\n Dünya");
		setAhmet(27);
		
		
	}

	public static int getAhmet() {
		return ahmet;
	}

	public static void setAhmet(int ahmet) {
		maýnmetot.ahmet = ahmet;
	}

}
