package shiltd.parallelprogs;

/**
 * Created by Developer on 5/16/2017.
 */
public class UseMainThread {
    public static void main(String[] args) {

        Thread uno = Thread.currentThread();

        System.out.println(uno.getName());
        uno.setPriority(Thread.NORM_PRIORITY + 3);

        uno.setName("NewNameForMainThread");
        System.out.println(uno.getName());

        System.out.println();
    }
}
