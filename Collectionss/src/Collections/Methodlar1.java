package Collections;

import java.util.*;

public class Methodlar1 {

	public static void main(String[] args) {
		// -element () Kuyru�un ba��nda, ��reyi verir,ama onu kuyruktan atmaz.
		// -offer (E o) M�mk�nse , verilen ��eyi kuyru�a ekler
		// -peek () Kuyru�un ba��ndaki ��eyi verir , ama onu kuyruktan atmaz. Kuyruk
		// bo�sa , null verir.
		// -pool () Kuyru�un ba��ndaki ��eyi verir ve onu kuyruktan atar . Kuyruk bo�sa
		// , null verir.
		// -remove () Kuyru�un ba��ndaki ��eyi verir ve onu kuyruktan atar.

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
