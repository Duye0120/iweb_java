package lesson02;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        ServerSocket server = null;


        try {
            new ServerSocket(9000);
            while(true){

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server!= null){
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
