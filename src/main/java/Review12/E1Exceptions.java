package Review12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class E1Exceptions {
    public static void main(String[] args) {

        method1();
    }

    static void method1() {
        method2();
    }

    static void method2() {
        method3();
    }

    static void method3() {
        try {
            File file = new File("Files/Emp1.xlsx");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
            }
        }catch (IOException io){
            System.out.println("Can not find the file");
        }
    }




}
