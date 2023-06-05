package Class27;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E6Shheet2 {
    public static void main(String[] args) throws IOException {
        //locate the filr
        FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH);
        //softaware to read data from the file we located
        XSSFWorkbook excelsheet2=new XSSFWorkbook(fis);
        //from which sheet of excel we want to grab data
        Sheet sheet2=excelsheet2.getSheet("Sheet2");
        //declare Map
        List<Map<String, String>> excelData = new ArrayList<>();
        Row headerRow= sheet2.getRow(0);
        //i=rows
        for (int i = 1; i <sheet2.getPhysicalNumberOfRows() ; i++) {
            Row row=sheet2.getRow(i);
            Map<String, String> rowMap = new LinkedHashMap<>();

            //j=columns== excel has cells
            for (int j = 0; j < row.getPhysicalNumberOfCells() ; j++) {
                String key=headerRow.getCell(j).toString();
                String value=row.getCell(j).toString();
                rowMap.put(key,value);
            }
            excelData.add(rowMap);
        }
        System.out.println(excelData);
            }
        }


