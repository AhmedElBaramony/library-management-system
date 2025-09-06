package majorfinal;

import majorfinal.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hp
 */

public class Library {
    private static List<Book> books=new ArrayList<>();
    private static List<Reader> readers=new ArrayList<>();
    private static List<OrderList> orders= new ArrayList<>();
    
    Book book=new Book();
    Reader reader=new Reader();
    OrderList order=new OrderList();

    
    public Library() {
        
    }

    static int nextId;
    static int nextIdMem;
    
    
     public  void addBook(String title,String Author,String year) {
       
  
    nextId = books.size() + 1;
    String id = Integer.toString(nextId);
    Book book = new Book(title, Author, year);
    System.out.println("Book added !!! with id ["+ id +"] title "+title );
    
    books.add(book);
    for (int i = 0; i < books.size(); i++) {
        book.setId(id);
    }
  
}

   public boolean removeBook(String Id) {
     
         boolean x=false;
        boolean bookRemoved = false;
        List<Book> books = this.getBooks();
        for (Book book : books) {
            if (book.getId().equals(Id)) {
                
                books.remove(book);
                bookRemoved = true;
                return bookRemoved;
                
            }
        }

        return x;
    }
   
   
   public Book searchBooks(String ID) {
     Book temp=new Book("Invalid","Invalid","Invalid");
       boolean x=false;
       boolean found=false;
        for (int i = 0; i < books.size(); i++) {  
            if (ID.equals(books.get(i).getId())) {
                found =true;
                return books.get(i);
            }     
        }
   return temp;
   }  

   
    public List<Book> getBooks() {
        return books;
        
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////
    

     public void addMember(String firstname,String lastname,String password,String address,String phone,String mail,String type) {
        
        
        nextIdMem = readers.size() + 1;
        String Id=Integer.toString(nextIdMem);
        
        Reader reader = new Reader(firstname,lastname,password,address,phone,mail,type);
        System.out.println("Member added to library with ID: " + Id);
        readers.add(reader);
        
    for (int i = 0; i < readers.size(); i++) {
        reader.setId(Id);
    }
        
        
    }
     
     public boolean removeMember(String Id) {
     
         boolean x=false;
        boolean MemberRemoved = false;
        List<Reader> readers = this.getReader();
       for (Reader reader : readers) {
            if (reader.getId().equals(Id)) {
                readers.remove(reader);
                MemberRemoved = true;
               return MemberRemoved;
            }
        }
            return x;
    }

    
     public Reader searchMembers(String ID) {
     
         Reader tmp=new Reader("Invalid","Invalid","Invalid","Invalid","Invalid","Invalid","Invalid");
       boolean found=false;
        for (int i = 0; i < readers.size(); i++) { 
            if (ID.equals(readers.get(i).getId())) {
                found =true;
                return readers.get(i);   
            }
           }
       return tmp;
 }

     //////////////////////////////////////////////////////////////////////////////
     
     public boolean blockUser(String userId) {
         
    Reader userToBlock = new Reader();
     boolean x = false;
     List<Reader> readers=this.getReader();
    for (Reader reader : readers) {
        if (reader.getId().equals(userId)) {
            x=true;
            reader.setIsBlocked(x);
         return true;
        }
    }
    return x;
}
     
     
    public List<Reader> getReader() {
        return readers;
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////////
    
   public boolean addOrder(String id) {
    
    boolean x=false ;   
    boolean readerFound = false;
    
    for (OrderList order : orders) {
        if (order.getId().equals(id)) {
            orders.add(order);
            order.setId(id);
            readerFound = true;
            return readerFound ;
         
        }
    
    
    }
    return x;
}

    public boolean remove_From_Order(String Id) {
     
        boolean x=false;
        boolean orderRemoved = false;
        List<OrderList> orders = this.getOrder();
       for (OrderList order : orders) {
            if (order.getId().equals(Id)) {
                
                orders.remove(order);
                orderRemoved = true;
               return orderRemoved;
            }
        }

        return x;
    }

    
    public List<OrderList> getOrder() {
        return orders;
    }
    
    //////////////////////////////////////////////////////////////////////////////
   public boolean Rent(String id) {
    
       boolean x=false;
    List<Book> books = getBooks();
    for (int i = 0; i < books.size(); i++) {
        if (id.equals(books.get(i).getId())) {
            
            return true;
            
            } 
      book.setIsRented(true);
      

    }
    return x;
}
   }

 
 
 
