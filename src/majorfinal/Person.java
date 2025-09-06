package majorfinal;

/**
 *
 * @author Hp
 */
public class Person {
    private String id;
    private String password;
    private String type;
    private String firstName;
    private String lastName;
    private String address;
    private String cellPhone;
    private String email;
    private boolean isBlocked;
    
    public Person(){}

    public Person (String firstName, String lastName, String password,  String address, String cellPhone, String email, String type){
    
        this.firstName=firstName;
        this.lastName=lastName;
        this.password=password;
        this.address=address;
        this.cellPhone=cellPhone;
        this.email=email;
        this.type=type;
    }
    
    public Person(String type, String firstName, String lastName, String address, String cellPhone, String email, boolean isBlocked) {
        this.type = type;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cellPhone = cellPhone;
        this.email = email;
        this.isBlocked = isBlocked;
    }

    
    
    public Person(String type, String id, String password, String firstName,
                  String lastName,String address, String cellPhone, String email) {
        this.type = type;
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cellPhone = cellPhone;
        this.email = email;
    }
     
     public Person(String id){
     this.id=id;
     }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }
    
}
