package Multi_Threading;

	class SharedResource 
	{
	    int counter = 0;
	}

	class IncrementTask1 implements Runnable {
	    
		private SharedResource resource;

	    public IncrementTask1(SharedResource resource) {
	        this.resource = resource;
	    }

	   
	    public void run() {
	        for (int i = 0; i < 1000; i++) {
	            resource.counter++;  // Increment the shared counter
	        }
	    }
	}

	class IncrementTask2 implements Runnable {
	    private SharedResource resource;

	    public IncrementTask2(SharedResource resource) {
	        this.resource = resource;
	    }

	    
	    public void run() {
	        for (int i = 0; i < 1000; i++) {
	            resource.counter++;  // Increment the shared counter
	        }
	    }
	}

	
	public class AmbuguityProblemDemo2 {
		
	    public static void main(String[] args) throws Exception{
	        SharedResource resource = new SharedResource();

	        Thread thread1 = new Thread(new IncrementTask1(resource));
	        Thread thread2 = new Thread(new IncrementTask2(resource));

	        thread1.start();
	        thread2.start();
	        
	        thread1.join();
	        thread2.join();

	        System.out.println("Final counter value: " + resource.counter);
	    }
	}


