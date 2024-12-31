/**
 * @author Chris-Noah Adjoka
 */

package GUIsetUp;
import backend.MetaData;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class StoreY extends Application {

    //TODO : Check this thing 
    public MetaData shelf;

    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();
        Scene sceneDepart = new Scene(root, 570, 440);
        stage.setTitle("StoreY");
        stage.setScene(sceneDepart);
        stage.show();

        //Set of navigation buttons
        HBox startOptions  = new HBox();
        Button newClient = new Button("New Client");
        Button bookToInventory = new Button ("New Book");
        Button exit = new Button("Exit");
        startOptions.getChildren().add(newClient);
        startOptions.getChildren().add(bookToInventory);
        startOptions.getChildren().add(exit);
        root.getChildren().add(startOptions);

        //EventHandlers

        newClient.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                ClientStage client = new ClientStage();
                client.start(stage);

            }
        });

        bookToInventory.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                BookStage book = new BookStage();
                book.start(stage);

            }
        });

        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
            }
        });


    }

    public static void main(String[] args)  {
        launch();


    }
}