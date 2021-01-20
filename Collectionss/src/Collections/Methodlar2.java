package Collections;

import java.util.PriorityQueue;

public class Methodlar2 {

	public static void main(String[] args) {
		// -element () Kuyruðun baþýnda, öðreyi verir,ama onu kuyruktan atmaz.
		// -offer (E o) Mümkünse , verilen öðeyi kuyruða ekler
		// -peek () Kuyruðun baþýndaki öðeyi verir , ama onu kuyruktan atmaz. Kuyruk
		// boþsa , null verir.
		// -pool () Kuyruðun baþýndaki öðeyi verir ve onu kuyruktan atar . Kuyruk boþsa
		// , null verir.
		// -remove () Kuyruðun baþýndaki öðeyi verir ve onu kuyruktan atar.

		PriorityQueue q = new PriorityQueue();

		q.add(80);
		q.add(20); 
		q.add(10);
		q.add(50);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
