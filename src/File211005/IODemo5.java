package File211005;

import java.io.*;
import java.util.ArrayList;

//仅使用字节流实现两首歌的合并
public class IODemo5 {
    public static void main(String[] args) throws IOException {
        //字节输入流对象指向源文件
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\sixgod\\Desktop\\许巍 - 蓝莲花.mp3"));
        FileInputStream fileInputStream1 = new FileInputStream(new File("C:\\Users\\sixgod\\Desktop\\许巍 - 曾经的你.mp3"));

        //字节输出流对象指向目的地址
        FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\sixgod\\Desktop\\许巍 - 曾经的你.mp3"));

        //以集合添加两个字节输入流
        ArrayList<FileInputStream> arrayList = new ArrayList<>();
        arrayList.add(fileInputStream);
        arrayList.add(fileInputStream1);

        //自定义数据缓存区
        byte[] bytes = new byte[1024*8];
        int len = 0;
        //循环添加两个字节输出流对象
        for (int i = 0; i < arrayList.size(); i++) {
            while((len = arrayList.get(i).read(bytes))!= -1){
                fileOutputStream.write(bytes,0,len);
                fileOutputStream.flush();
            }
        }
        fileInputStream.close();
        fileInputStream1.close();
        fileOutputStream.close();
    }
}
