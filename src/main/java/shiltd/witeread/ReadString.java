package shiltd.witeread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Developer on 5/10/2017.
 */
public class ReadString {
    public static void main(String[] args) throws IOException {
    String str;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your string");
        do{
            str = reader.readLine();
        } while(!str.equals("stop") || !str.equals("Stop"));
    }
}
