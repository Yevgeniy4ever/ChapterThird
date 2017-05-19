package shiltd.myenums;

/**
 * Created by Yevgeniy on 16.05.2017.
 */
public enum TrafficLight {
    RED, YELLOW, GREEN;
}

class TrafficLightDemo{
    TrafficLight trObj;
    TrafficLight defaultColor;
    String name;
    int ordinal;
    boolean isGreen;

    TrafficLightDemo(TrafficLight color, String n){
        defaultColor = color;
        name = n;
        System.out.println("");
    }

    void startLight() {
        trObj = defaultColor;
        ordinal = trObj.ordinal();

        for (int cycle = 1; cycle < 15; cycle ++) {

            switch (trObj) {
                case GREEN:
                    System.out.println("GREEN LIGHTS");
                    trObj = TrafficLight.YELLOW;
                    startCounting();
                    isGreen = true;

                    break;
                case RED:
                    System.out.println("RED LIGHTS");
                    trObj = TrafficLight.YELLOW;
                    startCounting();
                    isGreen = false;
                    break;
                case YELLOW:
                    System.out.println("YELLOW LIGHTS");
                    startCounting();
                    if (isGreen) trObj = TrafficLight.RED;
                    else trObj = TrafficLight.GREEN;
                    break;
            }
        }
    }

    void startCounting() {
        for (int sec = 10; sec > 0; sec--) {
            System.out.println(sec + " seconds before changing of the light");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

class TrafficLightStart{
    public static void main(String[] args) {
        TrafficLightDemo tld = new TrafficLightDemo(TrafficLight.GREEN, "NY");
        tld.startLight();
    }
}
