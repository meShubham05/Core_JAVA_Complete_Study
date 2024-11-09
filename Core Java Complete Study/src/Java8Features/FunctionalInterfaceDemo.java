package Java8Features;

interface ABC {
	void show();

	default void display() {
		System.out.println("I am display default method in interface :");
		int c = 10;
		for (int i = 1; i <= 10; i++) {
			System.out.println(c + "'s" + " * " + i + " ===> " + c * i);
		}
		System.out.println("The value of  C : " +c);
	}
}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		((ABC) () -> System.out.println("I am Interface show Method :")).show();
		((ABC) () -> System.out.println("")).display();

	}
}
