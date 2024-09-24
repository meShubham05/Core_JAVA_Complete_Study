package Collection_Framework.Vector;

import java.util.*;

public class Sort_Ascending_Order {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of elements you want to add :");
		int size = sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter data in Collection :");
			v.add(sc.nextInt());
				
		}
		
		
		System.out.println("Display vector wthout sorting :");
		
		for(Object obj : v)
		{
			System.out.println(obj);
		}
		
		for(int i=0;i<v.size();i++)
		{
			for(int j=0;j<v.size();j++)
			{
				Object previous = v.get(i);
				Object next =v.get(j);
				if((int)previous<(int)next)
				{
					v.set(i,next);
					v.set(j,previous );
				}
			}
		}
		
		
		System.out.println("Display the collection after sorting :");
		
		for(Object obj :v)
		{
			System.out.println(obj);
		}
		
	}
	

}
