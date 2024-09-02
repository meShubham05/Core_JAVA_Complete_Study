package Multi_Threading;


class Child1 extends Thread
	{    
	public void run()
	      {
		  try{
		    for(int i=1; i<=5; i++)
		    { System.out.printf("First Thread = %d\t%b\n",i,isAlive());
			if(i==3)
			{ stop();
			}
			Thread.sleep(10000);
		    } 
		  }
		  catch(Exception ex)
		  { System.out.println("Error is "+ex);
		  }
	      }  
	}

	class Child2 extends Thread
	{     public void run()
	      {
		  try{
		    for(int i=1; i<=10; i++)
		    { System.out.printf("Second Thread = %d\n",i);
			Thread.sleep(1000);
		    } 
		  }
		  catch(Exception ex)
		  { System.out.println("Error is "+ex);
		  }
	      }  
 
	}
	   
public class ProcessApp
{
	public static void main(String x[])throws Exception
	{	
	   Child1 a1 = new Child1();
		a1.start();
		a1.join();
	 System.out.println("Now status of first thread  "+a1.isAlive());
	   	Child2 b1 = new Child2();
		b1.start();
	
	}
}
	


