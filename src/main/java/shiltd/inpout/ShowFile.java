package shiltd.inpout;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Yevgeniy on 04.05.2017.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        if (args.length != 2) {
            System.out.println("Using: CopyFile from to");
            return;
        }

        try(FileInputStream in = new FileInputStream(args[0]);
            FileOutputStream out = new FileOutputStream(args[1])){
            do{
                i = in.read();
                if (i != -1) System.out.write(in.read());
            } while (i != -1);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("File not found");
        }
    }
}
