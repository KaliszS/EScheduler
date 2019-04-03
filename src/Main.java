import java.sql.Time;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Dziennik d = new Dziennik();
        Wydarzenie w1 = new Wydarzenie(
                new GregorianCalendar(2010, 11, 3, 13, 00).getTime(),
                1.5,
                "Fryzjer", "sciecie", "wawa");
        d.dodajWydarzenie(w1);

        System.out.println(d);
        
        d.dodajWydarzenie(w1);
    }
}