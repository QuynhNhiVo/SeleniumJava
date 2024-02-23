package _4Checkbox_Radio_DropDown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.security.Key;

public class HandleDynamicDropdown extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");

        sleep(2);
        driver.findElement(By.xpath("//button[normalize-space()='Search Now']/parent::div/preceding-sibling::div[1]")).click();
        sleep(2);
        driver.findElement(By.xpath("(//span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).sendKeys("Tra");
        sleep(2);
        driver.findElement(By.xpath("(//span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).sendKeys(Keys.ENTER);

        closeBrowser();
    }
}
