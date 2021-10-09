package File211008;
//实现线程休眠，Thread.sleep
public class ThreadDemo2 {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("展示界面");
        Thread.sleep(1000*4);
        System.out.println(("展示结束"));

        ThreadTest2 test2 = new ThreadTest2();
        test2.setName("ThreadTest2线程");
        test2.start();
    }
}
