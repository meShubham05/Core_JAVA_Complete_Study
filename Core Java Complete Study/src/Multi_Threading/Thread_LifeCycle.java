package Multi_Threading;

/*  
 
 	1. New state
	2. Runnable state
	3. Blocked State 
	4. Waiting State 
	5. Timed Waiting state 
	6. Terminated state

*/

// Note: If there is only one thread, it will not go into the Blocked State because no other thread is there to hold the lock.

class Thread_LifeCycle2 extends Thread {
    private final Object lock;

    Thread_LifeCycle2(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) {
            try {
                System.out.println("Thread_LifeCycle2: Waiting for notification...");
                lock.wait(); // Entering Waiting state
                System.out.println("Thread_LifeCycle2: Notified and resuming execution.");

                for (int i = 6; i < 10; i++) {
                    System.out.println(i);
                }
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}

public class Thread_LifeCycle extends Thread {
    private final Object lock;

    Thread_LifeCycle(Object lock) {
        this.lock = lock;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000); // Timed Waiting state
            }

            synchronized (lock) {
                System.out.println("Thread_LifeCycle: Sending notification.");
                lock.notify(); // Notify the waiting thread
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
    	
    	 System.out.println("Threading Life Cycle :");
        Object lock1 = new Object(); // Initialize lock object

        Thread_LifeCycle tc = new Thread_LifeCycle(lock1); // Pass lock to constructor
        Thread_LifeCycle2 tc2 = new Thread_LifeCycle2(lock1); // Pass lock to constructor

        System.out.println("Main thread: Starting threads.");
        tc.start(); // New -> Runnable state
        tc2.start(); // New -> Runnable state

        tc.join(); // Wait for tc to finish
        tc2.join(); // Wait for tc2 to finish

        System.out.println("Main thread: All threads have completed.");
      
    }
}


/*



class ThreadLifeCycleDemo extends Thread {

    public ThreadLifeCycleDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            // Runnable State: The thread is now ready to run.
            System.out.println(Thread.currentThread().getName() + " is in RUNNABLE state.");

            // Simulate a task that takes time (Sleeping makes it TIMED_WAITING state)
            Thread.sleep(1000); // TIMED_WAITING state

            synchronized (this) {
                // BLOCKED state: Another thread will block this one by holding the lock
                System.out.println(Thread.currentThread().getName() + " is entering synchronized block (could be BLOCKED).");

                // WAITING state: The thread will wait until notified
                wait(); // WAITING state

                // After being notified, the thread resumes
                System.out.println(Thread.currentThread().getName() + " is running again after being notified (back to RUNNABLE).");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Terminated State: The thread has completed execution
        System.out.println(Thread.currentThread().getName() + " has TERMINATED.");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycleDemo thread = new ThreadLifeCycleDemo("DemoThread");

        // New State: The thread is created but not yet started
        System.out.println(thread.getName() + " is in NEW state.");

        // Start the thread: Moves it to RUNNABLE state
        thread.start();

        // Allow the thread to enter TIMED_WAITING state
        Thread.sleep(500);

        synchronized (thread) {
            // Notify the waiting thread, so it moves from WAITING to RUNNABLE
            thread.notify();
        }

        // Ensure the thread has time to complete
        thread.join();

        System.out.println(thread.getName() + " is in TERMINATED state.");
    }
}
*/
