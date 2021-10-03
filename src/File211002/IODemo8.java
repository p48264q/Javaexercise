package File211002;

import java.io.*;

public class IODemo8 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(new FileInputStream("test.txt"));
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("newtest.txt"));
//        char[] chars = new char[100];
//数组时无法分清汉字几个字符
//        int len = 0;
//        while ((len = in.read(chars))!= -1){
//            out.write(len);
//            out.flush();
 //            out.close();
        int len = 0;
        while ((len = in.read())!= -1){
            out.write(len);
            out.flush();
            in.close();
            out.close();
        }
    }
}
