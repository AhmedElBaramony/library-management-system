/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class LibrarianPage {

    Library library =new Library();
    Stage primaryStage;

    VBox vbox = new VBox(10);

    public LibrarianPage(Stage primaryStage) {
        this.primaryStage = primaryStage;

        Label titleLabel = new Label("Librarian");
        titleLabel.setStyle("-fx-font-size: 20pt");

        Button addBookBtn = new Button("Add Book");
        addBookBtn.setMinWidth(120);
        addBookBtn.setPrefWidth(120);
        addBookBtn.setMaxWidth(120);
        addBookBtn.setOnAction(e -> {
            primaryStage.setScene(new Add_Book_Page(primaryStage).getScene());
        });

        Button removeBookBtn = new Button("Remove Book");
        removeBookBtn.setMinWidth(120);
        removeBookBtn.setPrefWidth(120);
        removeBookBtn.setMaxWidth(120);
        removeBookBtn.setOnAction(e -> {
            primaryStage.setScene(new Remove_Book_Page(primaryStage).getScene());
        });

        Button addMemberBtn = new Button("Add Member");
        addMemberBtn.setMinWidth(120);
        addMemberBtn.setPrefWidth(120);
        addMemberBtn.setMaxWidth(120);
        addMemberBtn.setOnAction(e -> {
            primaryStage.setScene(new Add_Member_Page(primaryStage).getScene());
        });

        Button removeMemberBtn = new Button("Remove Member");
        removeMemberBtn.setMinWidth(120);
        removeMemberBtn.setPrefWidth(120);
        removeMemberBtn.setMaxWidth(120);
        removeMemberBtn.setOnAction(e -> {
            primaryStage.setScene(new Remove_Member_Page(primaryStage).getScene());
        });

        Button searchBookBtn = new Button("Search book");
        searchBookBtn.setMinWidth(120);
        searchBookBtn.setPrefWidth(120);
        searchBookBtn.setMaxWidth(120);
        searchBookBtn.setOnAction(e -> {
            primaryStage.setScene(new Search_Book_page(primaryStage).getScene());
        });

        Button searchMemberBtn = new Button("Search Member");
        searchMemberBtn.setMinWidth(120);
        searchMemberBtn.setPrefWidth(120);
        searchMemberBtn.setMaxWidth(120);
        searchMemberBtn.setOnAction(e -> {
            primaryStage.setScene(new Search_Member_Page(primaryStage).getScene());
        });

        Button addToListBtn = new Button("Add to List");
        addToListBtn.setMinWidth(120);
        addToListBtn.setPrefWidth(120);
        addToListBtn.setMaxWidth(120);
        addToListBtn.setOnAction(e -> {
            primaryStage.setScene(new Add_to_List_Page(primaryStage).getScene());
        });

        Button removeFromListBtn = new Button("Remove From list");
        removeFromListBtn.setMinWidth(120);
        removeFromListBtn.setPrefWidth(120);
        removeFromListBtn.setMaxWidth(120);
        removeFromListBtn.setOnAction(e -> {
            primaryStage.setScene(new Remove_From_list_Page(primaryStage).getScene());
        });

        Button rentBtn = new Button("Rent a book");
        rentBtn.setMinWidth(120);
        rentBtn.setPrefWidth(120);
        rentBtn.setMaxWidth(120);
        rentBtn.setOnAction(e -> {
            primaryStage.setScene(new Rent_page(primaryStage).getScene());
        });

        Button blockBtn = new Button("Block user");
        blockBtn.setMinWidth(120);
        blockBtn.setPrefWidth(120);
        blockBtn.setMaxWidth(120);
        blockBtn.setOnAction(e -> {
            primaryStage.setScene(new Block_user_Page(primaryStage).getScene());
        });

        vbox.getChildren().addAll(titleLabel, addBookBtn, removeBookBtn, addMemberBtn, removeMemberBtn,
                searchBookBtn, searchMemberBtn, addToListBtn, removeFromListBtn, rentBtn, blockBtn);
        vbox.setAlignment(Pos.CENTER);
    }

    public Scene getScene() {
        Scene scene = new Scene(vbox, 400, 400);
        primaryStage.setScene(scene);
        return scene;
    }
}