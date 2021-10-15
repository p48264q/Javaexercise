package File211014;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPServer1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8848);
        Socket accept = serverSocket.accept();

        byte[] bytes = new byte[1024];
        InputStream inputStream = accept.getInputStream();
        int len = inputStream.read(bytes);
        String s = new String(bytes,0,len);
        System.out.println(s);

        //客户端反馈
        OutputStream os = accept.getOutputStream();
        os.write("消息收到".getBytes(StandardCharsets.UTF_8));

        serverSocket.close();

    }
}
