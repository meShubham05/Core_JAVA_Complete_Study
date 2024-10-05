package Generics______________Types_Of__Generics;

import Utility_Class.Main;

interface Radius<E>
{
	void showRadius(E radius);
}

class Circle  implements Radius<Integer>
{
	public void showRadius(Integer radius2)
	{
		System.out.println("I am Circle "+radius2);
	}
}

class Curcumference implements Radius<Float>
{
	public void showRadius(Float radius)
	{
		System.out.println("I am Circumference :"+radius);
	}
}


public class Interface_With__Generics 
{
	
		public static void main(String x[])
		{
			Circle c = new Circle();
			c.showRadius(10);
			
			Curcumference c1 = new Curcumference();
			c1.showRadius(10.f);
					
		}
}


