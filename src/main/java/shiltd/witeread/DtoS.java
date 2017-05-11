package shiltd.witeread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Developer on 5/10/2017.
 */
public class DtoS {
    public static void main(String[] args) {
        String str;
        PrintWriter pw = new PrintWriter(System.out, true);
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\text.txt"))){
            while((str = br.readLine()) != null){
                pw.println(str);
                pw.flush();
            }
        } catch (IOException ex){
            pw.println("Error" + ex);
        }
    }
}
