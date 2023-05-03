package 문자열_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		String s;
		
		
		map.put("name","kim");
		map.put("age","20");
		map.put("addr","시골");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println("========================");
		
		Set<String> key_Set = map.keySet();
		Collection<String> values_Set = map.values();
		
		System.out.println(key_Set);
		System.out.println(values_Set);
		
		Iterator<String> keyIt = key_Set.iterator();
		Iterator<String> valuesIt = values_Set.iterator();
		while(keyIt.hasNext()) {
			System.out.println(keyIt.next()+" : "+valuesIt.next());
		}
		
		
		
		
	}
}


