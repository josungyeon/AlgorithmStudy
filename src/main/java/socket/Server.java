package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by sungyeon on 2018. 11. 5..
 */
public class Server {
    public static void main(String[] args) {
        try {
            Socket socket = new ServerSocket(9001).accept();
            OutputStream out = socket.getOutputStream();

            out.write("Hello".getBytes());
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
