package Nested;

public class Local {

	public void run() {

		class Yerel {
			int a;

			Yerel(int a) {
				this.a = a;
			}

			public void print() {
				System.out.println(a);
			}

		}
		Yerel y = new Yerel(10);
		y.print();
	}
}