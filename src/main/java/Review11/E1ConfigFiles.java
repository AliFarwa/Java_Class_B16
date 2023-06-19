package Review11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E1ConfigFiles {
    public static void main(String[] args) {

        String path = "File/config.properties";

        FileOutputStream fis = null;//to use it anywhere
        try {
            fis = new FileOutputStream(path);
        } catch (FileNotFoundException f) {
            f.printStackTrace();//it will complete the exceution of the code

        }
    }
}
