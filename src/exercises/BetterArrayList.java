package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class BetterArrayList extends ArrayList<Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Object pop() {
		if (isEmpty()) {
			return null;
		} else {
			Object o = get(size() - 1);
			remove(o);
			return o;
		}
	}

	private void print() {
		System.out.println(Arrays.toString(toArray()));
	}

	private void insert(Object o, int index) {
		if (index < 0)
			System.err.println("Index out of bounds! Index must be nonnegative number.");
		else if (size() <= index) {
			for (int i = size(); i < index; i++)
				add(i, null);
			add(o);
		} else {
			add(index, o);
		}
	}

	public static void main(String[] args) {

		BetterArrayList bal = new BetterArrayList();
		bal.add("str");
		bal.add(243);
		bal.add("asddf");
		bal.add(234);
		bal.add("dsf");
		bal.add("fdsg");
		bal.insert("we", 12);

		bal.print();
		for (int i = 0; i < 7; i++)
			System.out.println(bal.pop());
		bal.insert("abc", 2);
		bal.print();

		BetterArrayList bal2 = new BetterArrayList();
		System.out.println(bal2.size());
		bal2.insert(123, 5);
		bal2.print();
		bal2.insert(456, 3);
		bal2.print();
		bal2.remove(5);
		bal2.print();
		bal2.remove(2);
		bal2.print();
	}
}
