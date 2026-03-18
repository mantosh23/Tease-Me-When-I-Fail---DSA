public class Basics {
    public static void main(String[] args) {
        // declare to ref Student
        Student s1 = new Student(01, "Mantosh", 100);
        s1.greeting();
        System.out.println(s1.name);
    }

}

// create class
class Student {
    int rno;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello my name is " + this.name);
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
