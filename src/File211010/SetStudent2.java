package File211010;
//wait方法只能由锁对象调用，所以Thread.currentThread().wait();是错误的
public class SetStudent2 extends Thread{
    private Student2 student2;
    public SetStudent2(Student2 student2){
        this.student2 = student2;
    }
    //为了传入同一个student对象实现锁对象的统一
    @Override
    public void run() {
        synchronized(student2){
            while(ThreadDemo2.num > 0) {
                ThreadDemo2.num--;
                if (Student2.flag) {
                    //有资源，线程等待
                    try {
                        //Thread.currentThread().wait();
                        student2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //无资源，设置资源

                    if (ThreadDemo2.num % 2 == 0) {
                    student2.setName("张三");
                    student2.setAge(23);
                } else {
                    student2.setName("李四");
                    student2.setAge(24);
                }
                //Thread.currentThread().notify();是错的

                Student2.flag = true;
                student2.notify();
                //唤醒沉睡的线程,设置标志位为true,有资源


            }

        }
    }
}
