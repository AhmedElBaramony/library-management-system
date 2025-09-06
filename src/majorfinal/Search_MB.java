package majorfinal;
import majorfinal.Library;
import majorfinal.Book;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hp
 */
//Search members and books
public class Search_MB {
    
      private Library library;

    public Search_MB(Library library) {
        this.library = library;
    }

    Scanner scanner = new Scanner(System.in);

    

    public void searchBooks(ArrayList<Book> books,String ID) {
     
       boolean found=false;
        for (int i = 0; i < books.size(); i++) { // we use this kind of looping if I dint know the size of the array
           
            if (ID.equals(books.get(i))) {
                found =true;
                System.out.println("This book is avaliable");
                System.out.println("");
                break;
                
            }
            
        }
        if (!found){
        System.out.println("This book is not found ");
        }
      
       
    }
    
    
    
    public void searchReaders() {
     
       System.out.println("Enter Reader ID :");
       String Id = scanner.nextLine(); 
       
       boolean found=false;
       List<Reader> readers = library.getReader();
        for (int i = 0; i < readers.size(); i++) { // we use this kind of looping if I dint know the size of the array
            Reader reader = readers.get(i);
            if (reader.getId().equals(Id)) {
                found =true;
                System.out.println("Member Found");
                System.out.println("");
                break;
            }
       }
         if (!found){
        System.out.println("The member is not found ");
        }
    }
      
       
    }


