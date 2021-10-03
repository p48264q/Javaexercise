package File211002;

import java.io.*;

public class IODemo3 {
    public static void main(String[] args) throws IOException {
       BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\sixgod\\Desktop\\JDK1.6中文帮助文档.chw"));
       BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\sixgod\\Desktop\\1.chw"));

       byte[] bytes = new byte[1024*8];//数组大小为8k
       int len = 0;
       while((len = bufferedInputStream.read(bytes))!= -1 ){
           bufferedOutputStream.write(bytes,0,len);
           bufferedOutputStream.flush();
           System.out.println("wait");//每满一次输出一次
       }
       bufferedInputStream.close();
       bufferedOutputStream.close();
    }
}
