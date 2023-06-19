package Review13;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E2ExcelFiles {
    public static void main(String[] args) {
//This method will create a new XCEL Sheet
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        Sheet sheet=xssfWorkbook.createSheet("Sheet1");
        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("apple");

        FileOutputStream fos= null;
        try {
            fos = new FileOutputStream("C:\\Users\\User\\IdeaProjects\\SDETJavabatch 16\\File\\TestExcelFile.xlsx");
            xssfWorkbook.write(fos);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
