package Equfax;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Amazon {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("qa testing for beginners");
       driver.findElement(By.id("nav-search-submit-button")).click();
        //driver.findElement(By.xpath("//*[@data-index='1']")).click();

        WebElement firstBook= driver.findElement(By.xpath("(//img[@data-image-latency ='s-product-image'])[1]"));
        firstBook.click();


       // driver.findElement(By.xpath("(//span[text()='Unit Testing Principles, Practices, and Patterns: Effective testing styles, patterns, and reliable automation for unit testing, mocking, and integration testing with examples in C#'])[1]")).click();
        WebElement priceTag = driver.findElement(By.xpath("(//span[text() = '$47.49'])[1]"));
        System.out.println(priceTag.getText());
        String actualResult=priceTag.getText();
        Assert.assertEquals(actualResult,"$47.49");
       //String titleName= driver.findElement(By.xpath("//span[text()='Unit Testing Principles, Practices, and Patterns: Effective testing styles, patt…']")).getText();
      //  System.out.println("the price of " + titleName + actualResult);
        Assert.assertEquals(actualResult,"$47.49");
        System.out.println(priceTag.getText());
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        //System.out.println(driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).isSelected());
        Assert.assertEquals(actualResult,"$47.49");

        WebElement priceTag3 =driver.findElement(By.xpath("(//span[text() = '$47.49'])[1]"));
        System.out.println(priceTag3.getText());
        String actualResults=priceTag3.getText();
        Assert.assertEquals(actualResults,"$47.49");

        driver.findElement(By.xpath("//span[@id='hlb-ptc-btn']")).click();


        WebElement checkoutPrice= driver.findElement(By.xpath("(//td[@class='a-text-right aok-nowrap a-nowrap'])[3]"));
        System.out.println(checkoutPrice.getText());
        String finalResult= checkoutPrice.getText();
        Assert.assertEquals(checkoutPrice,"$47.49");















    }
}

//driver.findElement(By.id("a-autoid-2")).getText(),"$47.49"

//1. Selenium WebDriver - Page Object Model:
//1. Visit amazon.com Page
//2. Search for Book 'qa testing for beginners'
//3. Click on 1st item in the listed results.
//4. Before Click on add to cart Add to Cart asset price from Step3.
//5. Click on Add to Cart.
//6. Before Click on Proceed to Checkout asset price from Step3.
//7. Click on proceed to checkout
//8. On the checkout page assert price from Step3