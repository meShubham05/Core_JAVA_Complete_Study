package Collection_Framework_____MAP;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		
		HashMap <Integer,String> map = new HashMap<Integer,String>();
		
		map.put(20,"Amit");
		map.put(5,"Sanket");
		map.put(3,"Rohan");
		map.put(9,"Shubham");
		map.put(10,"Aniket");
		map.put(18,"Virat");
		map.put(7,"Mahi");
		map.put(1,"KL Rahul");
		
		System.out.println("Size of map collection :"+map.size());
		
		System.out.println(map);
	}

}
