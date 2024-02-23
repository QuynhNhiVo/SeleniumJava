package _4Checkbox_Radio_DropDown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleMultiRadioButton extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        List<WebElement> listRadio = driver.findElements(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label//input"));
        System.out.println("Radio total: " + listRadio.size());
        for (int i =0; i < listRadio.size(); i++){
            System.out.println("Radio Index("+(i+1)+") " + listRadio.get(i).isSelected());
        }

        listRadio.get(2).click();
        List<WebElement> listRadioAlt = driver.findElements(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label//input"));
        System.out.println("Radio total: " + listRadio.size());
        for (int i =0; i < listRadioAlt.size(); i++){
            System.out.println("Radio Index("+(i+1)+") " + listRadioAlt.get(i).isSelected());
        }

        int count = 0;
        int count1 = 0;
        System.out.print("\n");
        for (int i =0; i < listRadioAlt.size(); i++){
            System.out.println("Radio Index("+(i+1)+") " + listRadioAlt.get(i).isSelected());
            if (listRadioAlt.get(i).isSelected() == true){
                count1++;
            }
        }
        if(listRadioAlt.get(2).isSelected() == true){
            count++;
        }
        if (count == 1 && count1 < 2){
            System.out.println(count + "count = " + count1 + "count1");
        }

        closeBrowser();
    }
}
