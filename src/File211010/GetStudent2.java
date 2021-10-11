package File211010;

//要留意变量作用范围
/*
* 对于Student2 student2 = student;是同一个对象
* 但是boolean flag = Student2.flag;就不是同一个对象了
* */
public class GetStudent2 extends Thread{
    private Student2 student2;
    public GetStudent2(Student2 student2) {
        this.student2 = student2;
    }

    //boolean flag = Student2.flag;是错误的，这里的flag是一个新的flag
    @Override
    public void run() {
        //用main方法中的student2对象作为锁对象
        synchronized (student2){
         while(ThreadDemo2.num > 0){
             if(Student2.flag){
                 System.out.println(student2.getName() + "====" + student2.getAge());
                 Student2.flag = false;
                 //Thread.currentThread().notify();//标记为true，输出信息修改标记唤醒线程
                 student2.notify();
             }

                 try {
                     student2.wait();
                     //标记为false没有资源，线程等待
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
         }


//            while (ThreadDemo2.num > 0){
//                if(!Student2.flag){
//                    try {
//                        student2.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                //else{
//                    System.out.println(student2.getName() + "====" + student2.getAge());
//                    Student2.flag = false;
//                    student2.notify();
//                //}
//            }
        }
    }
}
