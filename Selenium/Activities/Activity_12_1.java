//Activity_12_1
//Navigating to https://www.training-support.net/selenium/iframes
//Printing the title, Heading of the 1st iframe,
//Printing the Button Text and color of the button in that frame.
//Clicking the button in that frame.
//Printing the new Button Text and color of the button.
//Repeating Steps 3-6 with the 2nd iframe.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_12_1 {
    public static void main(String[] args) {
        //Creating WebDriver instance
        WebDriver driver = new FirefoxDriver();
        //Opening browser
        driver.get("https://www.training-support.net/selenium/iframes");
        //Printing title of the page
        System.out.println("Title of the page is: " + driver.getTitle());
        //Switching to first iFrame on the page
        driver.switchTo().frame(0);
        //Performing operation on the first frame
        WebElement frameHeading1 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(frameHeading1.getText());
        //Clicking button in iFrame 1
        WebElement button1 = driver.findElement(By.cssSelector("button"));
        System.out.println(button1.getText());
        System.out.println(button1.getCssValue("background-color"));
        button1.click();
        //Printing New Button Info
        System.out.println(button1.getText());
        System.out.println(button1.getCssValue("background-color"));
        //Switching back to parent page
        driver.switchTo().defaultContent();
        //Switching to second iFrame on the page
        driver.switchTo().frame(1);
        //Performing operation on the second frame
        WebElement frameHeading2 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(frameHeading2.getText());
        //Clicking button in iFrame 2
        WebElement button2 = driver.findElement(By.cssSelector("button"));
        System.out.println(button2.getText());
        System.out.println(button2.getCssValue("background-color"));
        button2.click();
        //Printing New Button Info
        System.out.println(button2.getText());
        System.out.println(button2.getCssValue("background-color"));
        //Switch back to parent page
        driver.switchTo().defaultContent();
        //Closing browser
        driver.close();
    }
}