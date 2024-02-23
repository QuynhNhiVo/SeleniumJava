package _4Checkbox_Radio_DropDown;

import common.BaseTest;
import org.openqa.selenium.By;

public class HandleCheckBox extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        boolean checkbox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
        System.out.println(checkbox1);

        driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();

        boolean checkbox2 = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
        System.out.println(checkbox2);

        boolean message = driver.findElement(By.xpath("//div[@id='txtAge']")).isDisplayed();
        System.out.println("Message is Displayed: " + message);
        System.out.println("Message: " + driver.findElement(By.xpath("//div[@id='txtAge']")).getText());

        closeBrowser();
    }
}
