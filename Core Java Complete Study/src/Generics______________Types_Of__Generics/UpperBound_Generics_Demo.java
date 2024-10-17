package Generics______________Types_Of__Generics;

import java.lang.reflect.Array;
import java.util.*;

class ABC 
{
	public void show(List <? extends Number> list)
	{
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}
}
public class UpperBound_Generics_Demo {

	public static void main(String[] args) {
		
		List li =Arrays.asList(10,20,30,40,50);
		
		
		System.out.println(" Integer ArrayList :");
		
		ABC a = new ABC();
		a.show(li);
		
		
		List l2 = Arrays.asList(1.1,2.2,3.3,4.4,5.5);
		
		System.out.println("Float ArrayList :");
		
		ABC list2 = new ABC();
		list2.show(l2);
		
		
	}
}
