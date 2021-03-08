import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



public class Main{

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		Scanner in = new Scanner(System.in);	
		while(in.hasNext()){
			String s = in.next();
			if (s.equals("!!!!!"))break;
			if(map.get(s) == null)
				map.put(s, 1);
			else 
				map.put(s, map.get(s)+ 1);
		 }
		 System.out.println(map.size());
		 List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(map.entrySet());
		 Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			 public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				 if (o2.getValue() != o1.getValue())
					 return o2.getValue() - o1.getValue();	 
				 else
					 return o1.getKey().compareTo(o2.getKey());	 
			 }
		 });
		 for (int i = 0; i < 10; i++) {
			 System.out.println(list.get(i));
		}
	}
}