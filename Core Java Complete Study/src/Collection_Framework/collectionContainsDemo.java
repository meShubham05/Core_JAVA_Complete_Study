package Collection_Framework;

import java.util.*;

public class collectionContainsDemo {
public static void main(String[] args) {
	
	List list1 = Arrays.asList(1,2,3,4,5,6);
	
	
	List list2 = Arrays.asList(6,4,2,3,4,1);
	
	boolean result = list1.containsAll(list2);
	
	System.out.println("The result is : "+result);
}
}
