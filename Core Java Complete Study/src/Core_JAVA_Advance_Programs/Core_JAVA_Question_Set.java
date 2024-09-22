package Core_JAVA_Advance_Programs;

class CoreJAVA
{
	/*
	Here’s a comprehensive set of questions covering multiple core Java concepts. These will challenge your understanding of key topics and prepare you for your exam:
		
		1. Arrays
		 
		1.	Multidimensional Array Manipulation: Write a program to find the sum of elements along the diagonals of a 3x3 matrix. Then sort the elements of the matrix row-wise.
		2.	Array of Objects: Create a Student class with fields for name and marks. Use an array to store 5 student objects, sort them by marks, and print the top scorer's name.
		3.	Rotate Array Elements: Write a program that rotates the elements of an integer array to the right by 2 positions.
		4.	Merge and Sort Arrays: Write a method that merges two sorted arrays of different sizes into a single sorted array without using any built-in methods.
		5.	Sparse Matrix Detection: Write a program that determines if a 2D array is sparse (i.e., it contains more zeroes than non-zero elements).
		
		2. Classes and Objects
		
		1.	Bank Account Management: Implement a BankAccount class with methods to deposit, withdraw, and check balance. Use an array of objects to manage multiple accounts.
		2.	Library System: Write a program using a Book class with attributes like title, author, and price. Use object arrays to store multiple books and write methods to search for a book by title.
		3.	Employee Management: Create an Employee class. Use a constructor to initialize the employee's details and write a method to display them. Use getter and setter methods to modify employee details.
		4.	Online Shopping Cart: Implement a Product class with fields for product name, price, and quantity. Create an array of objects to simulate an online cart system.
		5.	Object Comparison: Implement a Car class. Create a method to compare two cars based on their price and engine power.
		
		3. Constructors
		
		1.	Copy Constructor: Create a class Rectangle with fields length and breadth. Write a copy constructor that creates a copy of a Rectangle object and a method to calculate the area.
		2.	Constructor Overloading: Implement a Student class with three constructors: one without parameters, one with only the name, and one with both name and roll number.
		3.	Chaining Constructors: Write a class Book where you demonstrate constructor chaining using this() keyword.
		4.	Parameterized Constructor: Implement a ComplexNumber class. Use a parameterized constructor to initialize the real and imaginary parts and write methods for adding two complex numbers.
		5.	Static Block and Constructor: Write a program that demonstrates the execution of a static block before the constructor is called.

		4. Inheritance
		
		1.	Multilevel Inheritance: Implement a Vehicle, Car, and SportsCar class, where Car inherits Vehicle, and SportsCar inherits Car. Show how constructors are called in a multilevel inheritance setup.
		2.	Method Overriding: Create a Shape superclass with a draw() method and override it in Circle, Square, and Triangle subclasses.
		3.	Hierarchical Inheritance: Implement a base class Animal with subclasses Dog, Cat, and Bird. Write a method in each subclass that returns the sound each animal makes.
		4.	Dynamic Method Dispatch: Create a class hierarchy where Teacher is the parent class, and MathTeacher, ScienceTeacher, and EnglishTeacher are subclasses. Demonstrate dynamic method dispatch with a method teach().
		5.	Interface Inheritance: Create an interface Vehicle with abstract methods startEngine() and stopEngine(). Implement these methods in classes Bike and Car.
		
		5. Exception Handling
		
		1.	Custom Exception: Create a custom exception InvalidAgeException and write a program that throws this exception when a user tries to register for voting under the age of 18.
		2.	Multiple Exceptions: Write a program that demonstrates handling of multiple exceptions using try-catch blocks for ArrayIndexOutOfBoundsException and NumberFormatException.
		3.	Finally Block: Write a program that demonstrates the use of a finally block even when an exception is not thrown.
		4.	Chained Exceptions: Implement a method that throws one exception and catches another. For example, catch a NumberFormatException and throw an ArithmeticException.
		5.	Try-With-Resources: Write a program that reads from a file using try-with-resources and handle any possible exceptions like FileNotFoundException and IOException.
	
		6. Wrapper Classes
		
		1.	Autoboxing and Unboxing: Write a program that demonstrates autoboxing and unboxing for all primitive data types.
		2.	Conversion Between Types: Write a program that converts a String to an Integer and vice-versa using wrapper classes.
		3.	Character Methods: Use wrapper class methods to check if a given character is a digit, letter, whitespace, etc.
		4.	Math Utility Methods: Use wrapper class methods to find the minimum and maximum of two numbers, check if a number is NaN, and compare two Double values.
		5.	Primitive Array to Object Array: Convert a primitive int array to an array of Integer objects using wrapper class methods.

		7. Threading
		
		1.	Producer-Consumer Problem: Implement the producer-consumer problem using multithreading with synchronization.
		2.	Thread Communication: Write a program where two threads communicate with each other using wait() and notify().
		3.	Thread Priority: Create three threads and set different priorities. Demonstrate how thread priorities affect execution order.
		4.	Deadlock Simulation: Write a program to simulate deadlock between two threads using two different locks.
		5.	Thread Group: Create a thread group and start multiple threads within the group. Write a method that prints out the active count of threads in the group.
		
		8. File Handling
		
		1.	Read and Write to File: Write a program that reads from one file and writes to another, handling exceptions during file operations.
		2.	Count Occurrences of Word: Write a program that counts the occurrences of a particular word in a text file.
		3.	Append to a File: Write a program that appends text to an existing file using FileWriter and handles exceptions.
		4.	File Encryption: Write a simple program that reads a file and writes an encrypted version (shifting characters by a fixed number).
		5.	Serialize and Deserialize Object: Write a program to serialize and deserialize a Person object to and from a file.
		
		9. Collection Framework (List, Set, and Generics)
		
		1.	List Sorting: Write a program that sorts a List of Employee objects based on employee age using Comparator.
		2.	Remove Duplicates from List: Write a program that removes duplicate elements from an ArrayList of integers using a Set.
		3.	Set Operations: Write a program to demonstrate union, intersection, and difference of two sets.
		4.	Generic Method: Write a generic method to swap two elements in an array.
		5.	Custom Object in HashSet: Write a program where you add custom Student objects to a HashSet and override hashCode() and equals() methods to ensure uniqueness.
		
		10. String
		
		1.	Palindrome Check: Write a program that checks if a string is a palindrome without using built-in methods.
		2.	String Permutation: Write a program to generate all permutations of a given string.
		3.	Remove Duplicate Characters: Write a method that removes all duplicate characters from a string.
		4.	Count Vowels and Consonants: Write a program to count the number of vowels and consonants in a string.
		5.	Anagram Detection: Write a method to check if two given strings are anagrams of each other.
		
		11. Pattern and Looping Problems
		
		1.	Floyd’s Triangle: Print Floyd’s triangle using nested loops.
		2.	Pyramid Pattern: Write a program to print a pyramid pattern of numbers.
		3.	Diamond Pattern: Write a program that prints a diamond pattern using stars (*).
		4.	Hollow Square with Diagonals: Write a program to print a hollow square with diagonal stars.
		5.	Number Pattern: Write a program to print the following pattern:
		
			Copy code
		1
		2 3
		4 5 6
		7 8 9 10
		
		12. Abstraction and Interfaces
		
		1.	Abstract Class Implementation: Create an abstract class Shape with an abstract method area(). Implement it in Circle, Rectangle, and Triangle classes.
		2.	Interface Multiple Inheritance: Create two interfaces Animal and Bird. Implement a class Penguin that inherits both interfaces and demonstrates the ability to swim and fly.
		3.	Factory Design Pattern: Create an interface Vehicle with implementations Bike and Car. Write a factory class that creates objects of Bike or Car based on input.
		4.	Interface as Reference: Write a program where an interface is used as a reference type, and multiple classes implement that interface.
		5.	Marker Interface: Create a marker interface Serializable
		
		13. Wrapper Classes (Advanced)
		
		1.	Cache Effect in Wrapper Classes: Write a program that demonstrates the caching effect in the Integer wrapper class for values between -128 and 127, showing how objects within this range point to the same reference.
		2.	String to Primitive Conversion: Write a program that reads a string of comma-separated numbers and converts it into an array of integers using the appropriate wrapper class methods.
		3.	Primitive Object Comparison: Write a program to compare two wrapper objects (like Integer, Double) using both equals() and == to demonstrate object reference comparison vs value comparison.
		4.	Binary Representation: Write a program that converts an integer value to its binary, octal, and hexadecimal representations using wrapper class methods.
		5.	Immutable Nature of Wrappers: Create a program that demonstrates how wrapper classes are immutable, comparing modifications to primitive data types vs wrapper objects.



		
		14. File Handling (Advanced)
		
		1.	File Search and Replace: Write a program that reads a file, searches for a specific word, and replaces all occurrences of that word with another word, saving the result in a new file.
		2.	Copy Directory Contents: Write a program that copies all files from one directory to another, handling possible exceptions for file permissions and I/O issues.
		3.	File Comparison: Write a program that reads two text files and compares their content line by line, reporting which lines differ.
		4.	Log File Analyzer: Create a log file analyzer that reads an application log file and counts the occurrences of different log levels (e.g., ERROR, WARN, INFO).
		5.	File Encryption/Decryption: Write a program that reads a file, encrypts its contents using a basic substitution cipher, and writes the encrypted text to a new file. Then create a method to decrypt it back to the original content.
		
		15. Collection Framework (Advanced)
		
		1.	Custom Sorting with Comparator: Write a program that uses Comparator to sort a list of Employee objects based on multiple fields (e.g., first by salary, then by name if salaries are equal).
		2.	Priority Queue with Generics: Implement a program using a priority queue to handle customer requests based on their priority level, where customers are represented as objects.
		3.	Custom HashMap Implementation: Implement a simplified version of a HashMap from scratch, focusing on handling collisions using chaining.
		4.	List to Set Conversion: Write a method that converts a List of custom objects (e.g., Student) into a Set, ensuring no duplicates based on the hashCode() and equals() method implementation.
		5.	Remove Null Values from Collection: Write a program that removes all null values from a List or Set using an iterator.
		
		16. Threading (Advanced)
		
		1.	Thread Pool Implementation: Write a program that demonstrates the use of an ExecutorService to manage a pool of threads that handle tasks concurrently.
		2.	Callable and Future: Write a program that demonstrates how to use Callable and Future to return results from a thread and handle potential exceptions.
		3.	Concurrent Data Structure: Use ConcurrentHashMap in a multithreaded environment to demonstrate how it handles concurrent access without locking the entire map.
		4.	Thread Interruption: Write a program that demonstrates how one thread can interrupt another and handle the InterruptedException properly.
		5.	CountdownLatch: Write a program that demonstrates how CountDownLatch can be used to ensure that one thread waits for several other threads to complete their tasks.


		17. Pattern and Looping (Advanced)
		
		1.	Pascal’s Triangle: Write a program that prints Pascal's triangle up to the 5th row using nested loops.
		2.	Spiral Matrix: Given a 4x4 matrix, print the elements in spiral order.
		3.	Hourglass Pattern: Write a program to print an hourglass pattern using numbers or stars (*).
		4.	Number Pyramid with Factorials: Write a program that prints a pyramid of numbers, where each number in the pyramid is the factorial of its row and column position.
		5.	Prime Number Pattern: Print a pattern where the prime numbers are arranged in a pyramid, with each row containing prime numbers in increasing order.
		
		18. Abstraction and Interfaces (Advanced)
		
		1.	Abstract Class and Interface Combo: Create an abstract class Electronics with an abstract method powerOn(). Then create an interface InternetEnabledDevice with a method connectToInternet(). Implement both in classes Smartphone and Laptop.
		2.	Strategy Design Pattern: Create an interface PaymentStrategy with an abstract method pay(). Implement different payment strategies like CreditCardPayment, DebitCardPayment, and PayPalPayment. Write a program that demonstrates switching between payment strategies dynamically.
		3.	Real-World Interface Example: Create an interface Transport with methods like start(), stop(). Implement this interface in different real-world classes such as Car, Bike, Train. Write a program to demonstrate polymorphism with this interface.
		4.	Abstract Class Constructor: Write a program that shows how an abstract class constructor can be called during object instantiation of a subclass.
		5.	Multiple Inheritance in Interfaces: Create two interfaces Drivable and Flyable. Implement both in a class FlyingCar. Demonstrate how a class can inherit behavior from multiple interfaces.
		
		19. Inheritance (Advanced)
		
		1.	Diamond Problem: Write a program demonstrating the "diamond problem" in inheritance and how Java solves it using interfaces.
		2.	Super Keyword: Write a program that uses the super keyword to call a superclass method that has been overridden in a subclass.
		3.	Polymorphism with Multiple Inheritance: Create a class hierarchy where a class implements multiple interfaces, and demonstrate how polymorphism can be applied in this context.
		4.	Method Overloading and Overriding: Write a program that demonstrates method overloading within the same class and method overriding in a subclass, and observe the behavior of the two in a runtime environment.
		5.	Covariant Return Types: Write a program to demonstrate covariant return types, where a subclass method returns a more specific type than the method in its superclass.

		20. String (Advanced)
		
		1.	String Compression: Write a program that compresses a string using the counts of repeated characters (e.g., input "aaabb" becomes "a3b2").
		2.	String Reversal (Without StringBuilder): Write a program to reverse a string without using the built-in StringBuilder or StringBuffer class.
		3.	Longest Palindromic Substring: Write a program to find the longest palindromic substring in a given string.
		4.	String Tokenizer: Use StringTokenizer to break a string into tokens based on spaces or other delimiters and count the number of tokens.
		5.	Pattern Matching in Strings: Write a program that uses regular expressions to find and replace all occurrences of a pattern in a given string.

*/
	
}
