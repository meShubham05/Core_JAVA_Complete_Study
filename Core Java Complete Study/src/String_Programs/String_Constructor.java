package String_Programs;

public class String_Constructor {

	public static void main(String[] args) {

		char ch[]= new char[]{'G','o','o','d',' ','M','o','r','n','i','n','g'};
		
		
		String str =new String(ch);
		System.out.println(str);
		
		String str2 = new String(ch,0,4);
		
		System.out.println(str2);
		
		int a [] = new int[] {65,66,67};
		
		String str3=new String(a,0,3);
		System.out.println(str3);
		
		
		String str4 = new String ("ABCDEFGHIJKL");
		
		char ch2 [] =new  char[str4.length()];
		int l =str4.length(),i=0;
		while(i<l)
		{
			ch2[i]=str4.charAt(i);
			System.out.print(" "+ch2[i]);
			i++;
		}
		
	
		
	}

}
