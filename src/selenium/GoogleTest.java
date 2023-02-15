package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class GoogleTest {
    public static void main(String[] args) {
        String url = "https://www.google.com/";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(url);
        driver.close();
    }
}
