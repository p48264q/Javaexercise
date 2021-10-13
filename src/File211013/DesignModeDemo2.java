package File211013;

public class DesignModeDemo2 {
    public static void main(String[] args) {
        //饿汉式不能通过new方法取得实例对象，只能通过get方法取得
        // DesignTest2 designTest2 = new DesignTest2();
        DesignTest2 designTest2 = DesignTest2.getDesignTest2();
        DesignTest2 designTest21 = DesignTest2.getDesignTest2();

        //验证只有一个对象
        System.out.println(designTest21 == designTest2);
    }
}
