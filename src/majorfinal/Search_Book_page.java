/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package majorfinal;

import java.util.ArrayList;
import java.util.List;
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
public class Search_Book_page  {
    

    Stage primaryStage;
    Library library = new Library();
   
   private static List<Book> books=new ArrayList<>();
    
    Button submitButton;
    Button BackButton;
    TextField ID;
    Label statusLabel;
    Label statuslabel;
   public Search_Book_page(Stage primaryStage) {
        this.primaryStage = primaryStage; 
   
       ID = new TextField(); 
    
 
       submitButton = new Button("submit"); 
        BackButton=new Button("back");
        BackButton.setAlignment(Pos.CENTER_RIGHT);
        statusLabel=new Label();
        statuslabel=new Label();
        
       submitButton.setOnAction(e -> {
           
           String Search_Book = ID.getText(); 
           Book x=library.searchBooks(Search_Book);
         
           if(x.getName()!="Invalid"){
           statusLabel.setText("Book with Id [ "+ Search_Book+ "]" + x.getName()+  x.getAuthor()+  x.getPublishYear()+"is in the Library");

           }
           else{
           statusLabel.setText("Book with Id [ " + Search_Book+" ] is not in the Library");
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
                                  statusLabel,
                                  statuslabel);
         
        Scene scene = new Scene(root, 300, 250); 
        primaryStage.setScene(scene);
        return scene;               
    }
    
}
