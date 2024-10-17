package Object_Class;


class AAA
{
	AAA(int value)
	{
		System.out.println("The Value are "+value);
		
	}
}
public class Object_Class_Object_Creation_demo 
{
	public static void main(String[] args) 
	{
		AAA a1 = new AAA(100);
		AAA a2 =new AAA(100);
		int hashcode1 =a1.hashCode();
		int hashcode2=a2.hashCode();
		
		
		System.out.println("Hashcode of a1 :"+hashcode1);
		System.out.println("Hashcode of a2 :"+hashcode2);
		
		if(a1==a2)
		{
			System.out.println("Objects are  equal :");
		}
		else
		{
			System.out.println("The Objects are not equal :");
		}
	}
}
