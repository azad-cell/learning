package collectionspractice;

import java.util.HashSet;
import java.util.Iterator;

public class SetOfInteger {

	public static void main(String[] args) {
		HashSet<Integer> inSet = new HashSet<Integer>();
		inSet.add(1);
		inSet.add(3);
		inSet.add(5);
		inSet.add(7);
		inSet.add(9);

		System.out.println(inSet);

		for (Integer i : inSet) {
			System.out.println(i);

		}
		Iterator<Integer> myIterator = inSet.iterator();
		while (myIterator.hasNext()) {
			int itemNum = myIterator.next();
			System.out.println(itemNum);

		}
		inSet.forEach(System.out::println);
	}
}
