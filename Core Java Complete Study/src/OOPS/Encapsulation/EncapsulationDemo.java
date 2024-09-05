package OOPS.Encapsulation;

public class EncapsulationDemo {
	
	
	private String name ="i am private string :";
	
	
	
	public void getName()
	{
		System.out.println(name);
	}
	
	
	public static void main(String x[])
	{
		EncapsulationDemo e = new EncapsulationDemo();
		e.getName();
		
	}

}
