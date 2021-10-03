package File211002;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class IODemo7 {
    public static void main(String args[]) throws IOException {
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("c.txt"));
        out.write('大');
        out.write('风');
        out.write('车');
        out.flush();//不刷新无法写入
        out.write('转');
        out.write('转');
        out.write('转');
        out.flush();
    }
}
