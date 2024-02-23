package _4Checkbox_Radio_DropDown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        boolean radioMale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Radio button Male: " + radioMale);
        boolean radioFemale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).isSelected();
        System.out.println("Radio button Female: " + radioFemale);
        sleep(2);

        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).click();
        boolean radioMaleAft = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        boolean radioFemaleAft = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).isSelected();
        System.out.println("Click Male" + "\n" + "Radio button Male: " + radioMaleAft + "\n" + "Radio button Female: " + radioFemaleAft);
        sleep(2);

        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).click();
        boolean radioMaleAft2 = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        boolean radioFemaleAft2 = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).isSelected();
        System.out.println("Click Female" + "\n" + "Radio button Male: " + radioMaleAft2 + "\n" + "Radio button Female: " + radioFemaleAft2);


        closeBrowser();
    }
}
