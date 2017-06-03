/*
package MySockets;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

*/
/**
 * Created by Developer on 4/6/2017.
 *//*

public class Server {

    static final int PORT = 19000;

    public static void main(String[] args) {
        ServerSocket sSocket = null;
        try {
            sSocket = new ServerSocket(PORT);

            System.out.println("Started, waiting for connection");

            Socket socket = sSocket.accept();

            System.out.println("Accepted. " + socket.getInetAddress() + " getPort() "
                    + socket.getPort()+ " getLocalPort() " + socket.getLocalPort());

            Thread thread = new Thread();


            thread.start();

            try(InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream()){

                String send = "How are you?";
                out.write(send.getBytes());
                out.flush();

                byte[] data = new byte[32*1024];
                int readBytes = in.read(data);

                System.out.println("data: " + data + " readBytes: " + data + "\n");

                System.out.println(new String(data, 0, readBytes));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(sSocket);
        }


    }
}

    class ClientConnected implements Runnable{

        @Override
        public void run(Socket socket) throws IOException {

            try(InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream()){

                String send = "How are you?";
                out.write(send.getBytes());
                out.flush();

                byte[] data = new byte[32*1024];
                int readBytes = in.read(data);

                System.out.println("data: " + data + " readBytes: " + data + "\n");

                System.out.println(new String(data, 0, readBytes));
            }

        }

        @Override
        public void run() {

        }
    }*/
