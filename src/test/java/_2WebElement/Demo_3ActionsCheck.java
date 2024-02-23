package _2WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_3ActionsCheck {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://anhtester.com");
        WebElement tagH1 = driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']"));
        boolean checkDisplayed = tagH1.isDisplayed();
        System.out.println(checkDisplayed);
        WebElement tagH2 = driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']"));
        boolean checkDisplayed2 = tagH2.isDisplayed();
        if (checkDisplayed == false && checkDisplayed2 == true){
            System.out.println(checkDisplayed + " ; " + checkDisplayed2);
        }else {
            System.out.println("2 false");
        }
        Thread.sleep(1000);

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        WebElement btnSubmit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
        boolean checkDisable = btnSubmit.isDisplayed();
        System.out.println(checkDisable);
        boolean checkEnable = btnSubmit.isEnabled();
        System.out.println(checkEnable);
        Thread.sleep(1000);

        driver.get("https://crm.anhtester.com/admin/authentication");
        WebElement checkBoxRemb = driver.findElement(By.xpath("//input[@id='remember']"));
        checkBoxRemb.click();
        if (checkBoxRemb.isSelected() == true){
            System.out.println("Selected");
        }else {
            System.out.println("False");
        }

        Thread.sleep(1000);
        driver.quit();
    }
}
