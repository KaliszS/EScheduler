import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.mail.MessagingException;
import java.io.IOException;
import java.time.LocalDate;

public class OknoNowegoWydarzenia {

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

    private String wydarzenie;
    private OknoKalendarza oknoKalendarza;

    public void wyswietl(Stage primaryStage, OknoKalendarza okno) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("OknoNowegoWydarzenia.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 612, 400);
        primaryStage.setTitle("Wyślij maila");
        primaryStage.setScene(scene);
        primaryStage.show();
        oknoKalendarza = okno;

    }

    public void zapisz() {
        LocalDate rozp = rozpoczecie.getValue();
        LocalDate zako = zakonczenie.getValue();
        if(rozp == null || zako == null)
        {
            return;
        }

        podsumowanie.setText("PODSUMOWANIE\n" + nazwa.getText() + "\nPocz: " + rozp + "\nKon: " +
                zako + "\nMiejsce: " + miejsce.getText() + "\nOpis: " + opis.getText());
        wydarzenie = "" + rozp + ":" + zako;
        System.out.println(wydarzenie);
        oknoKalendarza.addEventToList(wydarzenie);
    }

    public String getWydarzenie(){
        return wydarzenie;
    }

    public void wyslij() {
        SendEmail javaEmail = new SendEmail();

        javaEmail.setMailServerProperties();
        try {
            javaEmail.createEmailMessage(podsumowanie.getText(), email.getText());
            javaEmail.sendEmail();
        } catch (MessagingException e) {
            System.out.println("Cannot send email");
        }

    }

}
