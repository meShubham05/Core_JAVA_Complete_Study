package Multi_Threading;

class AA implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class Using_Runnable_Interface 
{
	public static void main(String[] args) 
	{
	
	 AA a = new AA();
	 Thread t = new Thread(a);
	 t.start();
	 t.setDaemon(true);
	 t.start();
	}
	
}
