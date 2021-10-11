package File211010;
//实现严格交替输出
/*
* wait方法只能由锁对象调用，Thread.currentThread().wait();是错误的
*
* getStudent2.start();
  setStudent2.start();可以运行，反之不行
* */
public class ThreadDemo2 {
    //设定循环次数
    static int num = 1000;
    public static void main(String args[]){
        //创建唯一共享对象
        Student2 student2 = new Student2();



        GetStudent2 getStudent2 = new GetStudent2(student2);
        SetStudent2 setStudent2 = new SetStudent2(student2);

        getStudent2.start();
        setStudent2.start();



    }
}
