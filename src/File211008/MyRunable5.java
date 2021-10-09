package File211008;

public class MyRunable5 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"===="+i);
            //Runnable接口没有getName方法，所以不能直接用getName方法
        }
    }
}
