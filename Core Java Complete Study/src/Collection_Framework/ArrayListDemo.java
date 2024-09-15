package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
	ArrayList  ad= new ArrayList();
	ad.add(10);
	ad.add(20);
	
	ad.add(30);
	ad.add(40);
	ad.add (50);
	
	System.out.println(ad);
	
	Iterator it = ad.iterator();

			while(it.hasNext())
			{
				Object o =it.next();
				System.out.println(o);
			}
			
	}
	
}
