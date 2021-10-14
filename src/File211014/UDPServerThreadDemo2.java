package File211014;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerThreadDemo2 {
    public static void main(String args[]) throws IOException {
        DatagramSocket socket = new DatagramSocket(8848);
        while(true){
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length);
            socket.receive(packet);
            byte[] bytes1 = packet.getData();
            int l = packet.getLength();
            //String s = new String(bytes1,0, packet.getLength());
            //String s = bytes1.toString();字节数组不能以toString方法转字符串
            String s = new String(bytes1,0,l);
            if(s.equals("886")){
                System.out.println(s);
                break;
            }else {
                System.out.println(s);
            }
        }
        socket.close();
    }
}
