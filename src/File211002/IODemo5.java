package File211002;

import java.io.*;

//高效字节输入输出流，不指定大小默认8k
public class IODemo5 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\sixgod\\Desktop\\1.png"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\sixgod\\Desktop\\2.png"));

        int len = 0;
        while((len = bufferedInputStream.read() )!= -1){
            bufferedOutputStream.write(len);
            bufferedOutputStream.flush();
            System.out.println("wait");
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}