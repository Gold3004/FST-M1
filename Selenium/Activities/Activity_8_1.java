//Activity_8_1
//Creating a Class and a main() method
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening the browser with https://training-support.net/selenium/tables using get() method.
//Using findElements() in combination with xpath() to find the number of columns and rows (not counting the table header) and print them.
//Finding and printing the all the cell values of the third row of the table.
//Finding and printing the cell value at the second row and second column.
//Closing the browser.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Activity_8_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //Opening browser
        driver.get("https://training-support.net/selenium/tables");
        //Getting columns
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        //Getting rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        //Number of columns
        System.out.println("Number of columns are: " + cols.size());
        //Number of rows
        System.out.println("Number of rows are: " + rows.size());
        //Getting third row values and print them
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for(WebElement cellValue : thirdRow) {
            System.out.println("Cell Value: " + cellValue.getText());
        }
        //Cell value of second row, second column
        WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value: " + cellValue2_2.getText());
        //Closing browser
        driver.close();
    }
}