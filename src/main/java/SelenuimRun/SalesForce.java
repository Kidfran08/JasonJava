package SelenuimRun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver Driver = new ChromeDriver();

        Driver.get("https://login.salesforce.com/");
        Driver.findElement(By.id("username")).sendKeys("Hello");
        Driver.findElement(By.name("pw")).sendKeys("123456");
        //Driver.findElement(By.className("button r4 wide primary")).click();//error
        Driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(Driver.findElement(By.cssSelector("div#error.loginError")).getText());
    }
}
