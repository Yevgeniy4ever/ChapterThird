package inpout;

import java.io.*;

/**
 * Created by Yevgeniy on 04.05.2017.
 */
public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;


        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("myFile"))){
            System.out.println("Wrote: " + i);
            out.writeInt(i);
            System.out.println("Wrote: " + d);
            out.writeDouble(d);
            System.out.println("Wrote: " + b);
            out.writeBoolean(b);
        } catch (IOException ex){
            ex.printStackTrace();
            System.out.println("Error with OutputString");
            return;
        }
        System.out.println();

        try(DataInputStream it = new DataInputStream(new FileInputStream("myFile"))){
            i = it.readInt();
            System.out.println("The I is " + i);
            d = it.readDouble();
            System.out.println("The D is " + d);
            b = it.readBoolean();
            System.out.println("The B is " + b);
            d = it.readDouble();
            System.out.println("The D is " + d);
        } catch (IOException ex){
            System.out.println("Error");
            ex.printStackTrace();
            return;
        }
    }
}
