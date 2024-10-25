package test;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsTest {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> hm=new Hashtable<Integer,String>();
		hm.put(4,"four");
		hm.put(1,"one");
		hm.put(3,"three");
		hm.put(2,"two");
		
		
		
		 Set<Entry<Integer, String>> entry=hm.entrySet();
		 System.out.println(entry);
	}
}
