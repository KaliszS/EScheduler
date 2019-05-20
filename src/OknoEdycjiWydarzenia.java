import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class OknoEdycjiWydarzenia {

    @FXML
    private Button zapisz;
    @FXML
    private Button wyslij;
    @FXML
    private TextField nazwa;
    @FXML
    private TextField email;
    @FXML
    private DatePicker rozpoczecie;
    @FXML
    private DatePicker zakonczenie;
    @FXML
    private TextField opis;
    @FXML
    private TextField miejsce;
    @FXML
    private Label podsumowanie;

    public void wyswietl(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("OknoEdycjiWydarzenia.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 612, 400);
        primaryStage.setTitle("Edytuj wydarzenie");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void zapisz() {
        LocalDate rozp = rozpoczecie.getValue();
        LocalDate zako = zakonczenie.getValue();
        if(rozp == null || zako == null)
        {
            return;
        }
    }

   

}
