package SelenuimRun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver Driver = new ChromeDriver();

      /*  Driver.get("http://facebook.com");
        Driver.findElement(By.id("email")).sendKeys("this is my frist code ");
        Driver.findElement(By.name("pass")).sendKeys("This is my second code ");
        Driver.findElement(By.linkText("Forgot Password?")).click();*/
        Driver.get("https://www.facebook.com/");
        Driver.findElement(By.cssSelector("#email")).sendKeys("emaildadress");
        Driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Password");
        Driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div")).click();




    }
}
