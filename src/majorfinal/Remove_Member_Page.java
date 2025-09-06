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
import static javax.swing.text.html.HTML.Attribute.ID;

/**
 *
 * @author Hp
 */
public class Remove_Member_Page  {

    private final Stage primaryStage;
    Library library=new Library();
    
    Button submitButton;
    Button BackButton;
    TextField ID;
    Label statusLabel;
    
   public Remove_Member_Page(Stage primaryStage) {
        this.primaryStage = primaryStage; 
   
       ID = new TextField();        
 
       submitButton = new Button("submit"); 
        BackButton=new Button("back");
        BackButton.setAlignment(Pos.CENTER_RIGHT);
        statusLabel = new Label(); 
        
        
       submitButton.setOnAction(e -> {
           
           String Removed_Member = ID.getText();     
           boolean x=library.removeMember(Removed_Member);
           if(x==true){
           statusLabel.setText("Book with ID [ " + Removed_Member+"] is removed");
           }
           else{
           statusLabel.setText("Book with ID [ " + Removed_Member+" ] is not in the Library");
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
