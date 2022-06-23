//Activity_5_3 Using isEnabled() Method
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Launching the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method.
//Getting the page title and print it to the console.
//Using findElement() to find the text field.
//Using the isEnabled() method to check if the text field is enabled.
//Clicking the "Enable Input" button to enable the input field.
//Using the isEnabled() method again and print the result.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_3 {
    public static void main(String[] args) {
        // Creating a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Opening the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
        //Finding the checkbox
        WebElement textInput = driver.findElement(By.xpath("//input[@type='text']"));
        //Printing status
        System.out.println("The checkbox is selected: " + textInput.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        //Printing status
        System.out.println("The checkbox is selected: " + textInput.isEnabled());
        //Closing the browser
        driver.close();
    }
}