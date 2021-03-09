import java.util.Scanner;

public class Windgeschwindigkeit {

    private double stundenKilometer = 0.02f;
    double knoten;
    int beaufort;
    int id = 0;
    boolean isOrkan;
    boolean isWindstill;

    // Konstruktor
    public Windgeschwindigkeit(double stundenKilometer, int id) {
        this.stundenKilometer = stundenKilometer;
        this.id = id;

    }

    // Getter
    public double getStundenKilometer() {
        return stundenKilometer;
    }

    public double getKnoten() {
        return stundenKilometer / 1.852;
    }

    public int getBeaufort() {
        beaufort = (int) (Math.pow(getStundenKilometer() / 3.01, 0.6666) + 0.5);
        if (beaufort > 12) {
            beaufort = 12;
        }
        return beaufort;
    }

    public boolean isOrkan() {
        return getStundenKilometer() > 120.0;
    }

    public boolean isWindstill() {
        return getStundenKilometer() < 2.0;
    }

    @Override
    public String toString() {
        return "Windgeschwindigkeit{" +
                "stundenKilometer=" + stundenKilometer +
                '}';
    }

    public void setStundenKilometer(double stundenKilometer) {
        this.stundenKilometer = stundenKilometer;
    }
}
