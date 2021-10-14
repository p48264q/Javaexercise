package File211014;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClientDemo1 {
    public static void main(String args[]) throws IOException {
        //构建数据报套接字
        DatagramSocket socket = new DatagramSocket();

        //构建数据报包，将指定长度的包发送到指定主机指定端口
        String str = new String("Hello UDP, I am coming!!!");
        byte[] bytes = new byte[1024];
        bytes = str.getBytes();
        /* DatagramPacket( byte[] buf, int length, InetAddress address,int port)
        构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。*/
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("MSI"),9999);

        //从此套接字发送数据报包
        socket.send(packet);
        socket.close();
    }
}
