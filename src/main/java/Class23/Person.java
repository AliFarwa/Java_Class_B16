package Class23;

public interface Person {
    void eat();
}
interface Employee extends Person{
    void word();
}
class Tester implements Employee{

    @Override
    public void eat() {
        System.out.println(" Tester dont eat ");
    }

    @Override
    public void word() {
        System.out.println(" Tester make developers work harder");
    }
}