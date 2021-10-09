package File211007;

public class Thread1 extends Thread{
    @Override
    public void run() {
        Thread thread = currentThread();
        //thread.setName("2线程");
        System.out.println(thread.getName());
    }
}
