package SelenuimRun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggsitve {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver Driver = new ChromeDriver();
        Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
       List<WebElement> options = Driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for (WebElement option : options)
        {
            if (option.getText().equalsIgnoreCase("india"))
            {
                option.click();
                break;

        }
        }

    }
}
