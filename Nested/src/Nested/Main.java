package Nested;

public class Main {

	public static void main(String[] args) {
		NonStatic n = new NonStatic();
		NonStatic.Inner inner = n.new Inner();
		// inner.run();

		Static.Inner s = new Static.Inner();
		// s.run();

		Local l = new Local();
		// l.run();

		Anonim a = new Anonim() {
			public void run() {
				System.out.println("Anonim sýnýfýna ait run metodu !");
			}
			
			public void print() {
				System.out.println("print");
				
			}
		};
		a.run();
		a.print();
		
	}
	
}
