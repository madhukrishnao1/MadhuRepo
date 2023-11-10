package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Sort1 {

	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<>();
		map.put("madhu",12 );
		map.put("krishna",76 );
		map.put("bmk",54 );
		map.put("lpu",98 );
		List<Map.Entry<String, Integer>>list=new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		   List<Map.Entry<String, Integer>>l = list.stream().sorted((i1,i2)->i1.getValue().compareTo(i2.getValue())).collect(Collectors.toList());
		   Map<String,Integer>map1=new HashMap<>();
		   System.out.println(l);
		   for(Entry<String, Integer> o:l)
		   {
			   System.out.println(o.getKey());
			   map1.put(o.getKey(), o.getValue());
		   }
		   System.out.println(map1);
			/*
			 * for(Map.Entry<String, Integer> p:l) { System.out.println(p); }
			 * for(Map.Entry<String, Integer> o:map.entrySet()) { System.out.println(o); }
			 */

	}

}
