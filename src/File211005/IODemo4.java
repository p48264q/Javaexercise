package File211005;

import java.io.*;
import java.util.ArrayList;

//实现两首歌的合并，采用内存操作流
//内存操作流ByteArrayOutputStream有方法.toByteArray()将内存数据转化为字节数组，直接交给字节流操作
public class IODemo4 {
    public static void main(String[] args) throws IOException {
        //封装两首歌
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\sixgod\\Desktop\\许巍 - 蓝莲花.mp3"));
        FileInputStream fileInputStream1 = new FileInputStream(new File("C:\\Users\\sixgod\\Desktop\\许巍 - 曾经的你.mp3"));

        //将两首歌放在一个集合中
        ArrayList<FileInputStream> arrayList = new ArrayList<>();
        arrayList.add(fileInputStream);
        arrayList.add(fileInputStream1);

        //将两首歌写入内存操作流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        byte[] bytes = new byte[1024*8];//缓存数组大小
        int len = 0;
        //以循环代替多次写入
//        for (int i = 0; i < arrayList.size(); i++) {
//            while((len = arrayList.get(i).read(bytes))!= -1){
//                byteArrayOutputStream.write(bytes,0,len);
//            }
//        }
        while((len = fileInputStream.read(bytes))!= -1){//写入第一首歌
            //出错点fileInputStream.read()，一次读取一个字节，只拖慢了速度
            //最致命的是len=fileInputStream.read()时len等于下一个数据字节，
            // 相当于读取时对每个字节随机乘一个数，轻易到达IDEA设置的1G数据上限
            //出现一个1G的指定名称的垃圾文件
            byteArrayOutputStream.write(bytes,0,len);
        }
        while((len = fileInputStream1.read(bytes))!= -1){//写入第二首歌
            byteArrayOutputStream.write(bytes,0,len);
        }
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\sixgod\\Desktop\\许巍2 in 1.mp3");
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        //妙啊妙啊，内存操作流ByteArrayOutputStream有方法.toByteArray()将内存数据转化为字节数组，直接交给字节流操作
        //ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
    }
}
