package shiltd.witeread;

import java.io.*;

/**
 * Created by Developer on 5/10/2017.
 */
public class KtoD {
    public static void main(String[] args) {
        PrintWriter wr = new PrintWriter(System.out, true);

        String str;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        wr.print("End of the line character is \"stop\". ");

        try(FileWriter fw = new FileWriter("D:\\text.txt", true)){
            wr.println("Input your message: ");
            wr.flush();
            do{
                str = reader.readLine();
                if(str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while(!str.equals("stop"));
        } catch(IOException ex){
            wr.println("Error input-output" + ex);
        }
    }
}
