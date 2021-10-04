package File211003;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IODemo3 {
    public static void main(String args[]) throws IOException {
//        FileReader reader = new FileReader("list.txt");
//        reader.read();
        //用字符流不能便捷地实现按行读取

        BufferedReader reader = new BufferedReader(new FileReader("list.txt"));
        ArrayList<String> arrayList = new ArrayList<>();
        String s = null;
        while((s = reader.readLine())!= null){
            arrayList.add(s);
        }
        reader.close();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList);
    }
}
