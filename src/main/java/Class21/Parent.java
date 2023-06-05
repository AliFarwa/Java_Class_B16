package Class21;

public class Parent {

  final  void getMarry(){// no child class will be allowed to ovewr ride this
        System.out.println("Marry Shakira");
    }
    void study(){// this can be override by the child class
        System.out.println("Study Medicine");
    }
}
class Axel extends Parent{
    @Override
    void study(){
        System.out.println("No I want to Study Sdet");
    }
}