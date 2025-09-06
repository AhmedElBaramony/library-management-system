/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package majorfinal;

import javafx.application.Application;  
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HomePage extends Application {
    Library library;

    
    Button loginButton = new Button("Login");
    Button registerButton = new Button("Register");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        library = new Library();
        library.addBook("Clean-Code", "Ahmed", "2000");
        library.addMember("Ahmed", "Mohamed", "1234", "Cairo", "01280045475", "ahmed@mail.com", "Male");

        Label titleLabel = new Label("Welcome to our Library Management System");
        titleLabel.setStyle("-fx-font-size: 20pt");

        loginButton.setMinWidth(120);
        loginButton.setPrefWidth(120);
        loginButton.setMaxWidth(120);
        loginButton.setOnAction(e -> {
            primaryStage.setScene(new LoginPage(primaryStage).getScene());
        });

        
        registerButton.setMinWidth(120);
        registerButton.setPrefWidth(120);
        registerButton.setMaxWidth(120);
        registerButton.setOnAction(e -> {
            primaryStage.setScene(new Add_Member_Page2(primaryStage).getScene());
        });

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(titleLabel, loginButton, registerButton);
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setTitle("Home Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
