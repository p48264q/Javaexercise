package File211011;


public class ThreadDemo1 {
    public static void main(String[] args) {
        StudentDemo1 student = new StudentDemo1();

        SetStudent1 setStudent1 = new SetStudent1(student);
        GetStudent1 getStudent1 = new GetStudent1(student);

        setStudent1.start();
        getStudent1.start();
    }
}
