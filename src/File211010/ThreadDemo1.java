package File211010;
//死锁再现
/*
*在多线程实现Runnable的子类中有
*  static Object o1 = new Object();
   static Object o2 = new Object();
*  多次new对象时锁对象o1和o2是相同的，并不会因为创建新的对象而出现新的Object对象
* 所以也可以实现死锁
* */
public class ThreadDemo1 {
    public static void main(String args[]){
        SynchronizedDemo1 synchronizedDemo1 = new SynchronizedDemo1(false);
        SynchronizedDemo1 synchronizedDemo2 = new SynchronizedDemo1(true);


        Thread thread1 = new Thread(synchronizedDemo2);
        Thread thread2 = new Thread(synchronizedDemo1);

        thread1.start();
        thread2.start();
    }
}
