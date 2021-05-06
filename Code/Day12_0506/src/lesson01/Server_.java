package lesson01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_ {
    public static void main(String[] args) {
        try {
            //指定端口号:,IP地址就是部署那台服务器的IP地址
            ServerSocket server = new ServerSocket(9000);// 构建了服务端实例
            Socket socket = null;

            // 监听请求,根据端口号
            try {
                socket = server.accept();// 是Java对客户端的封装
                System.out.println("接受到请求");

                // 请求的内容都封装在socket实例中
                InputStream in = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                String line = null;
                while(!"".equals(line= reader.readLine())){
                    System.out.println(line);
                }

                // 返回数据
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (socket!= null&& !socket.isClosed()){
                    socket.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
