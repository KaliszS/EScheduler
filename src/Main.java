import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws IOException{
        OknoNowegoWydarzenia okno1 = new OknoNowegoWydarzenia();
        okno1.wyswietl(primaryStage);
    }
}