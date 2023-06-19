package Review13;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.units.qual.C;
import utils.Constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {
    public static void main(String[] args) {

        var excelData=readData(Constants.EXCEL_FILE_PATH,"Sheet1");
        System.out.println(excelData);
    }

    public static List<Map<String, String>> readData(String filePath, String sheetName) {
        List<Map<String, String>> mapList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filePath);//navigate to the path
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);//software to read
            Sheet sheet = xssfWorkbook.getSheet(sheetName);//we will specify the sheet from where we want to read the data
            int numberOfRows = sheet.getPhysicalNumberOfRows();//this will get number of rows
            Row headerRow = sheet.getRow(0);//this will print the header row
            for (int i = 1; i < numberOfRows; i++) {//this loop will iterate over the rows excluding header
                //we opt for linked since it maintains oder of the data
                Map<String, String> rowMap = new LinkedHashMap<>();//we will store all the data in the map since map will store two things at one time keys and values
                Row row = sheet.getRow(i);//this will extract the row from the map
                int numberOfCells = row.getPhysicalNumberOfCells();//this will tell how many cells are present in the row
                //we need this loop so it can iterate over each cell
                // this loop will start from 0 if we start from 1 it will skip the column of first name
                for (int j = 0; j < numberOfCells; j++) {

                    //since header contains the keys(firstname, last name, etc)
                    //we add to string at the end since this will return data type as cell. so we want to get data in string
                    String key = headerRow.getCell(j).toString();
                    //print value this will also return cell so we need to add to string so we get data in stings.
                    String value = row.getCell(j).toString();

                    rowMap.putIfAbsent(key, value);
                }
                mapList.add(rowMap);
            }
            System.out.println();
        } catch (IOException foundException) {
            foundException.printStackTrace();
        }
        return mapList;
    }
}

