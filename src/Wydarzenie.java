import java.sql.Time;
import java.util.Date;

public class Wydarzenie {
    private Date data;
    private double czasTrwania;
    private String nazwa;
    private String opis;
    private String miejsce;

    public Wydarzenie(Date data, double czasTrwania, String nazwa, String opis, String miejsce) {
        this.data = data;
        this.czasTrwania = czasTrwania;
        this.nazwa = nazwa;
        this.opis = opis;
        this.miejsce = miejsce;
    }

    public void edytujMiejsce(Wydarzenie w, String miejsce) {
        this.miejsce = miejsce;
    }

    public void edytujCzas(Wydarzenie w, Date data) {
        this.data = data;
    }

    public void edytujCzas(Wydarzenie w, double czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    public void edytujNazwe(Wydarzenie w, String nazwa) {
        this.nazwa = nazwa;
    }

    public void edytujOpis(Wydarzenie w, String opis) {
        this.opis = opis;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data: ").append(data).append("\nCzas trwania: ").append(czasTrwania).append("h\nNazwa: ").
                append(nazwa).append("\nOpis: ").append(opis).append("\nMiejsce: ").append(miejsce);
        return sb.toString();
    }
}