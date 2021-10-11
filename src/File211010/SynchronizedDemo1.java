package File211010;

public class SynchronizedDemo1 implements Runnable {

    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean a = true;
    public SynchronizedDemo1(boolean b) {
        a = b;
    }

    @Override
    public void run() {
        System.out.println(o1.hashCode());
        if(a){
            synchronized(o1){
                System.out.println("if is true 从o1进入");
                synchronized (o2){
                    System.out.println("if is true 从o2进入");
                }
            }
        }
        else{
            synchronized (o2){
                System.out.println("if is false 从o2进入");
                synchronized (o1){
                    System.out.println("if is false 从o1进入");
                }
            }
        }
    }
}
