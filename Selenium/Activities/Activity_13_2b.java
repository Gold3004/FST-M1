//Activity_13_2b
//Reading data from the Excel file in the previous activity.
//Opening the browser and navigate to https://www.training-support.net/selenium/simple-form.
//Filling in the form with the data retrieved.
//Reading the alert message after submitted the form.
//Closing the browser.

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_13_2b {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //Preparing the path of excel file
        String filePath = "C:/Users/02003C744\\Desktop/Activity_13_2a.xlsx";
        //Creating an object of current class
        Activity_13_2b srcExcel = new Activity_13_2b();
        //Calling read file method of the class to read data
        List<List<String>> data = srcExcel.readExcel(filePath);
        List<String> row;
        //Opening the browser
        driver.get("https://www.training-support.net/selenium/simple-form");
        //Finding the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        //Getting row 1 data
        row = data.get(3);
        //Finding the input fields and enter text
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        firstName.sendKeys(row.get(1));
        lastName.sendKeys(row.get(2));
        //Entering the email
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(row.get(3));
        //Entering the contact number
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys(row.get(4));
        //Clicking Submit
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
        //Switching to alert
        Alert message = driver.switchTo().alert();
        //Getting alert message
        System.out.println("Alert message: " + message.getText());
        message.accept();
        //Closing the browser
        driver.close();
    }
    public List<List<String>> readExcel(String filePath) {
        List<List<String>> data = new ArrayList<List<String>>();
        try {
            FileInputStream file = new FileInputStream(filePath);
            //Creating Workbook instance holding reference to Excel file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            //Getting first sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            //Iterating through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while(rowIterator.hasNext()) {
                //Temp variable
                List<String> rowData = new ArrayList<String>();
                Row row = rowIterator.next();
                //For each row, iterating through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    if(row.getLastCellNum() == 5) {
                        //Storing row data
                        rowData.add(cell.getStringCellValue());
                    }
                }
                //Storing row data in List
                data.add(rowData);
            }
            file.close();
            workbook.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}