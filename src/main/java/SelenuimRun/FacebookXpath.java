package SelenuimRun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.WeakHashMap;

public class FacebookXpath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver Driver = new ChromeDriver();

        Driver.get("https://facebook.com");
//        Driver.findElement(By.xpath("//input[@name='email']")).sendKeys("My Xpath");
//        Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hello");
//        Driver.findElement(By.xpath("//button[@name='login'] ")).click();
//tagName[attribute='value']-css
        Driver.findElement(By.cssSelector("input[name='email']")).sendKeys("My OWN CSS");
        Driver.findElement(By.cssSelector("input[id='pass'")).sendKeys("Hello how are you ");
        Driver.findElement(By.cssSelector("button[name='login'")).click();
    }
}
