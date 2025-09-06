package majorfinal;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class LoginPage {
    
    Stage primaryStage;
    TextField userNameField; 
    PasswordField passwordField;    
    Button loginButton;   
    Label statusLabel;     
    Login login;
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "123";
    private static final String USER_USERNAME = "user";
    private static final String USER_PASSWORD = "987";
    public boolean check;
    
    
    public LoginPage(Stage primaryStage) {
        this.primaryStage = primaryStage; 
        
        userNameField = new TextField();        
        passwordField = new PasswordField();        
        login = new Login();
        loginButton = new Button("submit");    
        statusLabel = new Label(); 
        
        userNameField.setPromptText("UserName");
        passwordField.setPromptText("Password");
        
        loginButton.setOnAction(e -> {
           
            String username = userNameField.getText();     
            String password = passwordField.getText();
          
            if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
                check = true;
                
                primaryStage.setScene(new LibrarianPage(primaryStage).getScene());
                
            }
            else if (username.equals(USER_USERNAME) && password.equals(USER_PASSWORD)) {
                check = false;
                System.out.println("User login successful.");
                primaryStage.setScene(new User_Page(primaryStage).getScene());
            } 
            else {
                statusLabel.setText("Wrong userName or Password try again");
            }
        });  
        
        
    }
    
    public Scene getScene() {               
        VBox root = new VBox(20);   
        root.getChildren().addAll(userNameField,  
                                  passwordField,
                                  loginButton,  
                                  statusLabel);
         
        Scene scene = new Scene(root, 300, 250); 
        primaryStage.setScene(scene);
        return scene;               
    }
}