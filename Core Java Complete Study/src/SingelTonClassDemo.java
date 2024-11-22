


class A
{
	private  static A a =new A(); 
	private A()
	{
		
	}
	
	public static A getInstance()
	{
		if(a==null)
		{
			 a= new A();
		}
		return a;
	}
}
public class SingelTonClassDemo 
{
	public static void main(String[] args) 
	{
	A a1 =A.getInstance();
	
	System.out.println("The Hashcode of a1 : "+a1.hashCode());

	A a2 = A.getInstance();
	
	System.out.println("The Hashcode of a2 : "+a2.hashCode());
	
	}
}
