package Java8Features;



public class FunctionInterfaceThreadDemo {
public static void main(String[] args) {
	
	Thread t = new Thread()
			{
				public void run()
				{
					try
					{
						for(int i=0;i<5;i++)
						{
							System.out.println(i);
							Thread.sleep(1000);
						}
					}
					catch(Exception ex)
					{
						System.out.println(ex);
					}
				}
			};
			
			t.start();
	
}
}
