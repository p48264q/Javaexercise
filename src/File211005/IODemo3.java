package File211005;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//ByteArrayInputStream使用,结合FileOutputStream实现了文件形式存储
/*
* ByteArrayOutputStream有toSting()方法
* ByteArrayInputStream没有toString()方法，有read()方法
* */
public class IODemo3 {
    public static void main(String args[]) throws IOException {
        byte[] bytes = "ByteArrayInputStream尝试".getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
//        String s = byteArrayInputStream.toString();
//        System.out.println(s);
        byte[] bytes1 = new byte[1024];//定义的缓冲区大小
        int len = 0;
        FileOutputStream fileOutputStream = new FileOutputStream("ByteArrayInputStream.txt");
        while((len = byteArrayInputStream.read(bytes1)) != -1){
            fileOutputStream.write(bytes1,0,len);
            fileOutputStream.flush();
        }
        fileOutputStream.close();

    }
}
