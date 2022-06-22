package OrangeHRM_SeleniumProject;
//import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Activity_3 extends Activity_1{
    public static void login_ToOrangeHRM(){
        //To find the element enter username field
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("orange");
        //To find the element enter password field
        WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passWord.sendKeys("orangepassword123");
        //To click Login button
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
    }
    public static void Checking_HomepageIsDisplayed(){
        // Verify that the homepage has opened.
        Assert.assertTrue((By.xpath("//a[@id='welcome']").findElement(driver).isDisplayed()));
        System.out.println("Assertion result is " + driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed());
        System.out.println("Homepage is displayed");
    }
    public static void main(String[] args) {
        //open the website
        driver_Init();
        login_ToOrangeHRM();
        //find and enter username
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("orange");

        //find and enter password
        WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passWord.sendKeys("orangepassword123");

        //click Login button
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        //verify that the homepage is displayed
        Assert.assertTrue(driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed());
        System.out.println("Assertion result is " + driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed());
        System.out.println("Homepage is displayed");

        //Checking_HomepageIsDisplayed();
        //closing the browser
        driver_Close();
    }
}