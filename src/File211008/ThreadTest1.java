package File211008;

public class ThreadTest1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(this.getName() + "==========" + i);
        }
    }
}
