package File211002;

import java.io.*;

public class IODemo6 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter((new FileOutputStream("b.txt")));
        outputStreamWriter.write("北风呼呼地吹");
        outputStreamWriter.write("\r\n");

        //包前不包后
        outputStreamWriter.write("根据文件头数据判断文件类型",0,5);
        outputStreamWriter.write("\r\n");

        char[] chars = {'a','b','c','好'};
        outputStreamWriter.write(chars);
        outputStreamWriter.write("\r\n");

        outputStreamWriter.write(chars,3,1);
        outputStreamWriter.write("\r\n");

        outputStreamWriter.flush();
        outputStreamWriter.close();
    }
}
