package File211002;

import java.io.*;

public class IODemo9 {
    public static void main(String args[]){
        InputStreamReader reader = null;
        OutputStreamWriter writer = null;
        try {
            reader = new InputStreamReader(new FileInputStream("c.txt"));
            writer = new OutputStreamWriter(new FileOutputStream("newc.txt"));
            char[] chars = new char[2000];
            int len = 0;
            while((len = reader.read(chars))!= -1){
                writer.write(chars,0,len);
                writer.flush();
                System.out.println("copy");
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(reader != null)
                    reader.close();
                if(writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
