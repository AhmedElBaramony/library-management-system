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
public class Remove_Book_Page  {
    
   Library library = new Library();
    
    Stage primaryStage;
    TextField ID; 
    Button submitButton;   
    Label statusLabel;
    Button BackButton;
    
    
    public Remove_Book_Page(Stage primaryStage) {
        this.primaryStage = primaryStage; 
   
       ID = new TextField();        
 
       submitButton = new Button("submit"); 
        statusLabel = new Label(); 
        BackButton=new Button("back");
        BackButton.setAlignment(Pos.CENTER_RIGHT);
        
        
       submitButton.setOnAction(e -> {
           
           String Removed_Book = ID.getText();     
           boolean x=library.removeBook(Removed_Book);
           if(x==true){
           statusLabel.setText("Book with ID [ " + Removed_Book+"] is removed");
           }
           else{
           statusLabel.setText("Book with ID [ " + Removed_Book+" ] is not in the Library");
           }
        
       });
       
       BackButton.setOnAction(e -> {
           
       primaryStage.setScene(new LibrarianPage(primaryStage).getScene());  
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