package File211013;
//单例模式-----懒汉式

//构造方法没有返回值
//不能用.equals()判断空，空指针异常
public class DesignTest1 {
    private static DesignTest1 designTest1;
    private DesignTest1(){;
    }

    //用synchronized确保多线程环境下懒汉式的线程安全
    public synchronized static DesignTest1 getDesignTest1(){
        //if(designTest1.equals(""))
        if(designTest1 == null)
            //用的时候再new，延迟思想
            designTest1 = new DesignTest1();
        return designTest1;
    }
}
