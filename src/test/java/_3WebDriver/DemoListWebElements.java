package _3WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DemoListWebElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

        driver.get("https://google.com");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("anhtester");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);

        List<WebElement> title = driver.findElements(By.xpath("//h3"));
        for(int i = 0; i < title.size(); i++){
            System.out.println(title.get(i).getText());
        }

        Thread.sleep(1000);
        driver.quit();
    }
}
