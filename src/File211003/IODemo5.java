package File211003;

import javax.swing.text.Document;
import java.io.*;

//实现单层文件夹的复制
/*
* 遇到的问题有：路径拼接过程中错误拼接，将两个绝对路径拼接
* 字符串方法路径拼接过程中忘记“\\”造成路径异常
* 流只能对文件进行操作，不能对文件夹操作，只能手动生成文件夹
* file.getName()获取的是当前文件名
* */

public class IODemo5 {
    public static void main(String args[]) throws IOException {
        File file1 = new File("C:\\Users\\sixgod\\Desktop\\11");
        File file2 = new File("C:\\Users\\sixgod\\Desktop\\new11");
        if(!file2.exists()){//file2不存在时创建文件夹
            file2.mkdirs();
        }
        CopyFolder(file1,file2);
    }

    //拷贝文件夹内容
    private static void CopyFolder(File file1,File file2) throws IOException {
        //file1是源文件夹地址，file2是目标文件夹地址
        File[] files = file1.listFiles();
        //files是源文件夹中文件列表,全路径名
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            //file是源文件夹内文件的全路径名的封装对象
            CopyFile(file,file2);
            //实现文件的复制
        }
    }

    //拷贝具体文件
    private static void CopyFile(File file,File file2) throws IOException {
        //file是源文件的全路径名称
        //file2是目标文件的上层文件夹名称
        FileInputStream fileInputStream = new FileInputStream(file);
        String str = file2.getAbsolutePath() +"\\"+ file.getName();
        //拼接路径时忘了\\
        FileOutputStream fileOutputStream = new FileOutputStream(str);

        byte[] b = new byte[10];
        int len = 0;
        while((len = fileInputStream.read(b))!= -1){
            fileOutputStream.write(b);
            fileOutputStream.flush();
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
