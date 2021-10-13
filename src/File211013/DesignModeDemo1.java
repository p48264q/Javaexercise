package File211013;
//单例模式---懒汉式
public class DesignModeDemo1 {
    public static  void main(String args[]){
        DesignTest1 designTest1 = DesignTest1.getDesignTest1();
        DesignTest1 designTest2 = DesignTest1.getDesignTest1();

        //验证单例模式只产生了一个对象
        System.out.println(designTest1 == designTest2);
    }
}
