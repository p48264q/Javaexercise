package File211002;

import java.io.*;

public class IODemo11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("newa.txt"));

        int len = 0;
        char[] chars = new char[20];
        while((len = bufferedReader.read(chars))!= -1){
            bufferedWriter.write(chars,0,len);
            //bufferedWriter.write(chars);会补零
            bufferedWriter.flush();
            System.out.println("yes");
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
