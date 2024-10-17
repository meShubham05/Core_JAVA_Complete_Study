package Object_Class;


class ClassA
{
	int num;
	
	ClassA()
	{
		
	}
	ClassA(int num)
	{
		this.num=num;
	}
	
	public boolean equals(Object obj)
	{
		ClassA a3 =(ClassA)obj;
		System.out.println("This.num ="+this.num);
		if(this.num==a3.num)
		{
			System.out.println("This.num ="+this.num);
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
public class Object_equals_demo {

	public static void main(String[] args) 
	{
		ClassA a1=new ClassA(100);
		ClassA a2 = new ClassA(200);
		
		
		int hashcode1 = 
		if(a1.equals(a2))
		{
			System.out.println("a1 and a2 are Equals :");
		}
		else
		{
			System.out.println("a1 and a2 are not Equals :");
		}
		
	}

}
