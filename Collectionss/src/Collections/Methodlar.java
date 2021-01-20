package Collections;

import java.util.*;

public class Methodlar {

	public static void main(String[] args) {
		// HashSet<E>
		// LinkedHashSet<E>
		// TreeSet <E>

		/*
		 * HashSet h = new HashSet(); h.add("12 STR"); h.add(12); h.add(12); h.add(12);
		 * h.add(12.0); // h.add(true); h.add(null);
		 * 
		 * // h.remove(12); h.size(); // System.out.println(h.size());
		 * 
		 * Iterator itr = h.iterator();
		 * 
		 * while (itr.hasNext()) { // System.out.println(itr.next()); }
		 * 
		 * // h.forEach(item -> System.out.println(item + " " ));
		 * 
		 */

		// LinkedHashSet<2>

		/*
		 * LinkedHashSet gunler = new LinkedHashSet(); gunler.add("Pazartesi");
		 * gunler.add("Salý"); gunler.add("Çarþamba"); gunler.add("Perþembe");
		 * gunler.add("Cuma"); gunler.add("Cumartesi"); gunler.add("Pazar");
		 * 
		 * gunler.remove("Pazar"); gunler.add("Pazartesi"); gunler.add("Cuma");
		 * 
		 * gunler.forEach(item -> System.out.print(item + ","));
		 * 
		 * // TreeSet <E>
		 * 
		 * /* TreeSet tree = new TreeSet(); tree.add(10); tree.add(1); tree.add(2);
		 * tree.add(6); tree.add(4);
		 * 
		 * tree.forEach(item -> System.out.println(item));
		 */

		// ArrayList

		/*
		 * ArrayList country = new ArrayList(); country.add("Ankara");
		 * country.add("Siirt"); country.add("Bolu"); country.add("Ankara");
		 * 
		 * country.add(1, "Ýstanbul"); country.remove(1);
		 * 
		 * Iterator itr = country.iterator();
		 * 
		 * while (((java.util.Iterator) itr).hasNext()) {
		 * System.out.println(itr.next()); }
		 * 
		 * // country.forEach(i -> System.out.println(i));
		 */

		// Vector <E>

		/*
		 * Vector v = new Vector(4,2); v.add("Armut"); v.add("Kiraz"); v.add("Çilek");
		 * v.add("Kavun"); v.add("Karpuz");
		 * 
		 * System.out.println("Boyut: " + v.size()); System.out.println("Kapasitesi : "
		 * + v.capacity());
		 * 
		 * v.remove(0); System.out.println(v.firstElement());
		 */
	}

}
