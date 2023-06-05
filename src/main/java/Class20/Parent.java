package Class20;

public class Parent {

    void getMarry(){
        System.out.println("Marry to the girl of our choice");
    }
}
class Axel extends Parent {
    @Override
    void getMarry() {
        System.out.println("of my own choice");
    }
    static void printNumber(){
        System.out.println(20);
    }
}

class ParentTester{
    public static void main(String[] args) {
        Axel axel=new Axel();
        axel.getMarry();
    }
}