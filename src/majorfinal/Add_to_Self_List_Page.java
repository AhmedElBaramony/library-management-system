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
public class Add_to_Self_List_Page {
    
    Stage primaryStage;
    
    Library library=new Library();
    Button submitButton;
    Button BackButton;
    TextField ID;
    Label statusLabel;
    
    public Add_to_Self_List_Page(Stage primaryStage) {
        this.primaryStage = primaryStage; 
   
        ID = new TextField();        
        ID.setPrefWidth(150);
 
        submitButton = new Button("submit"); 
        BackButton=new Button("back");
        BackButton.setAlignment(Pos.CENTER_RIGHT);
        statusLabel = new Label(); 
        
        submitButton.setOnAction(e -> {
           
            String Add_Order = ID.getText(); 
            boolean x=library.removeBook(Add_Order);
            if(x==true){
                statusLabel.setText("Member with ID [ " + Add_Order+"] is Already the Library");
            }
            else{
                statusLabel.setText("Member with ID [ " + Add_Order+" ] is Added to Library");
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
        
        Label titleLabel = new Label("Adding Yourself to the Order List");
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
        
        grid.add(statusLabel, 0, 3, 2, 1);
        GridPane.setHalignment(statusLabel, HPos.CENTER);
         
        Scene scene = new Scene(grid, 300, 250); 
        primaryStage.setScene(scene);
        return scene;               
    }
}