package SelenuimRun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceEndtoEned {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.rediff.com/");
        Driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        Driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Hi i am joe");
        Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Yeah i know ");
        Driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
    }
}
