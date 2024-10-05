package Generics;

import java.util.*;

public class GenericsDemo 
{	
	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList<Integer> ();		
//		al.add("String");
//		al.add(1.2f);
		al.add(12);
		al.add(20);
		int sum =0;		
		for(Object obj :al)
		{
			if(obj instanceof Integer)
			{
				sum = sum+(int)obj;
			}
		}		
		System.out.println("The sum of Integer Number is : "+sum);		
	}
}
