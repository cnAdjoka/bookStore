/**
 * @author Chris-Noah Adjoka
 */

package org.example.bookstore;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class storeY extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        Scene sceneDepart = new Scene(root, 370, 240);
        stage.setTitle("storeY");
        stage.setScene(sceneDepart);

        //Set of navigation buttons
        HBox startOptions  = new HBox();
        Button newClient = new Button("New Client");
        Button bookToInventory = new Button ("New Book");
        startOptions.getChildren().add(newClient);
        startOptions.getChildren().add(bookToInventory);
        root.getChildren().add(startOptions);

        //Scene if the user chooses to add a book to the database










        stage.show();



    }

    public static void main(String[] args) {
        launch();
    }
}