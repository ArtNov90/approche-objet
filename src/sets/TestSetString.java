package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();

		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");

		Iterator<String> iter = set.iterator();

		while (iter.hasNext()) {
			String s = iter.next();
			if (s.equals("Allemagne")) {
				iter.remove();
				System.out.println(set);
			}
		}

	}

}
