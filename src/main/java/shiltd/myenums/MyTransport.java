package shiltd.myenums;

/**
 * Created by Developer on 5/16/2017.
 */
public enum MyTransport {
    CAR(80), AIRPLANE(600), BUS(40), TRUCK(50), BOAT(22), TRAIN(70);

    private int speed;

    MyTransport(int speed){
        this.speed = speed;
    }

    int getSpeed(){
        return speed;
    }
}

class EnumDemo2{
    public static void main(String[] args) {
        MyTransport tp;
        MyTransport tp2;
        MyTransport tp3[];

        tp = MyTransport.CAR;
        tp2 = MyTransport.valueOf("AIRPLANE");
        tp3 = MyTransport.values();

        System.out.println(tp);
        System.out.println(tp2);

        for(MyTransport uno : tp3){
            System.out.println(uno);
        }

        int cond = tp.compareTo(tp2);
        if(cond == 0) System.out.println("True");
        else System.out.println("False");

        System.out.println(MyTransport.CAR.getSpeed());

        System.out.println(tp2.ordinal());

    }
}
