package SelenuimRun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandel {
    public static void main(String[] args) {

         String text = "Rahul";
        WebDriverManager.chromedriver().setup();

        WebDriver Driver = new ChromeDriver();
        Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Driver.findElement(By.id("name")).sendKeys(text);
        Driver.findElement(By.cssSelector("[id='alertbtn'")).click();
        System.out.println(Driver.switchTo().alert().getText());
        Driver.switchTo().alert().accept();
        Driver.findElement(By.id("confirmbtn")).click();
        System.out.println(Driver.switchTo().alert().getText());
        Driver.switchTo().alert().dismiss();

    }
}
