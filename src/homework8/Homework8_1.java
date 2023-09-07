package homework8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework8_1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		// for
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===========================");

		// iterator
		for (Iterator it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		System.out.println("===========================");

		// for-each
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println("===========================");

		// 移除不是Nnumber的物件
		for (int i = 0; i < list.size();) {
			if (!(list.get(i) instanceof Number)) {
				list.remove(list.get(i));
			} else {
				i++;
			}
		}
		System.out.println(list);

//		int i = 0;
//		while (!list.isEmpty()) {
//			if (list.get(i) instanceof Number) {
//				System.out.println(list.get(i));
//			}else {
//				list.remove(i);
//			}
//			i++;
//		}
	}
}