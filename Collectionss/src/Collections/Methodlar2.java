package Collections;

import java.util.PriorityQueue;

public class Methodlar2 {

	public static void main(String[] args) {
		// -element () Kuyru�un ba��nda, ��reyi verir,ama onu kuyruktan atmaz.
		// -offer (E o) M�mk�nse , verilen ��eyi kuyru�a ekler
		// -peek () Kuyru�un ba��ndaki ��eyi verir , ama onu kuyruktan atmaz. Kuyruk
		// bo�sa , null verir.
		// -pool () Kuyru�un ba��ndaki ��eyi verir ve onu kuyruktan atar . Kuyruk bo�sa
		// , null verir.
		// -remove () Kuyru�un ba��ndaki ��eyi verir ve onu kuyruktan atar.

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
