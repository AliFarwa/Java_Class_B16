package Class17;

public class Cat {
    String name;
    Cat(String catName){
        name=catName;
        System.out.println("1st argument constructor called");
    }
    Cat(int age){
        System.out.println("Int argument constructor");
    }
    Cat(double weight){
        System.out.println("Double argument constructor");
    }
    Cat(){
        System.out.println("0 argument constructor called");
    }
    void printInfo(){
        System.out.println();
    }

    public static void main(String[] args) {
           Cat obj=new Cat(7 );
          obj.printInfo();
          obj.printInfo();
    }
}
