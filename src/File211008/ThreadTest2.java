package File211008;

public class ThreadTest2 extends Thread{
    @Override
    public void run() {
        Thread thread = currentThread();
        thread.setName("副页面");
        try {
            Thread.sleep(1000*3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + "=======" + i);
        }
    }
}
