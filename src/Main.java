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
    public void start(Stage primaryStage) throws IOException{
        wyswietlOknoWydarzenia(primaryStage);

    }

    public void wyswietlOknoWydarzenia(Stage primaryStage) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("OknoNowegoWydarzenia.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}