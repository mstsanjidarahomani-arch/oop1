
package Encapsulation8;


 public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("Java Programming");
        book.setAuthor("Imani Matey");
        book.setPrice(35.0);
        book.applyDiscount(10);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" + book.getPrice());
    }
    
 }

    
   