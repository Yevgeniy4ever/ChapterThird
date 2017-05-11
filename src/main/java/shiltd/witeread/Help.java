package shiltd.witeread;

import java.io.*;

/**
 * Created by Developer on 5/11/2017.
 */
public class Help {
    String helpfile;
    PrintWriter writer = new PrintWriter(System.out, true);

    public Help(String fname){
        helpfile = fname;
    }

    boolean helpon(String what){
        int ch;
        String topic, info;

        try(BufferedReader reader = new BufferedReader(new FileReader(helpfile))){
            do {
                ch = reader.read();
                if ( ch == '#') {
                    topic = reader.readLine();
                    if (what.compareTo(topic) == 0) {
                        do{
                            info = reader.readLine();
                            writer.println(info);
                        } while ((info != null)
                                && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while(ch != -1);
        } catch (IOException ex) {
            System.out.println("Error" + ex);
        }
        return false;
    }

    String getSelection(){
        String topic = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        writer.println("Input your topic:");
        try{
            topic = reader.readLine();
        } catch (IOException ex){
            writer.println("Error" + ex);
        }
        return topic;
    }




}
