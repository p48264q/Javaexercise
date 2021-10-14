package File211014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
//实现UDP多次对话，输入886退出程序
public class UDPClientThreadDemo2{
    public static void main(String args[]) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true){

            System.out.println("请输入要传输的信息");
            //while ((len = bufferedReader.read())!= -1
            String s = bufferedReader.readLine();
            byte[] bytes = s.getBytes();

            DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length, InetAddress.getByName("MSI"),8848);
            socket.send(packet);
            if("886".equals(s)){
                break;
            }
        }
        socket.close();
    }
}
