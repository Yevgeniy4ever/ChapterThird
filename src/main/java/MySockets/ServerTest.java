package MySockets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Developer on 4/17/2017.
 */
public class ServerTest {


    void connect() {
        try{
            ServerSocket serSocket = new ServerSocket(1101);
            Socket socket = serSocket.accept();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//            writer.out(new String("Hello"));
            String strIn = reader.readLine();
            OutputStream out = socket.getOutputStream();
            writer.write(new String("Jack"));
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("It is not cool error");
        }
    }

    }
