package _3WebDriver;

import _1Locator.LocatorsCRM;
import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class DemoCookie extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath(LocatorsCRM.email)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.password)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.btnRemember)).click();
        driver.findElement(By.xpath(LocatorsCRM.btnRemember)).submit();

        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.iterator().next().toString());

        String cookieName = driver.manage().getCookieNamed("autologin").getValue();
        System.out.println(cookieName);
        System.out.println(cookies.iterator().next().getExpiry());

        closeBrowser();
    }
}
