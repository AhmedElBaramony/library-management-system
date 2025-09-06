package majorfinal;

import java.util.Date;

/**
 *
 * @author Hp
 */
public class Book {
    private String name;
    private String author;
    private String publishYear;
    private String id;
    private Date due;
    private boolean isRented;

    public Book() {
    }
    
    
    
public Book(String name, String author, String publishYear,String id) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
        this.id=id;   
    }
     
    
    
    
     public Book(String name, String author, String publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
        this.id=id;   
    }

    public Book(String name, String author, String publishYear, String id, Date due, boolean isRented) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
        this.id = id;
        this.due = due;
        this.isRented = isRented;
    }

    
    
    public boolean isIsRented() {
        return isRented;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }

  

    public Book(String name, String author, String publishYear, String id, Date due) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
        this.id = id;
        this.due = due;
    }
     
     

     public Book(String Removed_Book){}
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

        public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", publishYear=" + publishYear + ", id=" + id + ", due=" + due + ", isRented=" + isRented + '}';
    }
    
    
   
 
 
 
}    
    

