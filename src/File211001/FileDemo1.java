package File211001;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String args[]) throws IOException {
        File file1 = new File("newfile1.txt");
        File file2 = new File("./newfile2.txt");
        file1.createNewFile();//在项目文件夹下
        file2.createNewFile();//在项目文件夹下

        File file3 = new File("../newfile3.txt");
        File file4 = new File("../../newfile4.txt");
        file3.createNewFile();//上一级
        file4.createNewFile();//上上一级

        file1.delete();
        file2.delete();
        file3.delete();
        file4.delete();//返回值为布尔值，只能删除空文件夹
    }
}
