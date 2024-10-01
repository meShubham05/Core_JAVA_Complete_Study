package HashCode_and__Reference;


class A
{
	int id=10;
}
class B
{
	A a;
}
public class Hashcode__Reference__App
{
		public static void main(String x[])
		{
			A a1 = new A();
			A a2 = new A();
			
			System.out.println("HashCode of a1 :"+a1.hashCode());
			
			System.out.println("Comparing the two references a1 and a2 :"+(a1==a2));
			
			System.out.println("Hash Code of a1 : " + a1.hashCode());
	        System.out.println("Hash Code of a2 : " + a2.hashCode());
		
	        
	        System.out.println("Comparing the references of a1 and a2 ussing equals method : ");
	        System.out.println(a2.equals(a1));
	        
	        a2=a1;
	        
			System.out.println("Hash Code of a1 : " + a1.hashCode());
	        System.out.println("Hash Code of a2 : " + a2.hashCode());
	        
	        System.out.println("Comparing the references of a1 and a2 ussing equals method : ");
	        System.out.println(a2.equals(a1));
 
		}
}

