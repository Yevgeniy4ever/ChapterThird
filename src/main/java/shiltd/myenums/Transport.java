package shiltd.myenums;

/**
 * Created by Developer on 5/16/2017.
 */
public enum Transport {
    CAR, TRACK, AIRLINE, TRAIN, BOAT
}

class EnumDemo{
    public static void main(String[] args) {
        Transport tp;

        tp = Transport.AIRLINE;

        System.out.println("Value of tp is " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        if (tp == Transport.TRAIN)
            System.out.println("tp contains TRAIN \n");

        switch (tp) {
            case CAR:
                System.out.println("CAR transports children ");
                break;
            case TRACK:
                System.out.println("TRACK transports cargo ");
                break;
            case AIRLINE:
                System.out.println("AIRPLANE flyes ");
                break;
            case TRAIN:
                System.out.println("TRAIN goes by a rails ");
                break;
            case BOAT:
                System.out.println("BOAT floats on water ");
        }

    }
}
