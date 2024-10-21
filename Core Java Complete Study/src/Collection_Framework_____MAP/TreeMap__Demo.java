package Collection_Framework_____MAP;

import java.util.*;

public class TreeMap__Demo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treemap=new TreeMap<Integer,String>();
		treemap.put(5,"Rohan");
		treemap.put(2,"Sanket");
		treemap.put(1,"Amit");
		treemap.put(8,"Aniket");
		treemap.put(10,"Shubham");
		
		
		Set<Integer> set = treemap.keySet();
		
		for(Integer key :set)
		{
			System.out.println(key+" "+treemap.get(key));
		}
		
		
	}

}
