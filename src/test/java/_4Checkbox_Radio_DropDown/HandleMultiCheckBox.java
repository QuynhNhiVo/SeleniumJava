package _4Checkbox_Radio_DropDown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleMultiCheckBox extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        List<WebElement> listCheckBox = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));
        for(int i =0; i < listCheckBox.size(); i++){
            System.out.println("Index: " + i + " ," + listCheckBox.get(i).isSelected());
        }

        driver.findElement(By.xpath("//label[normalize-space()='Option 1']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Option 4']")).click();

        List<WebElement> listCheckBoxAfter = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));
        for(int i =0; i < listCheckBox.size(); i++){
            System.out.println("Index: " + i + " ," + listCheckBox.get(i).isSelected());
        }
        System.out.println("\n");

        //Cách dùng trực tiếp index với đoạn Xpath cụ thể
        for(int i =0; i < listCheckBox.size(); i++){
            System.out.println("Index: " + i + " ," + driver.findElement(By.xpath("(//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox'])["+(i+1)+"]")).isSelected());
        }

        closeBrowser();
    }
}
