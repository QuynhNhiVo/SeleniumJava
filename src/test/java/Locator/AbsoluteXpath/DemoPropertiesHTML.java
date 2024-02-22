package Locator.AbsoluteXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoPropertiesHTML {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.id("remember")).click();

//        driver.findElement(By.linkText("Forgot Password?")).click();
//        driver.findElement(By.partialLinkText("Forgot")).click();
//        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.className("btn")).click();
        //Xpath Tuyet doi
        driver.findElement(By.xpath("/html/body/aside/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/a[1]")).click();
        Thread.sleep(1000);
        driver.close();
    }
}
