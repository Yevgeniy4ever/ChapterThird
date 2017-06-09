package shiltd.myinterfaces;

import shiltd.simpleconstractions.Vehicle;

/**
 * Created by Developer on 4/21/2017.
 */
public class TestStaticInterface {
    public static void main(String[] args) {
        int ID = MyIf.getUniversalID() + 17;
        System.out.println(ID);

        Vehicle vec = new Vehicle();
    }
}
