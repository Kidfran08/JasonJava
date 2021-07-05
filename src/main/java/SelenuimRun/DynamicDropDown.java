package SelenuimRun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class DynamicDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver Driver = new ChromeDriver();
        Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        Driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000l);
        //Driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        Driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        Driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        System.out.println( Driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        Driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println( Driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

        //
    }
}

//  //div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR'] - parent child xpath
// //a[@value='MAA'] XPTH for chenni

// //a[@value='BLR'] xpath for benglure