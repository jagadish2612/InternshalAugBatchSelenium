package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;

public class ExcelDataUtil {

    public static Object[][] readExcelData(String filepath,String SheetName) throws IOException {

        FileInputStream fis = new FileInputStream(filepath);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet(SheetName);

        int row = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getLastCellNum();

        System.out.println("rows "+row);
        System.out.println("cols "+cols);

        Object[][] data = new Object[row-1][cols];

        for(int i = 1;i<row;i++)
        {
            for(int k=0;k<cols;k++)
            {
                data[i-1][k] = sheet.getRow(i).getCell(k).toString();
            }
        }

        wb.close();

        return data;
    }
}
