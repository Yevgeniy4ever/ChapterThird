package shiltd.witeread.homework;

import java.io.*;

/**
 * Created by Yevgeniy on 12.05.2017.
 */
public class CopyTxtFilesSecond {
    String way = "D:\\text.txt";
    String way2 = "D:\\text1.txt";
    int ch;
    PrintWriter pw = new PrintWriter(System.out, true);

    CopyTxtFilesSecond(String name1, String name2){
        way = name1;
        way2 = name2;
    }

    boolean copy() {
        try (BufferedReader f1 = new BufferedReader(new FileReader(way));
             FileWriter f2 = new FileWriter(way2)){
        do{
            ch = f1.read();
            pw.println(ch);
            if (ch == ' ')
                ch = '+';
            f2.write(ch);
        } while (ch != -1);

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            System.out.println("File is not exist");
            return false;
        }  catch (IOException ex){
            System.out.println(ex);
        }  return true;
    }

}

class CopyTextStartSecond{
    public static void main(String[] args) {
        CopyTxtFilesSecond file = new CopyTxtFilesSecond("D:\\text.txt", "D:\\text1.txt");
        file.copy();
    }
}