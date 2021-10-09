package File211009;

import java.util.concurrent.Callable;
/*
* 实现多线程的方式3
* 实现Callable接口，重写call方法，允许传回返回值，
* 有返回值是区别于另外两种实现方法的最本质区别
* 方法中不允许private修饰
* */
public class CallableDemo1 implements Callable {
    private int num;
    public CallableDemo1(int num){
        this.num = num;
    }
    public CallableDemo1(){

    }
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum+=i;
        }
        return sum;
    }
}
