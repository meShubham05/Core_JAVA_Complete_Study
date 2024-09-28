package Collection_Framework_List_ArrayList;

import java.text.DateFormat.Field;
import java.util.*;

public class ArrayListCapacityDemo {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		ArrayList al = new ArrayList();
	
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(110);
		
		int size = al.size();
		 java.lang.reflect.Field field = ArrayList.class.getDeclaredField("elementData");
	        field.setAccessible(true);
	        Object[] internalArray = (Object[]) field.get(al);

	        // Printing the capacity and size of the ArrayList
	        System.out.println("ArrayList capacity: " + internalArray.length); // Capacity
	        System.out.println("ArrayList size: " + al.size()); // Number of elements in the list
	    
		
		
		int defaultSize = 0;
		System.out.println("Increment Capacity :"+al.size());
		
		
		al.remove(defaultSize);
		
		System.out.println("after delete :");
	}
}
