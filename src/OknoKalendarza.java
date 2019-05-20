
import java.io.IOException;
import java.net.URL;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OknoKalendarza implements Initializable {

    @FXML
    private Font x1;
    @FXML
    private Button create_event;
    @FXML
    private Button delete_event;
    @FXML
    private Font x11;
    @FXML
    private TextArea calendar;
    private Text month_name;
    @FXML
    private Color x4;
    @FXML
    private Font x3;
    private TextField monthName;
    @FXML
    private ListView<String> listaWydarzen;
    
    private Stage stage;
    @FXML
    private ChoiceBox<String> monthChoice;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String month = getMonthName();
        listaWydarzen.getItems().add("Event1");
        listaWydarzen.getItems().add("Event2");
        listaWydarzen.getItems().add("Event3");
        monthChoice.setItems(FXCollections.observableArrayList("Styczeń", "Luty","Marzec", 
                "Kwiecień", "Maj", "Czerwiec", 
                "Lipiec", "Sierpień", "Wrzesień", 
                "Październik", "Listopad","Grudzień"));
        
        // add a listener 
       
      

    }
    
    private void setCalendar(String month){
        String days = getAllDays(month);
        calendar.setText(days);
    }

    private String getAllDays(String month) {
        int monthNumber = getMonthNumber(month);
        YearMonth yearMonthObject = YearMonth.of(1999, monthNumber);
        int lastDay = yearMonthObject.lengthOfMonth();
//        int lastDay = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= lastDay; i++) {
            sb.append(i).append(" ");
            if (i % 7 == 0) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    private int getMonthNumber(String month) {
        String[] monthName = {"Styczeń", "Luty",
            "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec",
            "Sierpień", "Wrzesień", "Październik", "Listopad",
            "Grudzień"};
        int number = 0;
        int i = 0;
        for(String m : monthName){
            if( m.equals(month)){
                number = i;
            }
            i++;
        }
        return number + 1;
    }

    @FXML
    private void stworzWydarzenie(ActionEvent event) throws IOException {
    }

    @FXML
    private void usunWydarzenie(ActionEvent event) {
    }

    public void wyswietl(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Okno_Kalendarza.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 900, 600);
        monthName = new TextField();
        primaryStage.setTitle("Kalendarz");
        primaryStage.setScene(scene);
        primaryStage.show();
        this.stage = primaryStage;
        month_name = new Text();
        calendar = new TextArea();
        listaWydarzen = new ListView<String>();
        monthChoice = new ChoiceBox<String>();
    }

    private String getMonthName() {
        String[] monthName = {"Styczeń", "Luty",
            "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec",
            "Sierpień", "Wrzesień", "Październik", "Listopad",
            "Grudzień"};

        Calendar cal = Calendar.getInstance();
        String month = monthName[cal.get(Calendar.MONTH)];

        return month;
    }

    public void wyswietlDzien(Date d) {

    }

    public void wyswietlTydzien() {

    }

    public void wyswietlMiesiac() {

    }

    public void wyswietlRok() {

    }


    @FXML
    private void monthChoosed(InputMethodEvent event) {
        String month = monthChoice.getValue();
        System.out.println(month);
//        setCalendar(month);
    }

}
