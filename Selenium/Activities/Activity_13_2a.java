//Activity_13_2a
//Using POI to write to an Excel file.
//The input that will be used is shown below
//creating three methods, to the Excel file: writeExcel(String filePath)
//To read from the Excel file: readExcel(String filePath)
//Main method: public static void main(String args[])
//writeExcel() method: using a .xlsx file, creating objects for XSSFWorkbook and XSSFSheet.
//Using add() methods add the arrays to the List

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Activity_13_2a {
    //Writing Excel
    public void writeExcel(String filePath) throws IOException {
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        //Creating a blank sheet
        XSSFSheet sheet = workbook.createSheet("Sheet1");
        //This data needs to be written (Object[])
        List<String[]> data = new ArrayList<String[]>();
        String[] heading = {"ID", "First Name", "Last Name", "Email", "Ph.No."};
        String[] row1 = {"1", "Bunny1", "One", "Bunny1_one@example.com", "4892184010"};
        String[] row2 = {"2", "Bunny2", "Two", "Bunny2_two@example.com", "4892184020"};
        String[] row3 = {"3", "Bunny3", "Three", "Bunny3_three@example.com", "4892184030"};

        data.add(heading);
        data.add(row1);
        data.add(row2);
        data.add(row3);

        //Iterating over data and write to sheet
        int rownum = 0;
        for (String[] rowData : data) {
            //Creating a new row in the sheet
            Row row = sheet.createRow(rownum++);
            int cellnum = 0;
            for (String cellData : rowData) {
                //Creating a cell in the next column of that row
                Cell cell = row.createCell(cellnum++);
                cell.setCellValue(cellData);
            }
        }
        try {
            //Writing to the workbook
            FileOutputStream out = new FileOutputStream(new File(filePath));
            workbook.write(out);
            out.close();
            workbook.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Reading Excel
    public void readExcel(String filePath) {
        try {
            FileInputStream file = new FileInputStream(filePath);
            //Creating Workbook instance holding reference to Excel file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            //Getting first sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            //Iterating through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) {
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + " \t ");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() + " \t ");
                            break;
                        default:
                            System.out.println("Invalid value");
                            break;
                    }
                }
                System.out.println("");
            }
            file.close();
            workbook.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) throws IOException {
        //Preparing the path of excel file
        String filePath = "C:/Users/02003C744\\Desktop/Activity_13_2a.xlsx";
        //Creating an object of current class
        Activity_13_2a objExcelFile = new Activity_13_2a();
        //Writing the file using file name, sheet name and the data to be filled
        objExcelFile.writeExcel(filePath);
        //Calling read file method of the class to read data
        objExcelFile.readExcel(filePath);
    }
}