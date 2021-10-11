package File211011;

//生产线程
public class SetThread extends Thread {
    private Student student;
    int i = 0;

    public SetThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (student) {
                if (student.flag) {
                    //作为生产线程，有资源就等待
                    try {
                        student.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (i % 2 == 0) {
                    student.name = "张三";
                    student.age = 23;
                } else {
                    student.name = "李四";
                    student.age = 24;
                }
                //通知消费消费线程去消费
                student.flag = true; //注意修改标记
                student.notify(); //唤醒之后，线程也可以再次争抢
            }
            i++;
        }
    }
}
