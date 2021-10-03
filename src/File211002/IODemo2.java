package File211002;

import java.io.*;

public class IODemo2 {
    public static void main(String args[]) throws IOException {
        FileInputStream fis = new FileInputStream("b.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("bb.txt");
        int by = 0;
        while((by = fis.read())!= -1){
            fileOutputStream.write(by);
            System.out.println((char) by);
        }

        fis.close();
        fileOutputStream.close();
    }
}
