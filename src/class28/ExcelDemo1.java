package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {

        //we need to know path of the file
        String path="Data/Test.xlsx";
        //navigate to this path
        FileInputStream fileInputStream=new FileInputStream(path);
        //that special that can handle the xlsx files
        XSSFWorkbook excelFile=new XSSFWorkbook(fileInputStream);
        //Getting to the Sheet inside the Excel file where data is stored
        Sheet sheet=excelFile.getSheet("Sheet1");
        //Getting the Row that contains the data rows are index based, so they will start from zero
        Row row0= sheet.getRow(0);
        System.out.println(row0.getCell(0));
        //get the data from row 1
        Row row1= sheet.getRow(1);
        System.out.println(row1.getCell(0));


    }
}
