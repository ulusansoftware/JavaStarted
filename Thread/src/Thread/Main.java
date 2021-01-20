package Thread;

public class Main {

	public static void main(String[] args) {
		//Thread
		//Thread( new Runnable() )
		
		Islemler i1 = new Islemler("Ýlk");
		Thread t1 = new Thread(i1);
		
		Islemler i2 = new Islemler("Son");
		Thread t2 = new Thread(i2);
		
		t1.start();
		t2.start();
	}

}
