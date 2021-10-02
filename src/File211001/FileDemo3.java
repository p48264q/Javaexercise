package File211001;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

//实现文件过滤功能

//文件名称过滤器
//	public String[] list(FilenameFilter filter)
//	public File[] listFiles(FilenameFilter filter)
public class FileDemo3 {
    public static void main(String args[]){
        File file = new File("C:\\Users\\sixgod\\Desktop\\主文件夹\\学习\\笔记\\Git");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file1 = new File(dir,name);
                if(file1.isFile()&&name.endsWith(".txt")){
                    return true;
                }
                return false;
            }
        });
        System.out.println(Arrays.toString(files));
    }
}
