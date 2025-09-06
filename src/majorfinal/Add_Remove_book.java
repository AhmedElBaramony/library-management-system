package majorfinal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Label;


public class Add_Remove_book {
    private Library library;
    
    Label statusLabel;

    public Add_Remove_book(Library library) {
        this.library = library;
    }

    public void addBook(String title,String Author,String year) {

    List<Book> books = library.getBooks();
    int nextId = books.size() + 1;
    String id = Integer.toString(nextId);
  System.out.println("Book added !!! with id "+ id);
    Book book = new Book(title, Author, year);
    books.add(book); 
}

   

    public void displayBooks() {
        List<Book> books = library.getBooks();

        System.out.println("Books in library:");
        for (Book book : books) {
            System.out.println("["+book.getName()+"]" + " by " + book.getAuthor() + " (" + book.getPublishYear() + ") " + "it's <ID> is " + book.getId());
        }
    }
}