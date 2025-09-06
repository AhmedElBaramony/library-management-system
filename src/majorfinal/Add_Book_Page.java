/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package majorfinal;

import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import static javafx.scene.control.ButtonBar.ButtonData.RIGHT;
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
public class Add_Book_Page {

  Library library ;
    Stage primaryStage;
    TextField Authorname; 
    TextField BookName;
     TextField Year;
    Button submitButton; 
    Button BackButton;
    Label statusLabel;
    Add_Remove_book add;
    
    
    public Add_Book_Page(Stage primaryStage ) {
        this.primaryStage = primaryStage; 
   
       BookName = new TextField();        
        Authorname = new TextField();
        Year = new TextField();
        library= new Library();
       add=new Add_Remove_book(library);
       submitButton = new Button("submit");
       BackButton = new Button("Back");
        statusLabel = new Label(); 
        BackButton.setAlignment(Pos.CENTER_RIGHT);
        statusLabel.setText("");
        
       submitButton.setOnAction(e -> {
           
           String bookname = BookName.getText();     
           String bookautor = Authorname.getText();
           String YearRelease = Year.getText();
           
         
           library.addBook(bookname, bookautor, YearRelease);
           statusLabel.setText("Book [ " +bookname+ " ]"+ " is added .");
           
       });
       
       BackButton.setOnAction(e -> {
           
       primaryStage.setScene(new LibrarianPage(primaryStage).getScene());  
       });
}
    
         public Scene getScene() {               
        VBox root = new VBox(20);   
        root.getChildren().addAll(BookName,  
                                  Authorname,
                                  Year,
                                  submitButton,
                                  BackButton,
                                  statusLabel);
         
        Scene scene = new Scene(root, 300, 250); 
        primaryStage.setScene(scene);
        return scene;               
    }
}
