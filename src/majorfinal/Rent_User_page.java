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
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Hp
 */
public class Rent_User_page {
    
    Button submitButton;
    Button BackButton;
    TextField  ID; 
    Library library = new Library();
    Label statusLabel;
    
    private final Stage primaryStage;
    
    public Rent_User_page(Stage primaryStage) {
        this.primaryStage = primaryStage; 
   
       ID = new TextField();    
        statusLabel=new Label();
 
       submitButton = new Button("submit");  
        BackButton=new Button("back");
        BackButton.setAlignment(Pos.CENTER_RIGHT);
        
        
       submitButton.setOnAction(e -> {
           
         String Rent_Book = ID.getText();     
         
          boolean x=library.Rent(Rent_Book);
           if(x==true){
           statusLabel.setText("Book with ID [ " + Rent_Book+"] is Rented succsefuly");
           }
           else{
           statusLabel.setText("Book with ID [ " + Rent_Book+" ] is already rented");
           }
       });
       
       BackButton.setOnAction(e -> {
       primaryStage.setScene(new User_Page(primaryStage).getScene());  
       });
       
}
    
         public Scene getScene() {               
        VBox root = new VBox(20);   
        root.getChildren().addAll(ID,
                                  submitButton,
                                  BackButton,
                                  statusLabel);
         
        Scene scene = new Scene(root, 300, 250); 
        primaryStage.setScene(scene);
        return scene;               
    }
}
