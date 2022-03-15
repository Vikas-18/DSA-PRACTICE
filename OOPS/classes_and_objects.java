
class Student{
    int age;
    String name;
    int rollno;

    void studentage()
    {
        System.out.println(this.age);
    }
}

public class classes_and_objects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.age = 15;
        student1.studentage();
    }
}
