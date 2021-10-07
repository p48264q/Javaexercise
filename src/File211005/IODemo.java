package File211005;

import java.io.*;

//数据输入输出流：特有：可以对基本数据类型进行操作，需要注意的是要注意顺序
public class IODemo {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("Dataos.txt"));
        write(out);
        DataInputStream in = new DataInputStream(new FileInputStream("Dataos.txt"));
        read(in);
    }
    private static void write(DataOutputStream out) throws IOException {
        out.writeInt(12345);
        out.writeByte('a');
        out.writeUTF("天凉好个秋");
        out.writeBytes("bcd");
        //怎么也读不出bcd

    }

    private static void read(DataInputStream in) throws IOException {
        System.out.println(in.readInt());
        System.out.println(in.readByte());
        System.out.println(in.readUTF());
    }
}
