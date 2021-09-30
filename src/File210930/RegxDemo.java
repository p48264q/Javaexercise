package File210930;

public class RegxDemo {
    public static void main(String args[]){
        String str = "abc=====122255ccc====377ddd";
        String regx = "[=0-9]+c";//实现=与数字的不限制大于0次连续后跟一个c的匹配
        String s = str.replaceAll(regx,"and");
        System.out.println(s);
        regx = "[=0-9c]+";//实现=与数字与c的无序大于0次连续匹配
        s = str.replaceAll(regx,"and");
        System.out.println(s);
    }
}
