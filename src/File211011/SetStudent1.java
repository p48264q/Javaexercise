package File211011;

public class SetStudent1 extends Thread{
    StudentDemo1 student;
    public SetStudent1(StudentDemo1 student) {
        this.student = student;
    }

    @Override
    public void run() {
        synchronized (student) {
            while (StudentDemo1.num > 0) {
                if (StudentDemo1.flag)//true是存在资源,存在资源就等待
                {
                    try {
                        student.wait();//不清楚这里的锁对象是不是student
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {//没有资源就根据条件设置资源
                    if (StudentDemo1.num % 2 == 0) {
                        student.age = 23;
                        student.name = "张三";
                    } else {
                        student.name = "李四";
                        student.age = 24;
                    }
                    //设置资源后更改状态标签，唤醒Get线程

                    StudentDemo1.flag = true;
                    student.notify();
                }
                //StudentDemo1.num--;若放在这里，每次都会减少，跳着执行
            }
        }
    }
}
