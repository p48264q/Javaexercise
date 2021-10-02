package File211001;

import java.io.File;
import java.io.FileFilter;

//文件过滤实现
//文件名称过滤器
//	public String[] list(FilenameFilter filter)
//	public File[] listFiles(FilenameFilter filter)
public class FileDemo4 {
    public static void main(String args[]){
        File file1 = new File("C:\\Users\\sixgod\\Desktop\\主文件夹\\学习\\笔记\\Git");
        File[] files = file1.listFiles(new FileFilter() {
            //以匿名内部类形式交给FileFilter处理
            @Override
            public boolean accept(File pathname) {
                //不同于FilenameFilter过滤出来的是文件夹全路径名dir和文件夹下文件路径名name
                //FileFilter给出的是所封装的文件夹下的文件全路径名pathname
                //所以较之FilenameFilter而言FileFilter不需要以构造方法再次封装判断文件
                System.out.println(pathname);
                String name = pathname.getName();//获取文件名
                if(pathname.isFile()&&name.endsWith(".txt")){
                    //判断是否为文件同时后缀为.txt
                    //满足条件会把文件过滤到files文件数组中
                    return true;
                }
                else
                return false;
            }
        });
        for (int i = 0; i < files.length; i++) {//循环输出
            System.out.println(files[i]);
        }
    }
}
