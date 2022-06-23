//Activity_4_3
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://www.training-support.net/selenium/target-practice
//Getting the title of the page using driver.getTitle() and print out the title.
//Using findElement() with xpath() to
//Finding the third header on the page, fifth header on the page and get it's 'colour' CSS Property.
//Finding the violet button on the page and printing all the class attribute values.
//Finding the grey button on the page with Absolute XPath.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_3 {
    public static void main(String[] args) {
        // Creating a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Opening the browser
        driver.get("https://www.training-support.net/selenium/target-practice");
        //Finding the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        //Finding the third header
        String thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Third header text is: " + thirdHeader);
        //Finding the fifth header and get it's colour
        String fifthHeaderColour = driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println("Fith header's colour is: " + fifthHeaderColour);
        //Finding the violet button and print it's classes
        String violetButtonClasses = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
        System.out.println("Violet button's classes are: " + violetButtonClasses);
        //Finding the grey button with Absolute XPath
        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + greyButton);
        //Closing the browser
        driver.close();
    }
}