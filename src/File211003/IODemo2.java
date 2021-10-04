package File211003;

import java.io.*;
import java.util.ArrayList;
//实现对集合内容的文件转储
public class IODemo2 {
    public static void main(String args[]) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("长孙无忌");
        list.add("公孙乌龙");
        list.add("瞒天过海");
        list.add("天荒地老");

        //FileReader reader = new FileReader("list");
        //错误，list只是列表名称不是文件名，找不到
        FileWriter writer = new FileWriter("list.txt");
        for(String s: list){
            writer.write(s);
            writer.write("\r\n");
            writer.flush();
        }
        writer.close();
    }
}
