package shiltd.witeread;

import java.io.PrintWriter;

/**
 * Created by Developer on 5/11/2017.
 */
public class FileHelp {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        Help helpObject = new Help("D:\\helptext.txt");
        String topic;

        pw.println("For exit from help write stop. \n Input topics name:");

        do{
            topic = helpObject.getSelection();

            if(!helpObject.helpon(topic))
                pw.println("Topic is not founded");
        } while (topic.compareTo("stop") != 0);


    }
}
