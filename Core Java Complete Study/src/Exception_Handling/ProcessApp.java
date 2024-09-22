package Exception_Handling;


class A extends Thread  
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			threadSafely(1000);
			System.out.println(i);
		}
	}
	
	
	public void threadSafely(int millisecond)
	{
		try
		{
			Thread.sleep(millisecond);
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
			
		}
		
	}
}
public class ProcessApp {

	public static void main(String[] args) 
	{
		
		A a = new A();
		a.start();
		
	}
}
