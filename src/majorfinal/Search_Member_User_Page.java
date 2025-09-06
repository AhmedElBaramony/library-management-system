/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package majorfinal;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Hp
 */
public class Search_Member_User_Page {
    
    Stage primaryStage;   
   
    Library library = new Library();
    Reader reader=new Reader();
    
    Button submitButton;
    Button BackButton;
    TextField ID;
    Label statusLabel;
    
    public Search_Member_User_Page(Stage primaryStage) {
        this.primaryStage = primaryStage; 
   
        ID = new TextField();        
        ID.setPrefWidth(150);
 
        submitButton = new Button("submit"); 
        BackButton = new Button("back");
        BackButton.setAlignment(Pos.CENTER_RIGHT);
        statusLabel = new Label(); 
        
        submitButton.setOnAction(e -> {
           
            String Search_Member = ID.getText();     
            Reader x = library.searchMembers(Search_Member);
         
            if (x.getFirstName() != "Invalid") {
                statusLabel.setText("Reader with ID [" + Search_Member + "]\n" +
                                     x.getFirstName() + " " +  x.getLastName() + "\n" +
                                     x.getAddress() + "\n" +
                                     x.getCellPhone() + " " + x.getEmail() + "\n" +
                                     "is in the Library");
            } else {
                statusLabel.setText("Reader with ID [" + Search_Member + "]\n" +
                                     "is not in the Library");
            }  
           
        });
       
        BackButton.setOnAction(e -> {
            primaryStage.setScene(new User_Page(primaryStage).getScene());  
        });
       
    }
    
    public Scene getScene() {               
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        
        Label titleLabel = new Label("Search for Members");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        GridPane.setHalignment(titleLabel, HPos.CENTER);
        grid.add(titleLabel, 0, 0, 2, 1);
        
        Label idLabel = new Label("Enter ID:");
        GridPane.setHalignment(idLabel, HPos.LEFT);
        grid.add(idLabel, 0, 1);
        
        grid.add(ID, 1, 1);
        
        grid.add(submitButton, 0, 2);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        
        grid.add(BackButton, 1, 2);
        GridPane.setHalignment(BackButton, HPos.RIGHT);
        statusLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");
        GridPane.setHalignment(statusLabel, HPos.CENTER);
        GridPane.setColumnSpan(statusLabel, 2);
        grid.add(statusLabel, 0, 3);
         
        Scene scene = new Scene(grid, 300, 250); 
        primaryStage.setScene(scene);
        return scene;               
    
    }
}