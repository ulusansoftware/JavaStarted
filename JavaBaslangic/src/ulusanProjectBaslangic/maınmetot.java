package ulusanProjectBaslangic;

public class ma�nmetot{
	
	private static int ahmet;

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		System.out.println("MERHABA DUNYA");
		System.out.println("Merhaba Ben Emre"
				+"sizlerle birlikte "
				+ "java ��reniyoruz");
		System.out.println("10 + 15");
		System.out.println(10+15);
		System.out.print("Merhaba\n");
		System.out.println("merhaba		\t		D�nya	");
		System.out.println("\tMerhaba\n D�nya");
		setAhmet(27);
		
		
	}

	public static int getAhmet() {
		return ahmet;
	}

	public static void setAhmet(int ahmet) {
		ma�nmetot.ahmet = ahmet;
	}

}
