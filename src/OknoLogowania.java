import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class OknoLogowania {

    @FXML
    private Button zapisz;
    @FXML
    private TextField email;

    public void wyswietl(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("OknoLogowania.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 328, 224);
        primaryStage.setTitle("Nowe wydarzenie");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void sprawdzDaneOsobowe() {

    }

    public String zapisz() {
        return email.getText();
    }
}
