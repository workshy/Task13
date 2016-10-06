package ua.epam.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import ua.epam.model.Children;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Viktoriia_Marynchak on 10/6/2016.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println(Runner.parse("src\\main\\resources\\Child.xls").toString());
    }

    public static List<Children> parse(String fileName) {
        //String result = "";
        InputStream inputStream = null;
        HSSFWorkbook workBook = null;
        List<Children> list = new ArrayList<Children>();

        try {
            inputStream = new FileInputStream(fileName);
            workBook = new HSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Sheet sheet = workBook.getSheetAt(0);
        int a = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Children child = new Children();
            Row row = sheet.getRow(i);
            for (int j = 0; j < Children.class.getDeclaredFields().length; j++ ) {
                Cell cell = row.getCell(j);

                switch (j){
                    case 0: child.setId((int)cell.getNumericCellValue());
                        break;
                    case 1: child.setFirstName(cell.getStringCellValue());
                        break;
                    case 2: child.setLastName(cell.getStringCellValue());
                        break;
                    case 3: child.setAge((int)cell.getNumericCellValue());
                        break;
                    case 4: child.setIdGuest((int)cell.getNumericCellValue());
                        break;
                }
            }
            list.add(child);
        }

        return list;
    }
}
