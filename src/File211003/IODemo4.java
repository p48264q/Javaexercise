package File211003;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
//实现对文件中人名的随机提取
public class IODemo4 {
    public static void main(String args[]) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("name.txt"));
        String s = null;
        while((s = reader.readLine())!= null){
            list.add(s);
            //利用字符缓冲流的独有功能便捷实现按行读取
        }
        Random random = new Random();
        int i = random.nextInt(list.size());
        System.out.println(list.get(i));
    }
}
