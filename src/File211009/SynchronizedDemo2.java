package File211009;

public class SynchronizedDemo2 implements Runnable{
    static int tackets = 5000;
    static Object obj = new Object();
    @Override
    public void run() {

        synchronized(obj){
            while (tackets > 0){

//                if(tackets > 0){
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    //System.out.println(Thread.currentThread().getName() + "==sell==" + tackets--);
                    System.out.println(Thread.currentThread().getName() + "：正在售卖" + (tackets--) + "张票");
//                }



            }
        }
    }
}
