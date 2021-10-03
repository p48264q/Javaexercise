package File211002;

import java.io.*;

public class IODemo4 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\sixgod\\Desktop\\1.txt"));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\sixgod\\Desktop\\2.txt"));
        byte[] bytes = new byte[1024 * 8];
        int len = 0;
        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0, len);
            out.flush();
            System.out.println("正在复制...");
        }
        in.close();
        out.close();
    }
}
