package Object_Class;

class A
{
	
}
public class Object_Class_Demo {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A();
		
		int hashcode1 = a1.hashCode();
		int hashcode2 =a2.hashCode();
		
		System.out.println("Hashcode of a1 :"+hashcode1);
		System.out.println("Hashcode of a2 :"+hashcode2);
		
		a2=a1;
		
		
		int hashcode3 = a1.hashCode();
		int hashcode4 =a2.hashCode();
		
		
		System.out.println("Hashcode of a1 :"+hashcode3);
		System.out.println("Hashcode of a2 :"+hashcode4);
		
		
		
		if(a1==a2)
		{
			System.out.println("a1 and a2 are Equal :");
		}
		else
		{
			System.out.println("a1 and a2 are Not Equal :");
		}
		
		
	}
	
}
