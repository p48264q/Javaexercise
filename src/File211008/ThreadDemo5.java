package File211008;
//通过实现Runnable接口实现多线程
/*
* 新建类实现Runnable接口，同时重写run方法
* main方法中创建Thread方法，同时创建新建类的子类对象
* 将新建类的子类作为参数传入Thread方法的参数列表
* 调用start方法开启线程
* */
public class ThreadDemo5 {
    public static void main(String args[]){
        MyRunable5 runable1 = new MyRunable5();
        MyRunable5 runable2 = new MyRunable5();

        Thread thread = new Thread(runable1);
        Thread thread1 = new Thread(runable2);

        thread.setName("线程1");
        thread1.setName("线程2");
        thread.start();
        thread1.start();
    }
}
