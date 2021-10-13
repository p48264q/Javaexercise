package File211013;
//单例模式饿汉式
public class DesignTest2 {
    //创建唯一实例对象，构造私有化
    private static final DesignTest2 designTest2 = new DesignTest2();
    private DesignTest2() {
    }

    //调用方法时返回唯一实例对象
    public static DesignTest2 getDesignTest2(){
        return designTest2;
    }
}
