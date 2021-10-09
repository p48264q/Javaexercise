package File211008;
//线程礼让Thread.yield();并不能保证一定按顺序执行
public class ThreadDemo4 {
    public static void main(String args[]){
        ThreadTest4 test1 = new ThreadTest4();
        ThreadTest4 test2 = new ThreadTest4();
        ThreadTest4 test3 = new ThreadTest4();

        test1.setName("a");
        test2.setName("b");
        test3.setName("c");
        //test1.setDaemon(true);
        test2.setDaemon(true);
        test3.setDaemon(true);

        test1.start();
        test2.start();
        test3.start();
    }
}
