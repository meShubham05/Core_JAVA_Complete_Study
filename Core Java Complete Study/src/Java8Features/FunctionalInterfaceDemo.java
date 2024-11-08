package Java8Features;



interface ABC
{
	void show();
}

public class FunctionalInterfaceDemo 
{
	public static void main(String[] args) {
		
	
	 ABC a = new ABC(){
		 public void show()
		 {
		 System.out.println("I am Show method of ABC interface :");
		 }
	 };
	 
	 a.show();  
		
		 ABC b = ()->System.out.println("I am Show method of ABC interface :");
			b.show(); 
	}
	
}
