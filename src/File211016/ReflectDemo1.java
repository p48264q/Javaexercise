package File211016;

import java.lang.reflect.Field;

//反射小用例，实现反射取变量，方法
//class.forName( )方法中一定要填写完整类名（即包名+类名），
// 即便该类与调用forName方法的类在同一包下，也需填写完整类名！而不是全路径名
//取消私有权限语法检查
//        name.setAccessible(true);
public class ReflectDemo1 {

    public static void main(String args[]) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        //通过反射操作成员变量
        Class<?> aClass = Class.forName("File211016.Student1");
        //获取字段对象，可以是私有的
        Field name = aClass.getDeclaredField("name");
        Object o = aClass.newInstance();
        //取消私有权限语法检查
        name.setAccessible(true);
        name.set(o,"张三");
        Object o1 = name.get(o);
        System.out.println((String) o1);


        System.out.println("===============");

        Class<?> aClass1 = Class.forName("File211016.Student1");
        Field age = aClass.getDeclaredField("age");

        age.setAccessible(true);

        Object o2 = aClass1.newInstance();
        age.set(o2,24);

        int anInt = age.getInt(o2);
        System.out.println(anInt);


    }
}
