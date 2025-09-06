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
public class Remove_From_list_Page  {
    
   Stage primaryStage;
    
   Library library = new Library();
    Button submitButton;
    Button BackButton;
    TextField ID;
    Label statusLabel;
    
   public Remove_From_list_Page(Stage primaryStage) {
        this.primaryStage = primaryStage; 
   
       ID = new TextField();        
 
       submitButton = new Button("submit"); 
        BackButton=new Button("back");
        BackButton.setAlignment(Pos.CENTER_RIGHT);
        statusLabel = new Label(); 
        
        
       submitButton.setOnAction(e -> {
 
           
           String Removed_Order = ID.getText();     
           boolean x=library.remove_From_Order(Removed_Order);
           if(x==false){
           statusLabel.setText("Member with ID [ " + Removed_Order+"] is removed from OrderList");
           }
           else{
           statusLabel.setText("Member with ID [ " + Removed_Order+" ] is not in the OrderList");
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
