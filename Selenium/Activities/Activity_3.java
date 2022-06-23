//Activity_3
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://training-support.net/selenium/simple-form
//Getting the title of the page using driver.getTitle() and print out the title.
//Using findElement() with name() to find the text fields - firstname and lastname.
//Using WebElement.sendKeys() to type in those text fields.
//Similarly, finding and type into the email and contact number fields.
//Finally, submitting the form by clicking the Submit button.
//Closing the browser with driver.close()

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");
        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        //Find the input fields
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        //Enter text
        firstName.sendKeys("Anil");
        lastName.sendKeys("Kharma");
        //Entering the email
        driver.findElement(By.id("email")).sendKeys("test@example.com");
        //Entering the contact number
        driver.findElement(By.id("number")).sendKeys("1234567890");
        //Clicking Submit
        driver.findElement(By.cssSelector(".ui.green.button")).click();
        //Closing the browser
        driver.close();
    }
}