package Class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E3ExcelFiles {
    public static void main(String[] args) throws IOException {
// add new date in existing file.
        //first find the path
          String path="C:\\Users\\User\\IdeaProjects\\SDETJavabatch 16\\Files\\Book1.xlsx";
          //we use fileinputstream to read the existing data
          //this line will retain the existing data//will not delete the exixting data
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.createRow(5);
        row.createCell(0).setCellValue("Moncef");
        row.createCell(1).setCellValue("M");
        row.createCell(2).setCellValue("Belgas");
        //this will creates a new file
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        // this will write the new data in the excel sheet
        xssfWorkbook.write(fileOutputStream);

    }
}
