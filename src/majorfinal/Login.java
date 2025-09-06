package majorfinal;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hesham
 */


public class Login {
    private static final String ADMIN_FIRSTNAME = "admin";
    private static final String ADMIN_PASSWORD = "123";
    private static final String USER_FIRSTNAME = "user";
    private static final String USER_PASSWORD = "987";
    private static final int MAX_ATTEMPTS = 3;
    private int loginAttempts;
    public boolean check;
    public Login() {
        loginAttempts = 0;
    }

    public boolean login(String firsname, String pass) {
        while (true){
        

        if (firsname.equals(ADMIN_FIRSTNAME) && pass.equals(ADMIN_PASSWORD)) {
             check = true;
            System.out.println("Admin login successful.");
           
        }
        else if (firsname.equals(USER_FIRSTNAME) && pass.equals(USER_PASSWORD)) {
            check =false;
            System.out.println("User login successful.");
           
        } 
    }
        
    }

    public String getADMIN_FIRSTNAME() {
        return ADMIN_FIRSTNAME;
    }

    public String getADMIN_PASSWORD() {
        return ADMIN_PASSWORD;
    }

    public static String getUSER_FIRSTNAME() {
        return USER_FIRSTNAME;
    }

    public static String getUSER_PASSWORD() {
        return USER_PASSWORD;
    }

    public static int getMAX_ATTEMPTS() {
        return MAX_ATTEMPTS;
    }
    

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
    
}
