import java.sql.Time;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Dziennik d = new Dziennik();
        Wydarzenie w1 = new Wydarzenie(
                new GregorianCalendar(2010, 12, 3).getTime(),
                new Time(1, 5, 0),
                "Fryzjer", "sciecie", "wawa");
        d.dodajWydarzenie(w1);

        System.out.println(d);
    }
}