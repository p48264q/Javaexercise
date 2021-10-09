package File211007;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

//多个流文件的合并
/*运行前提：有f1，f2，f3封装的文件
* sequenceInputStream.read(bytes)对应fileOutputStream.write(bytes,0,len)
* */
public class IODemo3 {
    public static void main(String args[]) throws IOException {
        //封装输入对象
        FileInputStream f1 = new FileInputStream("list.txt");
        FileInputStream f2 = new FileInputStream("list.txt");
        FileInputStream f3 = new FileInputStream(".gitignore.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("allin.txt");

        //用Vector封装
        Vector<FileInputStream> vector = new Vector<>();
        vector.addElement(f1);
        vector.addElement(f2);
        vector.addElement(f3);

        //返回vector的枚举对象
        Enumeration<FileInputStream> elements = vector.elements();
        SequenceInputStream sequenceInputStream = new SequenceInputStream(elements);
        byte[] bytes = new byte[1024];
        int len = 0;
        //以自己设定的bytes大小为缓冲区读取内容
        while((len = sequenceInputStream.read(bytes))!= -1){
            //搭配下一行则必须是sequenceInputStream.read(bytes)，否则全是乱码
            fileOutputStream.write(bytes,0,len);
            fileOutputStream.flush();
        }
        sequenceInputStream.close();
        fileOutputStream.close();
    }
}
