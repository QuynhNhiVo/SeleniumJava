package _3WebDriver;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAdvanceMethod {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://crm.anhtester.com/admin/authentication");

        Cookie cookie = new Cookie("sp_session", "1ede430ebba4f4602d3ec6a742bb585dc944a8ca");
        driver.manage().addCookie(cookie);

        driver.navigate().refresh();
        System.out.println(driver.manage().getCookieNamed("sp_session").getValue());

        driver.quit();
    }
}
