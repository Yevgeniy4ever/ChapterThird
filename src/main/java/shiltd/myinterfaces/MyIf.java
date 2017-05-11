package shiltd.myinterfaces;

/**
 * Created by Developer on 4/21/2017.
 */
public interface MyIf {
    int getUserID();

    default int getAdminID(){
        return 1;
    }

    static int getUniversalID(){
        return 178+345/5;
    }
}
