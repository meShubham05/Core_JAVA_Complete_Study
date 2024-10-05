package Generics______________Types_Of__Generics;


import java.util.*;

class A
{
	public void showList(List<?> list)
	{
		for(Object obj: list)
		{
			System.out.println(obj);
		}
		
	}
}


public class Wild_Card_Generics {

	public static void main(String[] args) {
			
		List <Integer> l = Arrays.asList(10,20,30,40,50);
		
	
	System.out.println(" \nList using Integer  type of Generics :\n");
	
	A a = new A();
	a.showList(l);
	
	
	List <Float> f = Arrays.asList(10.1f,20.02f,30.03f,40.04f,50.05f);


	System.out.println("List Using Float Type of Generics : \n");
	A b = new A();
	b.showList(f);
	}
}
