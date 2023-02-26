package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class DropDownExampleTest {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://demo.guru99.com/test/newtours/reservation.php";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(url);
        WebElement dropDown = driver.findElement(By.name("passCount"));
        Select passangers = new Select(dropDown);
        passangers.selectByIndex(2);
        passangers.selectByValue("3");


        sleep(3000);
        driver.close();
    }
}
