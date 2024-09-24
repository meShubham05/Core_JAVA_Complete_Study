package Abstract_Classes;

 abstract class Parent 
 {

	public  abstract  void show();
	
 }

class Child extends Parent
{
	 
	  public void show()
	  {
		  System.out.println("I am Child Show Method :");
	  }
}

public class  Abstract_Class_Demo
{
	public static void main(String[] args) 
	{
		
		Child  c = new Child();
		c.show();
		
	}
}