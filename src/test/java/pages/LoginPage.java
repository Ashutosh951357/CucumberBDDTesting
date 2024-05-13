package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Browserdriver;

public class LoginPage extends Browserdriver {

    public static String username_text_id="usr";
    public static String password_text_id="pwd";
    public static String login_button_xpath="//*[@id=\"second_form\"]/input";


    public static void Sendkey_Username() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id(username_text_id)).sendKeys("admin@gmail.com");


    }
    public static void Sendkey_password() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id(password_text_id)).sendKeys("P@assword!");

    }
    public static void click_Login() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_xpath)).click();

    }
}
