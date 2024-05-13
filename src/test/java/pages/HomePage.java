package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Browserdriver;

public class HomePage extends Browserdriver {


    public static String menu_xpath="//*[@id=\"menuToggle\"]/input";
    public static String signin_Link_xpath="//*[@id=\"menu\"]/a[2]/li";


    public static void Clickmenu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath(menu_xpath)).click();

    }
    public static void ClickOnSignIn_link() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(signin_Link_xpath)).click();

    }

}
