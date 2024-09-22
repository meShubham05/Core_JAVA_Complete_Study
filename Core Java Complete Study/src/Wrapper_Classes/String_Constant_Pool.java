package Wrapper_Classes;

public class String_Constant_Pool {

	public static void main(String[] args) {
		
		String s="Ram";
		String s1 ="Shyam";
		
		System.out.println("Address of s :  "+System.identityHashCode(s));
		System.out.println("Address of s1 : "+System.identityHashCode(s));
		
		String s2 = new String("Ram");
		String s3 =new String("Shyam");
		
		System.out.println("Address of s2 :  "+System.identityHashCode(s2));
		System.out.println("Address of s1 :  "+System.identityHashCode(s3));
		
	}
}
