package File211007;

public class Test1 {
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.setName("副线程");
        t.start();
        Thread thread = Thread.currentThread();//获取主线程
        thread.setName("主线程1");
        System.out.println(thread.getName());

    }
}
