package File211014;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo1 {
    public static void main(String args[]) throws IOException {
        //创建数据报套接字并将其绑定到本地主机上的指定端口。
        DatagramSocket socket = new DatagramSocket(9999);
        System.out.println("server is start ,waiting for connect ...");
        /* 从此套接字接收数据报包。当此方法返回时，DatagramPacket 的缓冲区填充了接收的数据。
        数据报包也包含发送方的 IP 地址和发送方机器上的端口号。
        此方法在接收到数据报前一直阻塞。
        数据报包对象的 length 字段包含所接收信息的长度。
        如果信息比包的长度长，该信息将被截短。*/
        byte[] bytes = new byte[1024];
        //构造DatagramPacket用来接收长度为len的数据包
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        //从此套接字接收数据报包。当此方法返回时，DatagramPacket 的缓冲区填充了接收的数据。
        // 数据报包也包含发送方的 IP 地址和发送方机器上的端口号。
        socket.receive(packet);

        //取出数据报包的数据,返回数据缓冲区
        byte[] bytes1 = packet.getData();
        //获取数据报包中的数据的实际长度
        int length = packet.getLength();

        //返回此套接字绑定的本地主机上的端口号。
        System.out.println(socket.getLocalPort());
        //获取要将此包发送到的或发出此数据报的远程主机的 SocketAddress（通常为 IP 地址 + 端口号）。
        System.out.println(packet.getSocketAddress());
        String s = new String(bytes1,0,length);
        System.out.println(packet.getAddress().getHostAddress());
        System.out.println("服务器接收到数据：" + s);
        socket.close();
    }
}
