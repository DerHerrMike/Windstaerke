import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Treiber {


    int id = 1;
    private final List<Windgeschwindigkeit> gesammelteWerte = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void addWerte() {

        for (int i = 0; i < 11; i++) {
            System.out.println("Bitte die Windgeschwindigkeit eingeben: ");
            double wert = scan.nextDouble();
            id++;
            gesammelteWerte.add(new Windgeschwindigkeit(wert, id));
        }
    }


    public static void main(String[] args) {

        Treiber wd1 = new Treiber();
        wd1.addWerte();
        String s = wd1.gesammelteWerte.toString();
        System.out.println(s);


    }
}
