package Multi_Threading;


class Increment 
{
	int counter =0;
	
	public void counter()
	{
		
		counter++;
		System.out.println(counter);
	}
}

class T1 implements Runnable
{
	Increment increment ;
	T1(Increment increment)
	{
		this.increment=increment;
		
	}
	
	
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			increment.counter();
		}
	}
	
	
}
class T2 implements Runnable
{
	private Increment increment;
	T2(Increment incrmement)
	{
		this.increment = increment;
	}
	public void run()
	{
		for(int i=0;i<100;i++)
		{


		}
			
		
	}
}

public class Ambiguity_Threads 
{
	public static void main(String[] args) throws InterruptedException {

		Increment increment = new Increment();
		
		
		Thread thread1 = new Thread(new T1(increment));
		
		Thread thread2 = new Thread(new T2(increment));
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		
	
			
		
	}

}
