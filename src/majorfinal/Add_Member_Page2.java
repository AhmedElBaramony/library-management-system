/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Hp
 */
public class Add_Member_Page2 {
    
    Library library = new Library();
    
    Reader reader;
    
    Stage primaryStage;
    TextField firstNameField; 
    TextField lastNameField;
    PasswordField passwordField;
    TextField addressField;
    TextField cellPhoneField;
    TextField emailField;
    TextField typeField;
    Button submitButton;   
    Label statusLabel;
    Button backButton;
    
    public Add_Member_Page2(Stage primaryStage) {
        this.primaryStage = primaryStage; 
   
        firstNameField = new TextField();        
        lastNameField = new TextField();
        passwordField = new PasswordField();
        addressField = new TextField();
        cellPhoneField = new TextField();
        emailField = new TextField();
        typeField = new TextField();
       
        submitButton = new Button("Submit"); 
        statusLabel = new Label(); 
        backButton = new Button("Back");
        backButton.setAlignment(Pos.CENTER_RIGHT);
        
       
        firstNameField.setAlignment(Pos.CENTER);
        lastNameField.setAlignment(Pos.CENTER);
        passwordField.setAlignment(Pos.CENTER);
        addressField.setAlignment(Pos.CENTER);
        cellPhoneField.setAlignment(Pos.CENTER);
        emailField.setAlignment(Pos.CENTER);
        typeField.setAlignment(Pos.CENTER);
        

        primaryStage.setTitle("Registration");
        
        submitButton.setOnAction(e -> {
            String firstName = firstNameField.getText();     
            String lastName = lastNameField.getText();
            String password = passwordField.getText();
            String address = addressField.getText();
            String cellPhone = cellPhoneField.getText();
            String email = emailField.getText();
            String type = typeField.getText();
          
            Reader x = library.searchMembers(firstName);
         
            if (x.getFirstName() != "Invalid") {
                statusLabel.setText("Reader with Id " + x.getFirstName() + " " + x.getLastName() + " " + x.getAddress() + " " + x.getCellPhone() + " " + x.getEmail() + " is in the Library");
            } else {
                statusLabel.setText("Reader with Id [ " + x.getId() + " ] is not in the Library");
            }  
           
            primaryStage.setScene(new User_Page(primaryStage).getScene());
        });
    }
    
    public Scene getScene() {               
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        
        gridPane.add(new Label("First Name: "), 0, 0);
        gridPane.add(firstNameField, 1, 0);
        
        gridPane.add(new Label("Last Name: "), 0, 1);
        gridPane.add(lastNameField, 1, 1);
        
        gridPane.add(new Label("Password: "), 0, 2);
        gridPane.add(passwordField, 1, 2);
        
        gridPane.add(new Label("Address: "), 0, 3);
        gridPane.add(addressField, 1, 3);
        
        gridPane.add(new Label("Cell Phone: "), 0, 4);
        gridPane.add(cellPhoneField, 1, 4);
        
        gridPane.add(new Label("Email: "), 0, 5);
        gridPane.add(emailField, 1, 5);
        
        gridPane.add(new Label("Type: "), 0, 6);
        gridPane.add(typeField, 1, 6);

        gridPane.add(submitButton, 1, 7);
        gridPane.add(backButton, 1, 8);
        
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(new Label("Registration"), gridPane, statusLabel);
         
        Scene scene = new Scene(root, 350, 400); 
        primaryStage.setScene(scene);
        return scene;               
    }
    
}
