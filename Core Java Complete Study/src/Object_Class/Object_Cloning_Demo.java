package Object_Class;




//Step 1: Create the Book class that implements Cloneable

class Book1 implements Cloneable {
 private String title;
 private String author;

 // Constructor
 public Book1(String title, String author) 
 {
     this.title = title;
     this.author = author;
 }

 // Override the clone method
 @Override
 protected Object clone() throws CloneNotSupportedException 
 {
     return super.clone(); // Create a shallow copy
 }

 // Getter methods
 public String getTitle() 
 {
     return title;
 }

 public String getAuthor() 
 {
     return author;
 }

 // Override toString for better output
 @Override
 public String toString() 
 {
     return "Book [Title=" + title + ", Author=" + author + "]";
 }
}

public class Object_Cloning_Demo 
{
 public static void main(String[] args) 
 {
     try {
         // Create an instance of Book
         Book1 originalBook = new Book1("Java Programming", "John Doe");

         // Clone the originalBook
         Book1 clonedBook = (Book1) originalBook.clone(); // Step 2: Clone the object

         // Display both books
         System.out.println("Original Book: " + originalBook);
         System.out.println("Cloned Book: " + clonedBook);

         // Modify the cloned book's title
         // Cloning creates a separate object, so this won't affect the original
         clonedBook = new Book1("Advanced Java", "Jane Doe");

         // Display after modification
         System.out.println("\nAfter modifying the cloned book:");
         System.out.println("Original Book: " + originalBook);
         System.out.println("Cloned Book: " + clonedBook);

     } 
     catch (CloneNotSupportedException e) 
     {
         e.printStackTrace();
     }
 }
}
