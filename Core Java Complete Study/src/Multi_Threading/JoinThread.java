package Multi_Threading;


class A extends Thread
{
	
	synchronized public void run()
	{
	 
	try
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("First :"+i);
			Thread.sleep(1000);
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
   }
	
}

class B extends Thread
{
	
	public void run()
	{
	try
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Second :"+i);
			Thread.sleep(2000);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
public class JoinThread {

	public static void main(String x[]) throws InterruptedException
	{
		A a = new A();
		a.start();
		
		
		B b = new B();
		b.start();
	
	}
	
}

