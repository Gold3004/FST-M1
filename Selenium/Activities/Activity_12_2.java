
//Activity_12_2
//Navigating to https://www.training-support.net/selenium/nested-iframes
//Printing the title of the page.
//Traversing into the iframe that is on the page.
//Traversing into the first iframe in that frame.
//Printing the heading of that frame.
//Navigating to the second iframe in that frame.
//Printing the heading of that frame.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_12_2 {
    public static void main(String[] args) {
        //Creating WebDriver instance
        WebDriver driver = new FirefoxDriver();
        //Opening browser
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        //Printing title of the page
        System.out.println("Title of the page is: " + driver.getTitle());
        //Switching to first iFrame on the page
        driver.switchTo().frame(0);
        //Switching to first iFrame in that frame
        driver.switchTo().frame(0);
        //Getting heading text in iFrame
        WebElement frameHeading1 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(frameHeading1.getText());
        //Switching back to parent page
        driver.switchTo().defaultContent();
        //Switching to first iFrame on the page
        driver.switchTo().frame(0);
        //Switching to second iFrame in that frame
        driver.switchTo().frame(1);
        //Getting heading text in iFrame
        WebElement frameHeading2 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(frameHeading2.getText());
        //Closing browser
        driver.close();
    }
}