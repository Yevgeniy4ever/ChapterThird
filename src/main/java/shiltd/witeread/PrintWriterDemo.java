package shiltd.witeread;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Developer on 5/10/2017.
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException{
        PrintWriter wr = new PrintWriter(System.out, true);
        String str = "Demo #";

        for(int i = 0; i < 10; i++)
        wr.println(str + i);
        wr.println();
    }
}
