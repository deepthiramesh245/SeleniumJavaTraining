package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingChromeBrowser {
   @Test(groups = {"smoke"})
    public void testLaunchingAmazon() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.de/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void testGetAmazonTitle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.de/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void testGoogleLinks() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://linkedin.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.linkText("Join now")).click();
        Thread.sleep(5000);
        //driver.close();
    }
}

