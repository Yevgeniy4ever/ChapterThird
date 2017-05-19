package shiltd.myenums;

/**
 * Created by Yevgeniy on 17.05.2017.
 */
public enum TrafficLightColor {
    RED, GREEN, YELLOW;
}

class TrafficLightSimulator implements Runnable{
    private Thread thrd;
    private TrafficLightColor tlc;
    boolean stop = false;
    boolean changed = false;

    TrafficLightSimulator(TrafficLightColor init){
        thrd = new Thread(this);
        tlc = init;
        thrd.start();
    }

    TrafficLightSimulator(){
        thrd = new Thread(this);
        tlc = TrafficLightColor.RED;
        thrd.start();
    }

    public void run(){
        while(!stop){

            try{
                switch(tlc){
                    case GREEN:
                        Thread.sleep(10000);
                        break;
                    case YELLOW:
                        Thread.sleep(2000);
                        break;
                    case RED:
                        Thread.sleep(12000);
                }
            } catch (InterruptedException ex){
                System.out.println("ERROR" + ex);
            }
        } changeColor();
    }

    synchronized void changeColor() {

        switch (tlc){
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }

        changed = true;
        notify();
    }

    synchronized void waitForChange(){
        try{
            while(!changed)
                wait();
            changed = false;
        } catch (InterruptedException ex){
            System.out.println("ERROR");
        }
    }

    TrafficLightColor getColor(){
        return tlc;
    }

    void cancel(){
        stop = true;
    }
}

class TraficLightOld{
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);

        for (int i = 0; i < 10; i ++){
            System.out.println(t1.getColor());
            t1.waitForChange();
        }

        t1.cancel();
    }
}
