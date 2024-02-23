package _3WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DemoWebDriver {
    public static void main(String[] args) throws InterruptedException {
        //Initialize Browser
        WebDriver driver;
//        driver = new FirefoxDriver();
//        driver = new EdgeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver = new FirefoxDriver();
        driver.navigate().to("https://anhtester.com");
        driver.findElement(By.xpath("//a[@id='btn-login']")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        String html = driver.getPageSource();

        System.out.println(title + "\n");
        System.out.println(url);
//        System.out.println(html);

        driver.navigate().to("https://google.com");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("anhtester");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);

        Thread.sleep(1000);
        driver.quit();

    }
}
