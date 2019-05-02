import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException, InterruptedException{
        OknoNowegoWydarzenia okno1 = new OknoNowegoWydarzenia();
        okno1.wyswietl(primaryStage);


    }


    public static void main(String[] args) {
        launch(args);
    }
}