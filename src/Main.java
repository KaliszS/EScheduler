import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Dziennik d = new Dziennik();
        Wydarzenie w1 = new Wydarzenie(
                new GregorianCalendar(2010, 11, 3, 13, 00).getTime(),
                new GregorianCalendar(2010, 11, 3, 14, 00).getTime(),
                "Fryzjer", "sciecie", "wawa");
        d.dodajWydarzenie(w1);

        System.out.println(d);

        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        System.out.println(sdf.format(w1.dajZakonczenie()));
    }
}