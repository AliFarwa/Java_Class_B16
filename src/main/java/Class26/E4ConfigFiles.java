package Class26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E4ConfigFiles {
    public static void main(String[] args) throws IOException {
        //will tell you where project is store in ur computer
        System.out.println(System.getProperty("user.dir"));
        String path=System.getProperty("user.dir")+"\\"+"Files\\Config.properties";
        System.out.println(path);

        //navigate to the file
        FileInputStream fileInputStream=new FileInputStream(path);

        //we need a software who understand how this
        // above file works but in java there is a class present for this job
        // this is that class:
        Properties properties= new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));
    }
}
