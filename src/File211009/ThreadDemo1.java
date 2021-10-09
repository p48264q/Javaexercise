package File211009;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/*
* 实现多线程的方式三
* 实现Callable接口，重写call方法
* main方法中创建Callable子类的对象，创建FutureTask对象并将Callable子类对象当作参数传入
* 新建Thread对象并传入FutureTask子类对象
* 开启线程
* 可以用FutureTask对象.get()方法获取线程返回信息
* */
public class ThreadDemo1 {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        CallableDemo1 callableDemo1 = new CallableDemo1(100);
        FutureTask futureTask = new FutureTask(callableDemo1);
        Thread thread = new Thread(futureTask);
        thread.start();
        int o = (int)futureTask.get();
        System.out.println(o);
    }
}
