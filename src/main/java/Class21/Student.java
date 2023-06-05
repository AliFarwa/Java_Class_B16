package Class21;

public class Student {
    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism

    void study() {
        System.out.println(" Student studies 3 hours a day");
    }
    void sleep() {
        System.out.println("Student sleeps 8 hrs a day");
    }
    void watches() {
        System.out.println("After studying student watches TV");
    }
}
class SyntaxStudents extends Student {
    @Override
    void study() {
        System.out.println(" Syntaxstudents studies 4 hours a day");
    }
    @Override
    void sleep() {
        System.out.println("Syntaxstudents  sleeps 4 hrs a day");
    }
    @Override
    void watches() {
        System.out.println("After studying Syntaxstudent watches games");
    }
}
class CollegeStudent extends Student {
    @Override
    void study() {
        System.out.println(" Collegetudents studies 8 hours a day");
    }
    @Override
    void sleep() {
        System.out.println("Collegestudents  sleeps 2 hrs a day");
    }
    @Override
    void watches() {
        System.out.println("After studying Collegetudent watches shows");
    }
}

class SchoolStdent extends Student {
    @Override
    void study() {
        System.out.println(" schoolstudent studies 8 hours a day");
    }
    @Override
    void sleep() {
        System.out.println("schoolstudent  sleeps 2 hrs a day");
    }
    @Override
    void watches() {
        System.out.println("After studying school student watches cartoons");
    }
    void fights(){
        System.out.println("Students are fighting");
    }
}
class StudentTester {
    public static void main(String[] args) {

        Student student[] = {new SyntaxStudents(), new CollegeStudent(), new SchoolStdent()};
        for (Student student1 : student) {
            student1.sleep();
            student1.study();
            student1.watches();
        }
        Student school= new SchoolStdent();// type casting since we have one behavior in School student that is not in parent class
       ((SchoolStdent) school).fights();
    }
}