package Thread;

public class Islemler implements Runnable {
	String name;

	public Islemler(String name) {
		this.name = name;
		System.out.println(name + " Oluþtu!");
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(this.name + " : " + i);
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			System.out.println(this.name + " hata ile karþýlaþýldý");
		}
		System.out.println(name + " Bitti");
	}

}
