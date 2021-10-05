package File211004;

import java.io.*;

//实现复制多层目录文件夹
//对文件进行读写操作时，要封装到具体文件位置，封装对象可以不存在
//File可以通过构造方法拼接新地址，FileOutputStream不可以

//运行前提:main函数中file1封装对象需要存在，需要是一个文件夹，可多层可单层

public class IODemo1 {
    public static void main(String args[]) throws IOException {
        File file1 = new File("C:\\Users\\sixgod\\Desktop\\1");//源文件夹
        File file2 = new File("C:\\Users\\sixgod\\Desktop\\new1");//目标文件夹

        boolean b = file2.mkdir();
        if(!b)
            System.out.println("创建文件夹失败1");
        CopyFolders(file1,file2);
    }
    private static void CopyFolders(File file1,File file2) throws IOException {//file1源地址，file2目标地址
        File[] files = file1.listFiles();//获取源文件内的下一级目录（文件及文件夹）
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {//若是文件，复制
                    CopyFild(files[i], file2);
                } else if (files[i].isDirectory()) {
                    //若是文件夹，mkdir
                    File file = new File(file2, files[i].getName());//拼接新地址
                    System.out.println(files[i]);
                    System.out.println(file);
                    boolean b = file.mkdir();
                    if (!b)
                        System.out.println("文件创建失败2");
                    CopyFolders(files[i], file);
                    //对文件夹再次递归
                }
            }
        }

    private static void CopyFild(File file1,File file2) throws IOException {
        FileInputStream inputStream = new FileInputStream(file1);
        File file = new File(file2,file1.getName());
        FileOutputStream outputStream = new FileOutputStream(file);
        //暂定：file2只到了文件夹层，再下一层+file1.getname()
        //FileOutputStream outputStream = new FileOutputStream(file2,file1.getName());

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes))!= -1){
            outputStream.write(bytes,0,len);
            outputStream.flush();
        }
        inputStream.close();
        outputStream.close();
    }
}
