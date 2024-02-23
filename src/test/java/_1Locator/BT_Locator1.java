package _1Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BT_Locator1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.tagName("button")).click();

        driver.findElement(By.xpath("/html/body/aside/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/a[1]")).click();

        driver.findElement(By.id("company")).sendKeys("New Company");
        driver.findElement(By.id("vat")).sendKeys("12");
        driver.findElement(By.id("phonenumber")).sendKeys("123456");
        driver.findElement(By.id("address")).sendKeys("Ho Chi Minh");
        driver.findElement(By.id("city")).sendKeys("Ho Chi Minh");
        driver.findElement(By.id("state")).sendKeys("");
        driver.findElement(By.id("zip")).sendKeys("20000");

        Thread.sleep(1000);
        driver.close();
    }
}
