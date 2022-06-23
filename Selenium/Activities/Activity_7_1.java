//Activity_7_1
//Creating a Class and a main() method
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://training-support.net/selenium/dynamic-attributes
//Getting the title of the page using driver.getTitle() and printing out the title.
//Finding the username and password input fields. Type in the credentials:
//username: admin
//password: password
//Waiting for login message to appear and print the login message to the console.
//Finally, closing the browser.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_7_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //Opening browser
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        //Finding username and password fields
        WebElement userName = driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));
        //Typing credentials
        userName.sendKeys("admin");
        password.sendKeys("password");
        //Clicking Log in
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        //Printing login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        //Closing browser
        driver.close();
    }
}