package File211008;
//守护线程的实现
public class ThreadDemo3 {
    public static void main(String args[]){
        ThreadTest3 test1 = new ThreadTest3();
        ThreadTest3 test2 = new ThreadTest3();

        test1.setDaemon(true);
        test1.setName("关");
        test2.setDaemon(true);
        test2.setName("张");

        Thread.currentThread().setName("刘");
        test1.start();
        test2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程" + i);
        }
    }
}
