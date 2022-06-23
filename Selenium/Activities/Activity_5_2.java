//Activity_5_2 Using isSelected() Method
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Launching the web browser, open https://training-support.net/selenium/dynamic-controls using the get() method.
//Getting the page title and printing it to the console.
//Using findElement() to find the checkbox input element.
//Using the isSelected() method to check if the checkbox is selected.
//Clicking the checkbox to select it.
//Using the isSelected() method again and print the result.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_2 {
     public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        //Find the checkbox
        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox is selected: " + checkboxInput.isSelected());
        //Selecting the checkbox
        checkboxInput.click();
        //Printing status
        System.out.println("The checkbox is selected: " + checkboxInput.isSelected());
        //Closing the browser
        driver.close();
    }
}