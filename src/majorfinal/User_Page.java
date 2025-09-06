/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package majorfinal;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author Hp
 */
public class User_Page {
    Library library;
    Stage primaryStage;

    VBox vbox = new VBox(10);

    public User_Page() {
    }

    
    
    public User_Page(Stage primaryStage) {
        this.primaryStage = primaryStage;

        Button searchBookBtn = new Button("Search book");
        searchBookBtn.setMinWidth(120);
        searchBookBtn.setPrefWidth(120);
        searchBookBtn.setMaxWidth(120);
        searchBookBtn.setOnAction(e -> {
            primaryStage.setScene(new Search_Book_User_Page(primaryStage).getScene());
        });

        Button searchMemberBtn = new Button("Search Member");
        searchMemberBtn.setMinWidth(120);
        searchMemberBtn.setPrefWidth(120);
        searchMemberBtn.setMaxWidth(120);
        searchMemberBtn.setOnAction(e -> {
            primaryStage.setScene(new Search_Member_User_Page(primaryStage).getScene());
        });

        Button addToSelfListBtn = new Button("Add Self to List");
        addToSelfListBtn.setMinWidth(120);
        addToSelfListBtn.setPrefWidth(120);
        addToSelfListBtn.setMaxWidth(120);
        addToSelfListBtn.setOnAction(e -> {
            primaryStage.setScene(new Add_to_Self_List_Page(primaryStage).getScene());
        });

        Button rentBtn = new Button("Rent a book");
        rentBtn.setMinWidth(120);
        rentBtn.setPrefWidth(120);
        rentBtn.setMaxWidth(120);
        rentBtn.setOnAction(e -> {
            primaryStage.setScene(new Rent_User_page(primaryStage).getScene());
        });

        vbox.getChildren().addAll(searchBookBtn, searchMemberBtn, addToSelfListBtn, rentBtn);
        vbox.setAlignment(Pos.CENTER);
    }

    public Scene getScene() {
        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);
        return scene;
    }
}
