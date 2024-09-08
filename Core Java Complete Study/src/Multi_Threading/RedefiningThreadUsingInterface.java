package Multi_Threading;

class MyThreadDemo  implements Runnable 
{

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
	
public class RedefiningThreadUsingInterface 
{
	public static void main(String x[])
	{
		MyThreadDemo mt = new MyThreadDemo();
		Thread t = new Thread(mt); // here mt is reference of Runabble 
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread ");
		}
	}
	
}

