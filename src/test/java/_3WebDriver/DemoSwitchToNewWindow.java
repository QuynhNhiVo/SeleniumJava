package _3WebDriver;

import common.BaseTest;
import org.openqa.selenium.WindowType;

public class DemoSwitchToNewWindow extends BaseTest {
    public static void main(String[] args){
        createBrowser();

        driver.get("https://anhtester.com");
        String mainWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://google.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://anhtester.com/blogs");
        sleep(2);

        driver.switchTo().window(mainWindow);//Chuyen ve cua so mac dinh

        closeBrowser();
    }
}
