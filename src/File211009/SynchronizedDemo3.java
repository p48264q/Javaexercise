package File211009;

public class SynchronizedDemo3 implements Runnable{
    static int tickets = 100;

    @Override
    public void run() {
        sellTeckets();
    }

    public synchronized void sellTeckets(){
        while(tickets > 0)
            System.out.println(Thread.currentThread().getName() + "sell" + (tickets--));
    }
}
