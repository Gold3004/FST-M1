//Activity_5_1 Using isDisplayed() Method
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Launching the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method.
//Getting the page title and print it to the console.
//Using findElement() to find the checkbox input element.
//Using the isDisplayed() method to check if it is visible on the page.
//Clicking the "Remove Checkbox".
//Printing the result of the isDisplayed() method again.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_1 {
    public static void main(String[] args) {
        // Creating a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Opening the browser
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        //Finding the checkbox
        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
        //Closing the browser
        driver.close();
    }
}