package File210928;

public class InnerClass {
    public static void main(String args[]){
        Outer.Inner innerClass = new Outer().new Inner();
        innerClass.innerShow();
    }
}
class Outer{
    class Inner{
        public void innerShow(){
            System.out.println("this is innerShow.");
        }
    public void outerShow(){
        System.out.println("this is outerShow.");
        }
    }

}
