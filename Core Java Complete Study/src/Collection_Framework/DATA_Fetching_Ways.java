package Collection_Framework;

import java.util.*;

public class DATA_Fetching_Ways {

	public static void main(String x[])
	{
		
// ***********************1 :By Using For Loop :***********************
		
		Vector v = new Vector();
		 v.add(10);  //index=0
		 v.add(20); //index=1
		 v.add(30); //index=2
		 v.add(40); //index=3
		 v.add(50); //index=4
		for(int i=0; i<v.size(); i++)
		{            Object obj = v.get(i); //v.get(2)
			  System.out.println(obj);
		}

		
		
// **************** 2: By Using Enumeration : ****************
		
		Enumeration e =v.elements();
		
		while(e.hasMoreElements())
		{
			Object obj =e.nextElement();
			System.out.println(obj);
		}
		
// ************************ 3: By using Iterator : ********************
		Iterator i = v.iterator();
		while(i.hasNext())
	  	{  Object obj = i.next();
		   System.out.println(obj);
		} 

		// ********************** 4: By Using ListIterator : ******************
		
		ListIterator l = new v.ListIterator(v.size()) ;
		
		while(l.hasPrevious()) 
		{
			Object obj = l.previous();
			System.out.println(obj);
		}

		
// ******************** 5: Using For Each Loop : **********************
		
		for(Object obj:v)
		{ System.out.println(obj);
		}

// ******************** 6: By using the lambda Expression : *************
		
		v.forEach((val)->System.out.println(val));
		
	}
}
