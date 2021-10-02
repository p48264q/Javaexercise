package File211001;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

//文件过滤实现
//文件名称过滤器
//	public String[] list(FilenameFilter filter)
//	public File[] listFiles(FilenameFilter filter)
public class FileDemo5 {
    public static void main(String[] args) {
        File File = new File("C:\\Users\\sixgod\\Desktop\\主文件夹\\学习\\笔记\\Git");
        String[] str = File.list(new FilenameFilter() {
            @Override
            public boolean accept(java.io.File dir, String name) {
                //java.io.File dir 是封装的File文件的文件全路径，而不是File下面的文件路径
                //name是File封装文件夹下的文件名
                File file1 = new File(dir,name);//利用File的构造方法封装具体文件
                System.out.println(dir);
                System.out.println(file1);
                System.out.println(name);
                if(dir.isFile())
                    System.out.println("dir is file");
                //java.io.File dir不是文件，是一系列文件夹
                if(file1.isFile())
                    System.out.println("file1 is file");
                //file1 才是文件
                if(name.endsWith(".txt") && file1.isFile())
                    return true;
                else
                return false;
            }
        });
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println(Arrays.toString(str));
    }
}
