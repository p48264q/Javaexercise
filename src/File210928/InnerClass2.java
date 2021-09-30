package File210928;

public class InnerClass2 {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.innerShow();
    }
}
class OuterClass{
    static class InnerClass{//静态内部类
        public void innerShow(){
            System.out.println("this is InnerClass");
        }
    public void outerShow(){
        System.out.println("this is OuterClass");
        }
    }
}
