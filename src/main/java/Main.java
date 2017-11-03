import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","/Users/qpcio/Downloads/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.pl");
        driver.findElement(By.name("q")).sendKeys("Testowanie Oprogramowania");
        driver.findElement(By.name("q")).submit();
        driver.quit();
    }
}
