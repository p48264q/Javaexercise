package File211014;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

//实现TCP通信简单用例
public class TCPClient1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("172.42.16.20", 8848);
        OutputStream outputStream = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        outputStream.write("你好server，client来了".getBytes(StandardCharsets.UTF_8));

        InputStream inputStream = socket.getInputStream();
        int len = inputStream.read(bytes);
        String string = new String(bytes,0,len);
        System.out.println(string);

        socket.close();

    }
}
