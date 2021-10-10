package File211009;
//同步方法使用锁对象的例子
//同步代码块使用的锁对象是任意的Java对象
//方法上加了synchronized 就成为了一个同步方法，同步方法使用的锁对象this
//静态同步方法使用的锁对象是，当前类的字节码文件对象
public class ThreadDemo3 {
    public static void main(String args[]){
        SynchronizedDemo3 synchronizedDemo3 = new SynchronizedDemo3();

        Thread thread1 = new Thread(synchronizedDemo3,"1");
        Thread thread2 = new Thread(synchronizedDemo3,"2");

        thread1.start();
        thread2.start();

    }
}
