package File211002;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IODemo10 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("a.txt");
        FileWriter writer = new FileWriter("newa.txt");
         char[] chars = new char[10];
         int len = 0;
         while ((len = reader.read(chars))!= -1){
             writer.write(chars,0,len);
             writer.flush();
             System.out.println("write+1");
         }
         reader.close();
         writer.close();
    }
}
