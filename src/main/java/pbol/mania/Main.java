package pbol.mania;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Chess");
        Label label = new Label("Chess with Java!");

        StackPane root = new StackPane();
        root.getChildren().add(label);
        stage.setScene(new Scene(root, 500, 500));
        stage.show();
    }
}
