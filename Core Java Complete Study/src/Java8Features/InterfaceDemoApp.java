package Java8Features;

interface interfaceDem
{
	public static int show()
	{
		System.out.println("I am Interfac Show() method :");
		return 10;
	}
	
	public void display();
	
}


class InterfaceImplements implements interfaceDem
{
	public static int show()
	{
		System.out.println("I am Interfac Show 1 () method :");
		return 20;
	}


	public void display() {
		
		System.out.println(" i am overricde method of interface ");
		
	}
}
 
 public class InterfaceDemoApp
 {
	 public static void main(String x[])
	 {
		 
		 int result = interfaceDem.show();
		 
		 System.out.println("The Result is :"+result);
		 
		 System.out.println();
		
		 
		 InterfaceImplements imp = new InterfaceImplements();
		int result2  =imp.show();
		
		System.out.println("The result of the interface override method is :"+result2);
	 }
 }
 
