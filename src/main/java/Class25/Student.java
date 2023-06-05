package Class25;

public class Student {
    String name;
    String id;
    int age;

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
class StudentTester{
        public static void main(String[] args) {
            Student student= new Student("Lean","123",125);
            System.out.println(student);

        }
    }
