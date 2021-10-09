package File211008;
//通过设置优先级实现多线程优先级体现
public class ThreadDemo1 {
    public static void main(String args[]){
        ThreadTest1 test1 = new ThreadTest1();
        ThreadTest1 test2 = new ThreadTest1();

        test1.setPriority(Thread.MAX_PRIORITY);
        test2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(test1.getName());
        System.out.println(test2.getName());
        test1.start();
        test2.start();
    }
}
