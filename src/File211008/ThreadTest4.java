package File211008;

public class ThreadTest4 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Thread.yield();
            System.out.println(this.getName() + "====" + i);
        }
    }
}
