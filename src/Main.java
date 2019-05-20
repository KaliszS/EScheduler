import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws IOException{
        OknoKalendarza okno1 = new OknoKalendarza();
        okno1.wyswietl(primaryStage);

        /*
        OknoLogowania okno2 = new OknoLogowania();
        okno2.wyswietl(primaryStage);
        */

    }
}