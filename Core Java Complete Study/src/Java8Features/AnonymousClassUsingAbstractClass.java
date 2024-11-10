package Java8Features;


abstract class A 
{
	public void show()
	{
		
	}
}
public class AnonymousClassUsingAbstractClass {

	public static void main(String[] args) {
		
		A a = new A()
				{
					public void show()
					{
						System.out.println("I am show Method of Abstract class A :");
					}
				};
				a.show();		
			
				
				
				
				
				
				
	}
}
