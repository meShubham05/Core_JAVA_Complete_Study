class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println("Thread A: " + i);
            }
        } catch (Exception e) {
            System.out.println("Thread A interrupted: " + e);
        }
    }
}

class B extends Thread {
    public void run() {
        try {
            for (int i = 10; i < 15; i++) {
                Thread.sleep(1000);
                System.out.println("Thread B: " + i);
            }
        } catch (Exception e) {
            System.out.println("Thread B interrupted: " + e);
        }
    }
}

public class ProcessApp2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
