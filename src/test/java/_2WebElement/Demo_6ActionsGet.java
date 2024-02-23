package _2WebElement;

import _1Locator.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_6ActionsGet {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://crm.anhtester.com/admin/authentication");

        String headerLogin = driver.findElement(By.xpath(LocatorsCRM.headerLogin)).getText();
        System.out.println(headerLogin + "\n");

        String colorBtnLogin = driver.findElement(By.xpath(LocatorsCRM.btnLogin)).getCssValue("background-color");
        System.out.println(colorBtnLogin);
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.btnLogin)).getCssValue("color") +"\n");

        String attributeBtnLogin = driver.findElement(By.xpath(LocatorsCRM.btnLogin)).getAttribute("class");
        System.out.println(attributeBtnLogin);
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.btnLogin)).getAttribute("type")+"\n");

        driver.get("https://rise.fairsketch.com/signin");
        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder") + "\n");

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.email)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.password)).sendKeys("123456");
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.email)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.password)).getAttribute("value") + "\n");

        Dimension dimension = driver.findElement(By.xpath(LocatorsCRM.btnLogin)).getSize();
        System.out.println(dimension.getHeight());
        System.out.println(dimension.getWidth()+"\n");

        Point location = driver.findElement(By.xpath(LocatorsCRM.btnLogin)).getLocation();
        System.out.println(location.getX());
        System.out.println(location.getY()+"\n");

        Thread.sleep(1000);
        driver.quit();
    }
}
