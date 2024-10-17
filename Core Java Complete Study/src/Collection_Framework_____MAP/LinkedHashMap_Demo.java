package Collection_Framework_____MAP;


import java.util.*;

public class LinkedHashMap_Demo {
	
	public static void main(String[] args) 
	{
		LinkedHashMap <Integer,String> map = new LinkedHashMap<Integer,String>();		
		map.put(2, "Amit");
		map.put(5,"Sanket");
		map.put(3,"Rohan");
		map.put(9,"Shubham");
		map.put(10,"Aniket");
		map.put(18,"Virat");
		map.put(7,"Mahi");
		map.put(1,"KL Rahul");
		
		System.out.println("Size of LinkedHashMap : "+map.size());		
		System.out.println(map);	
		
		Set<Integer> set = map.keySet();
		
		for(Integer key:set)
		{
			System.out.println(key+"--->"+map.get(key)); 			
		}
		
		Set<Integer> set2 = map.keySet();
		
		for(Integer key2:set2)
		{
			System.out.println(key2+"---->"+map.get(key2));
		}
		
	}
}
