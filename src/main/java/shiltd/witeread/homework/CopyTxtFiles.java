package shiltd.witeread.homework;

import java.io.*;

/**
 * Created by Yevgeniy on 12.05.2017.
 */
public class CopyTxtFiles {
    String way = "D:\\text.txt";
    String way2 = "D:\\text1.txt";
    FileInputStream f1;
    FileOutputStream f2;
    byte b;
    byte data[] = new byte[10];
    PrintWriter pw = new PrintWriter(System.out, true);

    CopyTxtFiles(String name1, String name2){
        way = name1;
        way2 = name2;
    }

    boolean copy() {
        try {
            f1 = new FileInputStream(way);
            f2 = new FileOutputStream(way2);
        do{
            b = (byte) f1.read();
            pw.println(b);
            if (b == (byte) ' ')
                b = (byte) '+';
            f2.write(b);
        } while (b != -1);

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            System.out.println("File is not exist");
            return false;
        }  catch (IOException ex){
            System.out.println(ex);
        }
        finally {

            try {
                f1.close();
                f2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } return true;
    }
}

class CopyTextStart{
    public static void main(String[] args) {
        CopyTxtFiles file = new CopyTxtFiles("D:\\text.txt", "D:\\text1.txt");
        file.copy();
    }
}
