import java.util.Date;

public class Wydarzenie {
    private Date rozpoczecie;
    private Date zakonczenie;
    private String nazwa;
    private String opis;
    private String miejsce;

    private boolean res;

    public Wydarzenie(Date rozpoczecie, Date zakonczenie, String nazwa, String opis, String miejsce) {
        this.rozpoczecie = rozpoczecie;
        this.zakonczenie = zakonczenie;
        this.nazwa = nazwa;
        this.opis = opis;
        this.miejsce = miejsce;
    }

    public Date dajRozpoczecie() {
        return rozpoczecie;
    }

    public Date dajZakonczenie() {
        return zakonczenie;
    }

    public String dajNazwe() {
        return nazwa;
    }

    public void edytujMiejsce(Wydarzenie w, String miejsce) {
        this.miejsce = miejsce;
    }

    public void edytujCzas(Wydarzenie w, Date rozpoczecie, Date zakonczenie) {
        this.rozpoczecie = rozpoczecie;
        this.zakonczenie = zakonczenie;
    }

    public void edytujNazwe(Wydarzenie w, String nazwa) {
        this.nazwa = nazwa;
    }

    public void edytujOpis(Wydarzenie w, String opis) {
        this.opis = opis;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rozpocznie się: ").append(rozpoczecie).append("\nZakończy się: ").append(zakonczenie).append("\nNazwa: ").
                append(nazwa).append("\nOpis: ").append(opis).append("\nMiejsce: ").append(miejsce);
        return sb.toString();
    }

    public boolean walidujDaneWydarzenia(Wydarzenie w){
        if(res == true) return true;
        else return false;
    }


}