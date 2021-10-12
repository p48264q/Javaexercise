package File211012;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


/*
* 利用实现查找两个可读文件中的重复单词，可去除文件中的空行，空格对查找的影响
* 首先要求桌面有1.txt and 2.txt两个文件
*
* */
public class ThreadDemo1 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\sixgod\\Desktop\\1.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\sixgod\\Desktop\\2.txt"));

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();


        Read(reader1,list1);
        Trim(list1);

        Read(reader2,list2);
        Trim(list2);

        Compare(list1,list2);

        Iterator<String> iterator = list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        reader1.close();
        reader2.close();
    }

    public static void Read(BufferedReader reader,ArrayList list) throws IOException {
        //将两个文件按行读入，以空格分隔，循环添加进集合，得到没有空格的单词,集合会将空行当作元素存起来
        String s = null;
        while ((s= reader.readLine())!= null){
            String[] s1 = s.split(" ");
            for (int i = 0; i < s1.length; i++) {
                list.add(s1[i]);
            }
        }
//        list1.add("");
//        list1.add(null);
//        list1.add("null");
//        list1.add("add");
//""，null，“null”不同，""是空字符串，null是空，"null"是字符串，但是String类中null和"null"有个大坑
    }

    public static void Trim(ArrayList list){
        //去除空串，注意不能去除null,例如若list.add(null);后isEmpty()方法会报空指针异常
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().isEmpty())
                iterator.remove();
        }
    }

    public static void Compare(ArrayList list1,ArrayList list2){
        //取两集合交集放在list1中,有交集返回true
        list1.retainAll(list2);
    }
}
