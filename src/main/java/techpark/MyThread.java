package techpark;

/**
 * Created by Developer on 6/20/2017.
 */
public class MyThread extends Thread {
    String name;

    public MyThread(String name){
        this.name = name;
        System.out.println("It is new object of Thread");
    }

}
