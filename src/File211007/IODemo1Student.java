package File211007;

import java.io.Serializable;

public class IODemo1Student implements Serializable {
    static final long serialVersionUID = 42L;
    public IODemo1Student() {
    }

    public IODemo1Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
