//Activity_4_2 Using findElement() method
//Create a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://www.training-support.net/selenium/simple-form
//Getting the title of the page using driver.getTitle() and print out the title.
//Using findElement() with xpath() to find all the input fields on the page.
//Filling in the details in the fields using the sendKeys() method.
//Clicking the submit button at the end of the form to submit the form.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_2 {
    public static void main(String[] args) {
        // Creating a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Opening the browser
        driver.get("https://www.training-support.net/selenium/simple-form");
        //Finding the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        //Finding the input fields and enter text
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        firstName.sendKeys("Sunil");
        lastName.sendKeys("Kumar");
        //Entering the email
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("memyself@example.com");
        //Entering the contact number
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("0132432790");
        //Entering Message
        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");
        //Clicking Submit
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
    }
}