package File211011;


public class GetStudent1 extends Thread{
    StudentDemo1 studentDemo1;
    public GetStudent1(StudentDemo1 studentDemo1){
        this.studentDemo1 = studentDemo1;
    }

    @Override
    public void run() {
        synchronized (studentDemo1) {
            //若存在资源，提取，改变标志位
            while (StudentDemo1.num > 0){

                if (StudentDemo1.flag == true) {
                    System.out.println(studentDemo1.name + "=====" + studentDemo1.age+"--------"+StudentDemo1.num);
                    StudentDemo1.flag = false;
                    StudentDemo1.num--;
                    studentDemo1.notify();
                } else {//不存在资源，等待，让set线程制造资源
                    try {
                        studentDemo1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
