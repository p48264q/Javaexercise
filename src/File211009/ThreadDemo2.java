package File211009;
//通过同步代码块解决线程安全问题
//cpu性能造成同步代码块只有一个线程运行
public class ThreadDemo2 {
    public static void main(String args[]){
        SynchronizedDemo2 synchronizedDemo2 = new SynchronizedDemo2();

        Thread thread1 = new Thread(synchronizedDemo2);
        Thread thread2 = new Thread(synchronizedDemo2);
        Thread thread3 = new Thread(synchronizedDemo2);
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
