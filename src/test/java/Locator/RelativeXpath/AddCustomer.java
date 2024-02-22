package Locator.RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddCustomer {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);
        //Login CRM
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Add Customer
//        driver.findElement(By.xpath("//a[starts-with(text(),'Admin ') or contains(text(),'Example')]")).click();
//        driver.findElement(By.xpath("//input[@class='form-control input-sm']/ancestor::div[@class='widget']")).click();
//        driver.findElement(By.xpath("//div[@id='widget-user_data']/descendant::button[.='Export']")).click();
//        driver.findElement(By.xpath("//a[normalize-space()='My Tasks']/following::input[@type='search']")).click();
//        driver.findElement(By.xpath("//a[normalize-space()='My Tasks']/preceding::input[@type='search']")).click();
//        driver.findElement(By.xpath("//div[@class='horizontal-scrollable-tabs panel-full-width-tabs']//li[1]/following-sibling::li")).click();
//        driver.findElement(By.xpath("//a[@class='btn btn-default pull-left display-block mright5']/preceding-sibling::a[normalize-space()='Import Customers']")).click();

        driver.findElement(By.xpath("//span[normalize-space() ='Customers']")).click();
        driver.findElement(By.xpath("//a[contains(normalize-space(), 'New Customer')]")).click();
        driver.findElement(By.xpath("//label[@for='company']/following-sibling::input")).sendKeys("K 04 2023");
        driver.findElement(By.xpath("//input[@id='vat']")).sendKeys("123156");
        driver.findElement(By.xpath("//button[contains(normalize-space(), 'create ')]")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Contracts']")).click();


        Thread.sleep(3000);
        driver.close();

    }
}
