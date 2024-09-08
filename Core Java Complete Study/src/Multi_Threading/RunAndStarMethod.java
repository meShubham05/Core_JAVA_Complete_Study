package Multi_Threading;

public class RunAndStarMethod  extends Thread{

	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Child Thread :");
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
	public static void main(String x[])
	{
		RunAndStarMethod r = new RunAndStarMethod();
		r.start(); // firstly all main thread get executed before child thread
		
		// r.run(); // firstly  child class executed before main thread 
		
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Main Thread :");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
	}
}
