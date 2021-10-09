package File211008;

public class ThreadTest3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(this.getName()+i);
        }
    }
}
