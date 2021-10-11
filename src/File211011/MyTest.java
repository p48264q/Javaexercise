package File211011;

public class MyTest {
    public static void main(String[] args) {
        /*
         *  要的效果是生产一个消费一个
         *  生产者：如果没有资源，就生产，如果有资源，就等着不生产，还得通知消费线程去消费
         *  消费者:如果有资源，就消费，如果没有资源就等着，还得通知生产线程去生产。
         *
         *
         *void notify()
          唤醒在此对象监视器上等待的单个线程。
        void notifyAll()
          唤醒在此对象监视器上等待的所有线程。

         *
         * wait()
          在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
        void wait(long timeout)
          在其他线程调用此对象的 notify() 方法或 notifyAll() 方法，或者超过指定的时间量前，导致当前线程等待。
        void wait(long timeout, int nanos)
          在其他线程调用此对象的 notify() 方法或 notifyAll() 方法，或者其他某个线程中断当前线程，或者已超过某个实际时间量前，导致当前线程等待。
         * */
        Student student = new Student();
        SetThread th1 = new SetThread(student);
        GetThread th2 = new GetThread(student);
        th1.start();
        th2.start();

    }
}
