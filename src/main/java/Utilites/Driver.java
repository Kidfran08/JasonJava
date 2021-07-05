package Utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver() {
    }

    private static WebDriver Driver;

    public static WebDriver getDriver() {

        if (Driver == null) {

            String browser = ConfigurationReader.getProperty("browser");

            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    Driver = new ChromeDriver();
                    Driver.manage().window().maximize();
                    Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    Driver = new FirefoxDriver();
                    Driver.manage().window().maximize();
                    Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    Driver = new ChromeDriver();
                    Driver.manage().window().maximize();
                    Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }

        //This same driver will be returned every time we call Driver.getDriver() method
        return Driver;

    }

    public static void closeDriver() {
        if (Driver != null) {
            Driver.quit();
            Driver = null;
        }
    }
}