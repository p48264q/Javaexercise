package File211004;

import java.io.File;

//测试listFile遇到文件的显示
public class IODemo2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sixgod\\Desktop\\test1");
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
