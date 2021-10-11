package File211011;

//消费线程
public class GetThread extends Thread {
    private Student student;

    public GetThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (student) {
                if (!student.flag) {
                    //消费线程，如果没有资源，就等待
                    try {
                        // 在调用Wait方法之前，线程必须获得该对象的对象级别锁，
                        // 即只能在同步方法或同步块中调用Wait 方法。
                        //wait()方法导致当前线程处于等待状态，直到被另一个线程，调用notify()来唤醒。

                        student.wait(); //线程一旦等待，就会释放锁，下次如果被唤醒了，就从这里醒来
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //消费资源
                System.out.println(student.name + "====" + student.age);
                //通知生产线程，去生产
                student.flag = false;
                //Notify()需要在同步方法或同步块中调用，即在调用前，线程也必须获得该对象的对象级别锁
                student.notify();
            }
        }
    }
}
