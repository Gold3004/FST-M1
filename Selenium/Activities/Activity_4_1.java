//Activity_4_1
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://www.training-support.net
//Getting the title of the page using driver.getTitle() and printing the title.
//Using findElement() with xpath() to find and click the "About Us" link on the page.
//Print the title of the new page that open when the link is clicked.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_1 {
    public static void main(String[] args) {
        //Creating a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //using this to visit the website
        driver.get("https://www.training-support.net");
        //Checking the title of the page
        String title = driver.getTitle();
        //Printing the title of the page
        System.out.println("Page title is: " + title);
        //Finding the "About Us" button ont he page and click it
        driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
        //Printing title of new page
        System.out.println("Heading is: " + driver.getTitle());
        //Closing the browser
        driver.close();
    }
}