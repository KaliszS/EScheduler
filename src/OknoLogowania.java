import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class OknoLogowania {

    @FXML
    private Button zapisz;
    @FXML
    private TextField email;

    public void dodajDaneOsobowe(String imie, String nazwisko, String email) {

    }

    public static void sprawdzDaneOsobowe() {

    }

    public String zapisz() {
        return email.getText();
    }
}
