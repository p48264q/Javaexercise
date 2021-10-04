package File211003;

import java.io.*;

//一次读取一行，读取不到返回null
//String s = reader.readLine()
//writer.newLine();//写入换行符，具有平台兼容性
public class IODemo1 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("b.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("newb.txt"));
        String s =null;
        while((s = reader.readLine() )!= null){
            System.out.println(s);
            writer.write(s);
            writer.newLine();
            writer.flush();
        }
        reader.close();
        writer.close();
    }
}
