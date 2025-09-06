
package majorfinal;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Hp
 */
public class Add_Member_Page {
    
    Library library = new Library();
    
    Reader reader;
    
    Stage primaryStage;
    TextField FirstName; 
    TextField LastName;
    PasswordField passwordField;
    TextField Address;
    TextField cellPhone;
    TextField email;
    TextField isBloked;
    TextField Type;
    Button submitButton;   
    Label statusLabel;
    Button BackButton;
    

    public Add_Member_Page(Stage primaryStage) {
        this.primaryStage = primaryStage; 
   
       FirstName = new TextField();        
       LastName = new TextField();
       passwordField= new PasswordField();
       Address= new TextField();
       cellPhone= new TextField();
       email= new TextField();
       isBloked= new TextField();
       Type= new TextField();
       
       
       submitButton = new Button("submit"); 
        statusLabel = new Label(); 
        BackButton = new Button("back");
        BackButton.setAlignment(Pos.CENTER_RIGHT);
        
       submitButton.setOnAction(e -> {
           
           String firstname = FirstName.getText();     
           String lastname = LastName.getText();
           String password = passwordField.getText();
           String address = Address.getText();
           String phone = cellPhone.getText();
           String mail = email.getText();
           String type = Type.getText();
     
           library.addMember(firstname,lastname,password,address,phone,mail,type);
        statusLabel.setText("Reader [ " +firstname+ " ]"+ " is added .");
       
       });
       
       
       BackButton.setOnAction(e ->{
       
       primaryStage.setScene(new LibrarianPage(primaryStage).getScene()); 
       
       });
       
       

       
       
}
    
         public Scene getScene() {               
        VBox root = new VBox(20);   
        root.getChildren().addAll(FirstName,  
                                  LastName,
                                  passwordField,
                                  Address,
                                  cellPhone,
                                  email,
                                  Type,
                                  submitButton,
                                  BackButton,
                                  statusLabel);
         
        Scene scene = new Scene(root, 300, 250); 
        primaryStage.setScene(scene);
        return scene;               
    }
    
}
