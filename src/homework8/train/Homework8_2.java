package homework8.train;

import java.util.*;

public class Homework8_2 {

	public static void main(String[] args) {

		Train[] trains = new Train[7];
		trains[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		trains[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		trains[2] = new Train(118, "自強", "高雄", "台北", 500);
		trains[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		trains[4] = new Train(122, "自強", "台中", "花蓮", 600);
		trains[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		trains[6] = new Train(1254, "區間", "屏東", "基隆", 700);

		Set<Train> hashSet = new HashSet<>();
		for (int i = 0; i < trains.length; i++) {
			hashSet.add(trains[i]);
		}

		// For each
		for (Train t : hashSet) {
			System.out.println(t);
		}

		// Iterator
		/*
		 * Iterator<Train> objs = hashSet.iterator(); while(objs.hasNext()) {
		 * System.out.println(objs.next()); }
		 */
		System.out.println("============================================================");

		// 將 HashSet 轉型成 ArrayList 後使用 Collections 的 sort 方法達到資料排序
		List<Train> arrayList = new ArrayList<>(hashSet);
		Collections.sort(arrayList);

		// For each
		for (Train t : arrayList) {
			System.out.println(t);
		}

		// Iterator
		/*
		 * Iterator<Train> objs1 = arrayList.iterator(); while(objs1.hasNext()) {
		 * System.out.println(objs1.next()); }
		 */

		// 傳統 For 迴圈

		/*
		 * for (int i = 0; i < arrayList.size(); i++) { System.out.println(list.get(i)); }
		 */

		// 實做 Comparable 改寫 CompareTo 排序車次，將資料加入 Train 陣列中，使用sort功能排序
		/*
		Arrays.sort(trains);
		for (int i = 0; i < trains.length; i++) {
			System.out.println(trains[i]);
		}
		*/
		System.out.println("============================================================");

		// 轉型 HashSet to TreeSet，改寫equals, hashCode方法，達到資料不重複
		TreeSet<Train> treeSet = new TreeSet<Train>(hashSet);

		// For each
		for (Train t : treeSet) {
			System.out.println(t);
		}

		// Iterator

		/*
		Iterator<Train> objs2 = treeSet.iterator();
		while (objs2.hasNext()) {
			System.out.println(objs2.next());
		}
		*/

	}
}
