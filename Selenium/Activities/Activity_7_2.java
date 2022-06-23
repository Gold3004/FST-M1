//Activity_7_2
//Creating a Class and a main() method
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://training-support.net/selenium/dynamic-attributes
//Getting the title of the page using driver.getTitle() and printing out the title.
//Finding the input fields of the Sign Up form. Fill in the details in the fields with your own data.
//Waiting for success message to appear and printing it to the console.
//Finally, closing the browser.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_7_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //Open browser
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        //Finding username and password fields
        WebElement userName = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
        //Typing credentials
        userName.sendKeys("NewUser");
        password.sendKeys("Password");
        confirmPassword.sendKeys("Password");
        email.sendKeys("real_email@xyz.com");
        //Clicking Sign Up
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        //Printing login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        //Closing browser
        driver.close();
    }
}