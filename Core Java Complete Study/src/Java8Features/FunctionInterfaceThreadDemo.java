package Java8Features;

public class FunctionInterfaceThreadDemo {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(()->{			
			for (int i = 0; i < 5; i++) {			
			try {		
					System.out.println(i);
					Thread.sleep(1000);
					
				}
					catch (Exception ex) {
				System.out.println(ex);
			}
		}
		});
		
		
		t1.start();
		t1.join();
		
	new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					System.out.println(i);
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}).start();
	}
}
