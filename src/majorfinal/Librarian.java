package majorfinal;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Librarian extends Person{

    public Librarian(){}
    public Librarian(String type, String id, String password, String firstName, String lastName, String address, String cellPhone, String email) {
        super(type, id, password, firstName, lastName, address, cellPhone, email);
    }

    @Override
    public void setIsBlocked(boolean isBlocked) {
        super.setIsBlocked(isBlocked);
    }

    @Override
    public boolean isIsBlocked() {
        return super.isIsBlocked(); 
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email); 
    }

    @Override
    public String getEmail() {
        return super.getEmail(); 
    }

    @Override
    public void setCellPhone(String cellPhone) {
        super.setCellPhone(cellPhone); 
    }

    @Override
    public String getCellPhone() {
        return super.getCellPhone(); 
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address); 
    }

    @Override
    public String getAddress() {
        return super.getAddress(); 
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName); 
    }

    @Override
    public String getLastName() {
        return super.getLastName(); 
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName); 
    }

    @Override
    public String getFirstName() {
        return super.getFirstName(); 
    }

    @Override
    public void setType(String type) {
        super.setType(type); 
    }

    @Override
    public String getType() {
        return super.getType(); 
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password); 
    }

    @Override
    public String getPassword() {
        return super.getPassword(); 
    }

    @Override
    public void setId(String id) {
        super.setId(id); 
    }

    @Override
    public String getId() {
        return super.getId(); 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Librarian{");
        sb.append('}');
        return sb.toString();
    }
    
}

