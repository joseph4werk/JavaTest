package xxx;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LotteryTest {
	public static void main(String[] args) {
		// 每次執行都能隨機得到6個不重複的數字 介於1~49之間


		Set<Integer> set = new TreeSet<>();

		while (set.size() < 6) {
			set.add((int) (Math.random() * 49) + 1);
		}
		System.out.println("Set size: " + set.size());
		System.out.println("6 Random Numbers: " + set);

	}

}
