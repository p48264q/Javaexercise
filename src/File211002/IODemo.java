package File211002;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {
    public static void main(String args[]) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        //字节输出流关联文件不存在会新建，字节输入流关联文件不存在会报错
        fos.write(65);
        fos.write("文本文件测试".getBytes());
        //fos.write(int b);写一个字节，超过一个字节砍掉前面的字节，ascll码表，0-127文件正常，其余乱码
        fos.close();
    }
}
