package Class27;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;
import java.io.FileInputStream;
import java.io.IOException;
public class E3ExcelReader {
    public static void main(String[] args) throws IOException {

      // String path=System.getProperty("user.drive") +"C:\\Users\\User\\IdeaProjects\\SDETJavabatch 16\\Files\\Book1.xlsx";

        FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH);
        //that special call which knows how to read the data from excel file
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        //this sheet interface will get the data on sheet that we want to get from
        Sheet sheet =xssfWorkbook.getSheet("Sheet1");
        //Row is interface
        Row row=sheet.getRow(3);
        //cell is interface-- in excel we call columns as Cell/
        Cell cell=row.getCell(2);
        System.out.println(cell);



    }
}
