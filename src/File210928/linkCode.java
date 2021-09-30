package File210928;

public class linkCode {
    public static void main(String[] args) {
        int num = new Student().getStudent(new Student(),200).getNum();
        System.out.println(num);
    }

}
class Student{
    int num = 20;
    public Student getStudent(Student student,int num){
        student.num = num;
        System.out.println("Student class======="+this.num);
        return this;
    }
    public int getNum(){
        System.out.println("getNum ===="+num);
        return num;
    }
}
