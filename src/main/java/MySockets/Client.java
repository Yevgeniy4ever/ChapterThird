package MySockets;


import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Developer on 4/6/2017.
 */
public class Client {

    public static final int PORT = 19000;
    public static final String HOST = "localhost";

    public static void main(String[] args) {

        Socket socket = null;
        try {
            socket = new Socket(HOST, PORT);

            try (InputStream in = socket.getInputStream();
                 OutputStream out = socket.getOutputStream()) {

                String line = "Hello!";
                out.write(line.getBytes());
                out.flush();


                byte[] data = new byte[32*1024];
                int readBytes = in.read(data);

                System.out.printf("Server> %s", new String(data, 0, readBytes));
            }

        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            IOUtils.closeQuietly(socket);
        }
    }
}
