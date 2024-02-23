package _4Checkbox_Radio_DropDown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleStaticDropdown extends BaseTest {
    //Tag Select
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByVisibleText("Thursday");
        System.out.println(select.getFirstSelectedOption().getText());
        //Assert.assertEquals(select.getFirstSelectedOption().getText(), "Tuesday"); So sánh 2 giá trị có bằng nhau hay không
        sleep(1);
        select.selectByIndex(6);
        System.out.println(select.getFirstSelectedOption().getText());
        sleep(1);
        select.selectByValue("Monday");
        System.out.println(select.getFirstSelectedOption().getText()+"\n");

        List<WebElement> listOptions = select.getOptions();
        for (WebElement element :listOptions){
            System.out.println(element.getText());
        }
        System.out.print("\n");

        Select selectMultiple = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
        selectMultiple.selectByIndex(2);
        selectMultiple.selectByIndex(5);
        selectMultiple.selectByIndex(6);
        sleep(2);
        List<WebElement> listMultiOptions = selectMultiple.getAllSelectedOptions();
        for (WebElement element :listMultiOptions){
            System.out.println(element.getText());
        }

        closeBrowser();
    }
}
