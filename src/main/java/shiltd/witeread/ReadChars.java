package shiltd.witeread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Developer on 5/10/2017.
 */
public class ReadChars {
    public static void main(String[] args) throws IOException{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input symbols; ending of writing is dot");

        do{
            c = (char) br.read();
            System.out.println(c);
        } while (c != '.');
    }
}
