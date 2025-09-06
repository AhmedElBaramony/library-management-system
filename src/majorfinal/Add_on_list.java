package majorfinal;
import majorfinal.OrderList;
import majorfinal.Library;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hp
 */
public class Add_on_list {
    
     private Library library;

    public Add_on_list(Library library) {
        this.library = library;
    }
     
    
    public void addMember(OrderList reader) {
    if (library.getReader().equals(this)) {
        System.out.println("Member " + reader.getFirstName()+ " is already in the order list.");
    } else {
        library.addReader(reader);
        System.out.println("Member " + reader.getFirstName() + " has been added to the order list.");
    }
}

    public void removeMember(OrderList reader) {
    if (library.getReader().equals(this)) {
        library.removeReader(reader);
        System.out.println("Member " + reader.getFirstName() + "Whose <ID> is " + " has been removed from the order list.");
    } else {
        System.out.println("Member " + reader.getFirstName() + "Whose <ID> is " + " is not in the order list.");
    }
}
    
}
