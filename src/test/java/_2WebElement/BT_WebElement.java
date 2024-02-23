package _2WebElement;

import _1Locator.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BT_WebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

        driver.get("https://crm.anhtester.com/admin/clients");
        driver.findElement(By.xpath(LocatorsCRM.email)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.password)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.btnLogin)).submit();

        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        driver.findElement(By.xpath(LocatorsCRM.newCustomer)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputCompany)).sendKeys("Web Element");
        driver.findElement(By.xpath(LocatorsCRM.inputVat)).sendKeys("123456789");
        driver.findElement(By.xpath(LocatorsCRM.inputPhone)).sendKeys("0909090");
        driver.findElement(By.xpath(LocatorsCRM.inputWebsite)).sendKeys("https://anhtester.com");
        driver.findElement(By.xpath(LocatorsCRM.dropDownGroup)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputGroup)).sendKeys("A");
        driver.findElement(By.xpath(LocatorsCRM.dropDownGroup)).click();
        driver.findElement(By.xpath(LocatorsCRM.dropDownCurrency)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputCurrency)).sendKeys("usd");
        driver.findElement(By.xpath(LocatorsCRM.inputCurrency)).submit();
        driver.findElement(By.xpath(LocatorsCRM.dropDownLanguage)).click();
        driver.findElement(By.xpath(LocatorsCRM.optionLanguage)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputAddress)).sendKeys("Ho Chi Minh");
        driver.findElement(By.xpath(LocatorsCRM.inputCity)).sendKeys("Ho Chi Minh");
        driver.findElement(By.xpath(LocatorsCRM.inputState)).sendKeys("No");
        driver.findElement(By.xpath(LocatorsCRM.inputZipCode)).sendKeys("20000");
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.btnSaveCustomer)).click();

        Thread.sleep(1000);
        driver.quit();
    }
}
