package shiltd.simpleconstractions;

/**
 * Created by Developer on 4/17/2017.
 */
public class Vehicle {
    private int passengers; // количество пассажиров
    private int fuelcap; // емкость топливного бака
    private int mpg; // потребление топлива в милях на галлон

    public Vehicle(){

    }
    // Это конструктор класса Vehicle
    Vehicle (int р, int f, int m) {
        passengers = р;

        fuelcap = f;
        mpg = m;
    }
// Определить дальность поездки транспортного средства
    int range () {
        return mpg * fuelcap;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
