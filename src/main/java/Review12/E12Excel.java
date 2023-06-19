package Review12;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E12Excel {
    public static void main(String[] args) {
        String path = "Files/Book1.xlsx";

        try {
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        } catch (IOException f) {
            f.printStackTrace();

        }
    }
}