package File211007;

import java.io.*;

//序列化与反序列化操作
//序列化流:ObjectOutputStream   反序列化流:ObjectInputStream
//操作的是对象
public class IODemo1 {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        //write("张三",18);
        read();
//当读写不同时时，写完运行修改再读会报错序列化ID不一致；可以给定序列化ID
    }

    public static void write(String name,int age) throws IOException {

        //给对象赋值
        IODemo1Student ioDemo1Student = new IODemo1Student();
        ioDemo1Student.setAge(age);
        ioDemo1Student.setName(name);

        //创建序列化流,关联文件
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.txt"));
        //以序列化流写对象
        outputStream.writeObject(ioDemo1Student);
        outputStream.close();
    }
/*
* 不通过传入对象的有参方式来读取，通过反序列化流读取写入文件的信息
* */
    public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("student.txt"));
        IODemo1Student ioDemo1Student = (IODemo1Student) inputStream.readObject();
        System.out.println(ioDemo1Student.getName() + "----" + ioDemo1Student.getAge());
    }
}
