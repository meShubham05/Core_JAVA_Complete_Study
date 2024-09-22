package Exception_Handling;

class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(10000);
				System.out.println(i);
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
			for(int j=0;j<10;j++)
			{
				Thread.sleep(2000);
				System.out.println(j);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class ThreadProcessApp {

	public static void main(String[] args) {
		
		A a = new A();
		a.start();
		B b = new B();
		b.start();
				
		
	}
}
