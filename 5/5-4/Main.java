import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		TreeMap<String, TreeSet<Integer>> map = new TreeMap<String, TreeSet<Integer>>();
		TreeMap<Integer, String> map2 = new TreeMap<Integer, String>();
		Scanner scan = new Scanner(System.in);
		int row = 1;
		while (scan.hasNextLine()) {
			String s = scan.nextLine();
			if (s.equals("!!!!!")) {
				break;
			} 
			else {
				Scanner scan1 = new Scanner(s);
				map2.put(row, s);
				while (scan1.hasNext()) {
					String s1 = scan1.next();
					if (map.get(s1) == null) {
						TreeSet<Integer> set = new TreeSet<Integer>();
						set.add(row);
						map.put(s1, set);
					} 
					else {
						map.get(s1).add(row);
					}
				}
				scan1.close();
			}
			row++;
		}
		for (Map.Entry<String, TreeSet<Integer>> a : map.entrySet()) {
			System.out.println(a);
		}
		while (scan.hasNextLine()) {
			String s2 = scan.nextLine();
			if (s2.length() == 0) {
				System.out.println("found 0 results");
				continue;
			}
			Scanner scan1 = new Scanner(s2);
			String s = scan1.next();
			if (!map.containsKey(s)) {
				System.out.println("found 0 results");
				continue;
			}
			TreeSet<Integer> set1 = map.get(s);
			while (scan1.hasNext()) {
				String s1 = scan1.next();
				set1.retainAll(map.get(s1));
			}
			if (set1.isEmpty()) {
				System.out.println("found 0 results");
			} 
			else {
				System.out.println(set1);
				for (Integer a : set1) {
					System.out.println("line " + a + ":" + map2.get(a));
				}
			}
			scan1.close();
		}
		scan.close();
	}
}