package _2WebElement;

import _1Locator.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElementActions {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao Browser
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath(LocatorsCRM.email)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.password)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.btnRemember)).click();
        driver.findElement(By.xpath(LocatorsCRM.btnRemember)).submit();
//        driver.findElement(By.xpath(LocatorsCRM.btnLogin)).click();
//        driver.findElement(By.xpath(LocatorsCRM.btnLogin)).submit();

        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();

        Thread.sleep(1000);
        driver.quit();
    }
}
