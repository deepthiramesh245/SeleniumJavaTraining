package browser;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;

public class dropDownHandlingTest {
    @Test
    public void dropDownTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",loginButton);

        //loginButton.click();
        WebElement sortButton = driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));
        Actions action = new Actions(driver);
        action.moveToElement(sortButton).perform();
        Select select = new Select(sortButton);
        List<WebElement> allOptions = select.getOptions();
        System.out.println("count of options:" + allOptions.size());
        for (WebElement optionNames : allOptions) {
            System.out.println("Available option names: " + optionNames.getText());
        }
        WebElement firstSelected = select.getFirstSelectedOption();
        System.out.println("First selected option is : " + firstSelected.getText());
        Thread.sleep(2000);
        select.selectByIndex(1);
        Thread.sleep(2000);
        WebElement sortButton1 = driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));
        Select select1 = new Select(sortButton1);
        select.selectByValue("lohi");
        Thread.sleep(2000);
        WebElement sortButton2 = driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));
        Select select2 = new Select(sortButton2);
        select.selectByVisibleText("Name (A to Z)");
    }

    @Test(groups = {"smoke"})
    public void dropDownTestRealtime() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement dropDownButton = driver.findElement(By.id("menu1"));
        dropDownButton.click();



    }
}
