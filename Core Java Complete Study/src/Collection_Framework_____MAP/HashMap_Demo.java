 package Collection_Framework_____MAP;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		
		
		
		System.out.println(" Data Fetching Using HashMap :\n");
		HashMap <Integer,String> map = new HashMap<Integer,String>();
		
		map.put(20,"Amit");
		map.put(5,"Sanket");
		map.put(3,"Rohan");
		map.put(9,"Shubham");
		map.put(10,"Aniket");
		map.put(18,"Virat");
		map.put(7,"Mahi");
		map.put(1,"KL Rahul");
		
		System.out.println(map);
		
		
		System.out.println("\nData Fetchhing Using LinkedHashMap \n");
		
		
		LinkedHashMap <Integer,String> lmap = new LinkedHashMap<Integer,String>();		
		lmap.put(2, "Amit");
		lmap.put(5,"Sanket");
		lmap.put(3,"Rohan");
		lmap.put(9,"Shubham");
		lmap.put(10,"Aniket");
		lmap.put(18,"Virat");
		lmap.put(7,"Mahi");
		lmap.put(1,"KL Rahul");
		
		System.out.println("Size of LinkedHashMap : "+lmap.size());		
		System.out.println(lmap);	
		
		Set<Integer> set = lmap.keySet();
		
		for(Integer key:set)
		{
			System.out.println(key+"--->"+lmap.get(key)); 			
		}
		
				
		System.out.println("\n Data Fetching Using TreeMap : \n");
		
		TreeMap<Integer, String> treemap=new TreeMap<Integer,String>();
		treemap.put(5,"Rohan");
		treemap.put(2,"Sanket");
		treemap.put(1,"Amit");
		treemap.put(8,"Aniket");
		treemap.put(10,"Shubham");
		
		
		Set<Integer> set3 = treemap.keySet();
		
		for(Integer key :set3)
		{
			System.out.println(key+" "+treemap.get(key));
		}
		
		
	}

}
