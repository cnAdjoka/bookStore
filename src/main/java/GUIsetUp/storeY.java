/**
 * @author Chris-Noah Adjoka
 */

package GUIsetUp;
import backend.Book;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class storeY extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        Scene sceneDepart = new Scene(root, 570, 440);
        stage.setTitle("storeY");
        stage.setScene(sceneDepart);
        stage.show();

        //Set of navigation buttons
        HBox startOptions  = new HBox();
        Button newClient = new Button("New Client");
        Button bookToInventory = new Button ("New Book");
        Button exit = new Button("Exit");
        Button save = new Button("Save");
        startOptions.getChildren().add(newClient);
        startOptions.getChildren().add(bookToInventory);
        startOptions.getChildren().add(exit);
        startOptions.getChildren().add(save);
        root.getChildren().add(startOptions);

        //EventHandlers

        newClient.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {


            }
        });

        bookToInventory.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //Outputs a new Vbox that is the interface used to add a book to the library.

                VBox bookAdder = new VBox();
                Label titleLabel = new Label("Book title: ");
                TextArea bookTitle = new TextArea();

                Label authorLabel = new Label("Author: ");
                TextArea bookAuthor= new TextArea();

                Label isbnLabel = new Label("ISBN: ");
                TextArea bookISBN = new TextArea();

                Label pagesLabel = new Label("Number of pages: ");
                TextArea numberOfPages =  new TextArea();

                Label yearLabel = new Label("Year: ");
                TextArea bookPublishYear = new TextArea();

                bookAdder.getChildren().addAll(titleLabel,bookTitle);
                bookAdder.getChildren().addAll(authorLabel,bookAuthor);
                bookAdder.getChildren().addAll(isbnLabel , bookISBN);
                bookAdder.getChildren().addAll(pagesLabel,numberOfPages);
                bookAdder.getChildren().addAll(yearLabel,bookPublishYear);
                root.getChildren().add(bookAdder);


            }
        });

        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
            }
        });

        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });



    }

    public static void main(String[] args) {
//        launch();
        Book test = new Book("Harry Potter","Jk Rowling",540,2007, 978316148100L);
        test.
    }
}