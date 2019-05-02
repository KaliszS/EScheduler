import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class OknoNowegoWydarzenia {

    @FXML
    private Button zapisz;
    @FXML
    private TextField nazwa;
    @FXML
    private DatePicker rozpoczecie;
    @FXML
    private DatePicker zakonczenie;
    @FXML
    private TextField opis;
    @FXML
    private TextField miejsce;
    @FXML
    private TextArea podsumowanie;

    public void wyswietl(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("OknoNowegoWydarzenia.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void zamknij() {

    }

    public void podsumuj() {
        LocalDate rozp = rozpoczecie.getValue();
        LocalDate zako = zakonczenie.getValue();
        if(rozp == null || zako == null)
        {
            return;
        }
        podsumowanie.setText(nazwa.getText() + "\nPocz: " + rozp + "\nKon: " + zako + "\nMiejsce: " + miejsce.getText() + "\nOpis: " + opis.getText());
    }

}
