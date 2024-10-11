package Collection_Framework.Vector;

import java.util.*;

public class Remove_Duplicate_From_Vector_List 
{

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(20);
		v.add(30);
		v.add(10);
		v.add(40);
		v.add(60);
		v.add(70);
		v.add(20);
		v.add(80);
		v.add(10);
		v.add(90);
		
		System.out.println("Before Checking the Vector list :");
		
		System.out.println(v);
		
		Collections.sort(v);
System.out.println("After Sort the Vector list :");
		
		System.out.println(v);
		for(int i=1;i<v.size();i++)
		{
			Integer num1 =(Integer)v.get(i);
			for(int j=i-1;j<v.size();j++)
			{
				
				Integer num2 =(Integer)v.get(j);
				if(num1==num2)
				{
					for (int k = 0; k < v.size(); k++) {
								
					v.remove(j);
							v.remove(i);
				}
			}
		}
		
		System.out.println("After Checking the Vector list :");
		
		System.out.println(v);
		
		
	}

}
