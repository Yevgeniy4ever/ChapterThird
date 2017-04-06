package MySockets;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Developer on 4/6/2017.
 */
public class Server {

    static final int HOST = 19000;

    public static void main(String[] args) {
        ServerSocket sSocket = null;
        try {
            sSocket = new ServerSocket(HOST);
            Socket socket = sSocket.accept();
            try(InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream()){

                String send = "How are you?";
                out.write(send.getBytes());
                out.flush();

                byte[] data = new byte[32*1024];
                int readBytes = in.read(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(sSocket);
        }
    }
}
