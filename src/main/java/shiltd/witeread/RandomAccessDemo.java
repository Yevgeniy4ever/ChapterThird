package shiltd.witeread;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

/**
 * Created by Yevgeniy on 11.05.2017.
 */
public class RandomAccessDemo {
    public static void main(String[] args) {
        double data[] = {1.1, 1.3, 5.6};
        double d;
        PrintWriter pw = new PrintWriter(System.out, true);

        try(RandomAccessFile raf = new RandomAccessFile("D:\\file.txt", "rw")){
            for (int i = 0; i < data.length; i++){
                raf.writeDouble(data[i]);
            }
            raf.seek(0);
            d = raf.readDouble();
            pw.println("First value is " + d);
            raf.seek(8);
            d = raf.readDouble();
            pw.println("Second value is " + d);
            raf.seek(8*3);
            d = raf.readDouble();
            pw.println("Third values is " + d);
            pw.println();
        } catch (IOException ex){
            pw.println("Error" + ex);
        }


    }
}
