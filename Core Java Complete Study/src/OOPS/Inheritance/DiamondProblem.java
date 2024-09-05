
package OOPS.Inheritance;


class A
{
	public void show()
	{
		System.out.println("I am Show method in A class :");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("I am show method in B class :");
	}
	
}
class C extends A
{
	public void show()
	{
		System.out.println("I am show method in C class :");
		
	}
	
}
//
//class D extends B,C
//{
//	public void show()
//	{
//		
//	}
//	
//}

public class DiamondProblem {

	public static void main(String x[])
	{
//		D d = new D();
//		d.show();
	}
	
}
