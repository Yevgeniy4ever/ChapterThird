package inpout;

import java.io.*;

/**
 * Created by Yevgeniy on 04.05.2017.
 */
public class CompFiles {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try(FileInputStream firstIn = new FileInputStream("D:\\First.txt");
            FileInputStream secondIn = new FileInputStream("D:\\Second.txt")){
            do{
                    a = firstIn.read();
                    b = secondIn.read();
                    if (a != b) break;

            } while((a != -1) && (b != -1));
            if (a == b)
            System.out.println("Files are equal");
        } catch (IOException ex){
            System.out.println("Error");
        }

    }
}
