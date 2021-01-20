package Collections;

import java.util.*;

public class Methodlar1 {

	public static void main(String[] args) {
		// -element () Kuyruðun baþýnda, öðreyi verir,ama onu kuyruktan atmaz.
		// -offer (E o) Mümkünse , verilen öðeyi kuyruða ekler
		// -peek () Kuyruðun baþýndaki öðeyi verir , ama onu kuyruktan atmaz. Kuyruk
		// boþsa , null verir.
		// -pool () Kuyruðun baþýndaki öðeyi verir ve onu kuyruktan atar . Kuyruk boþsa
		// , null verir.
		// -remove () Kuyruðun baþýndaki öðeyi verir ve onu kuyruktan atar.

		Queue q = new LinkedList();
		q.add("Deniz");
		q.add("Mehmet");

		q.offer("Ali");
		q.offer("Damla");

		// System.out.println("remove() : " + q.remove());
		// System.out.println("element() : " + q.element());
		System.out.println("peek() : " + q.peek());

		q.forEach(i -> System.out.println(i));

	}

}
