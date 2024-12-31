package GUIsetUp;

import backend.MetaData;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class BookStage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        Scene sceneNewClient = new Scene(root, 570, 440);
        stage.setTitle("New Book");
        stage.setScene(sceneNewClient);
        stage.show();

        //Set of navigation buttons
        HBox startOptions  = new HBox();
        Button mainPage = new Button("Main Page");
        Button save = new Button("Save");
        Button exit = new Button("Exit");

        startOptions.getChildren().add(mainPage);
        startOptions.getChildren().add(save);
        startOptions.getChildren().add(exit);

        root.getChildren().add(startOptions);

        VBox clientAdder = new VBox();

        Label titleLabel = new Label("Title: ");
        TextArea bookTitle = new TextArea();
        String title = bookTitle.getText();

        Label authorLabel = new Label("Author: ");
        TextArea bookAuthor= new TextArea();
        String author  = bookAuthor.getText();

        Label isbnLabel = new Label("ISBN: ");
        TextArea bookIsbn = new TextArea();
        String isbn = bookIsbn.getText();

        Label pagesLabel = new Label("Pages: ");
        TextArea bookPages =  new TextArea();
        String pages = bookPages.getText();

        Label publishLabel = new Label("Year of publish:");
        TextArea bookDate = new TextArea();


        clientAdder.getChildren().addAll(titleLabel, bookTitle);
        clientAdder.getChildren().addAll(authorLabel,bookAuthor);
        clientAdder.getChildren().addAll(isbnLabel , bookIsbn);
        clientAdder.getChildren().addAll(pagesLabel, bookPages);
        clientAdder.getChildren().addAll(publishLabel,bookDate);
        root.getChildren().add(clientAdder);

        mainPage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                StoreY mainPage = new StoreY();
                try {
                    mainPage.start(stage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
//                MetaData shelf = new MetaData();
//                shelf.addBookToShelf();

            }
        });

        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
            }
        });



    }
}
