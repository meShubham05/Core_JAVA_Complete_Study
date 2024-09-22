package Multi_Threading;
class Table
	{  synchronized void showTable(int x)
	    { try{
		 for(int i=1; i<=10; i++)
		 { System.out.printf("%d  X %d  = %d\n",i,x,i*x);
		   Thread.sleep(1000);
		 }
		}
		catch(Exception ex)
		{ System.out.println("Error is "+ex);
		}
	    }
	}

	class Two extends Thread
	{  Table table;
	   void setTable(Table table)
	   { this.table=table;
	   }
	   public void run()
	   { table.showTable(2);
	   }
	}
	class Three extends Thread
	{  Table table;
	   void setTable(Table table)
	   { this.table=table;
	   }
	   public void run()
	   { table.showTable(3);
	   }
	}

	
	public class SynchronisationDemo
	{
	   public static void main(String x[])
	    {   Table t1 = new Table();
		
	      Two tw = new Two();
		  tw.setTable(t1);
		  tw.start();
		
		Three th = new Three();
		th.setTable(t1);
		th.start();
	    }
	}

