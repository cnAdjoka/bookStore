package GUIsetUp;
import backend.Client;
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


public class ClientStage extends Application{
    public void start(Stage stage){
        VBox root = new VBox();
        Scene sceneNewClient = new Scene(root, 570, 440);
        stage.setTitle("New Client");
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

        Label titleLabel = new Label("Name: ");
        TextArea clientName = new TextArea();

        Label authorLabel = new Label("Date of birth: ");
        TextArea clientDateOfBirth= new TextArea();

        Label isbnLabel = new Label("Address: ");
        TextArea clientAddress = new TextArea();

        Label pagesLabel = new Label("Email Address: ");
        TextArea clientEmail =  new TextArea();



        clientAdder.getChildren().addAll(titleLabel,clientName);
        clientAdder.getChildren().addAll(authorLabel,clientDateOfBirth);
        clientAdder.getChildren().addAll(isbnLabel , clientAddress);
        clientAdder.getChildren().addAll(pagesLabel,clientEmail);
        root.getChildren().add(clientAdder);

        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Client client1 = new Client(clientName.getText(),clientAddress.getText(),clientDateOfBirth.getText(),clientEmail.getText());








            }
        });
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

        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {stage.close();}
        });
    }

}
