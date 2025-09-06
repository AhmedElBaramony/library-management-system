package majorfinal;
import majorfinal.Library;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hp
 */
public class Add_Members {
    private Library library;

    public Add_Members(Library library) {
        this.library = library; 
    }

 
   
    public void removeMember() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID : ");
        String Id = scanner.nextLine();
        
        boolean memberRemoved = false;
        List<Reader> readers = library.getReader();
        for (Reader reader :readers) {
            if (reader.getId().equals(Id)) {
                library.removeReader(reader);
                memberRemoved = true;
                System.out.println("Member removed from library.");
                break;
            }
        }
        if (!memberRemoved) {
            System.out.println("Member not found in library.");
        }
    }
    public void displayReaders() {
        List<Reader> readers = library.getReader();
        int counter =0;
        System.out.println("Members in library:");
        for (Reader reader :readers) {
            counter++;
            System.out.println(counter+ " - ["+reader.getFirstName() + " " + reader.getLastName() + "] his address is [" + reader.getAddress() + "] his phone number is [" + reader.getCellPhone() + "] ");
        }
    }
}

