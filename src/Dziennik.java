import java.util.HashSet;
import java.util.Set;

public class Dziennik {
    private static Set<Wydarzenie> wydarzenia;

    public Dziennik() {
        wydarzenia = new HashSet<>();
    }

    public void dodajWydarzenie(Wydarzenie w) {
        if(wydarzenia.contains(w) == true)
            System.err.println("Wydarzenie juz istnieje");
        else
            wydarzenia.add(w);
    }

    public void usunWydarzenie(Wydarzenie w) {
        wydarzenia.remove(w);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Wydarzenie w : wydarzenia)
            sb.append(w);
        return sb.toString();
    }
}