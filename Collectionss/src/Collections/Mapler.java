package Collections;

import java.util.*;

public class Mapler {

	public static void main(String[] args) {
		// - clear() Map içinde bulunan bütün deðerleri siler..
		// - get(Object key) Anahtara karþýlýk gelen objeyi döndürür.
		// - put(Object key , Object Value ) : Anahtar | Deðer ikilisini kayýt eder.
		/////////////////////////////////////////////////////////
		// HashMap
		// HashMap DÜZENSÝZ ÇIKARIR sayýlara valuelere göre
		/*
		HashMap b = new HashMap();
		b.put("Türkiye", "Ankara");
		b.put("Ýngiltere", "Londra");
		b.put("Fransa", "Paris");
		Set s = b.entrySet();
		Iterator i = s.iterator();

		while (i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + "=> " + item.getValue());
		*/
		
		///////////////////////////////////////////////////////////
		//LinkedHashMap   SIRAYLA ÇIKARIR
		/*
		LinkedHashMap ogr = new LinkedHashMap();
		ogr.put("Ali", 90);
		ogr.put("Veli", 80);
		ogr.put("Ahmet", 75);
		
		Set set = ogr.entrySet();
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + " => "+ item.getValue());
		*/	
		//////////////////////////////////////////////////////	 
		//TreeMap
		//TreeMap ilk deðere göre çýkarýr valueleri küçükten büyüðe doðru
		TreeMap<Integer,String> ogr = new TreeMap();
		ogr.put(10, "Ali");
		ogr.put(5, "Veli");
		ogr.put(6, "Ahmet");
		
		Set set = ogr.entrySet();
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + " => "+ item.getValue());
			 
		}
		
		}
	}


