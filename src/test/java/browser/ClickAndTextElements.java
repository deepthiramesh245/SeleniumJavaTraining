package browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ClickAndTextElements {
    @Parameters({"browserLaunch"})
    @Test(groups = {"smoke"})
    public void testValidateLoginScenario() throws InterruptedException {
        String username = "standard_user";
        String pwd = "secret_sauce";


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // alt+ ENTER
        WebElement userName = driver.findElement(By.id("user-name"));

        WebElement password = driver.findElement(By.name("password"));

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));

        System.out.println(loginButton.getAttribute("value"));

        userName.sendKeys(username);
        password.sendKeys(pwd);
        Thread.sleep(3000);
        loginButton.click();

        WebElement cartIcon = driver.findElement(By.id("shopping_cart_container"));

        boolean val = cartIcon.isDisplayed();

//        boolean val = false;

        Assert.assertTrue(val, "Cart Icon not displayed");

        WebElement swagLogo = driver.findElement(By.cssSelector("div.app_logo"));

        String logoText = swagLogo.getText();

        Assert.assertEquals(logoText, "Swag Labs");

            WebElement selectProduct = driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']"));
            selectProduct.click();
        Thread.sleep(3000);
            WebElement addProduct = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
            addProduct.click();
        Thread.sleep(3000);
            WebElement cartLink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
            cartLink.click();
        Thread.sleep(3000);
            WebElement checkOut = driver.findElement(By.id("checkout"));
            checkOut.click();
        Thread.sleep(3000);
            WebElement firstName = driver.findElement(By.id("first-name"));

            WebElement lastName = driver.findElement(By.id("last-name"));
            WebElement postalCode = driver.findElement(By.id("postal-code"));
            firstName.sendKeys("abc","sdfg");
            lastName.sendKeys("xyz");
            postalCode.sendKeys("1234");
        Thread.sleep(3000);
            WebElement clickContinue = driver.findElement(By.id("continue"));
            clickContinue.click();
WebElement finishButton = driver.findElement(By.id("finish"));
finishButton.click();
By completeHeaderL =  By.xpath("//h2[@class='complete-header']");
WebElement completeHeader = driver.findElement(completeHeaderL);
String Text = completeHeader.getText();
Assert.assertEquals(Text,"Thank you for your order!");
        System.out.println(Text);
        }
    @Test
        public void testDynamicalLoading()
    {

        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        By dynamicLoadingL = By.xpath("//a[@href='/dynamic_loading']");
        WebElement dynamicLoading = driver.findElement(dynamicLoadingL);
        dynamicLoading.click();
        By firstDynamicLoadingL = By.xpath("//a[@href='/dynamic_loading/1']");
        WebElement firstDynamicLoading = driver.findElement(firstDynamicLoadingL);
        firstDynamicLoading.click();
        By startButtonClickL = By.xpath("//button['text=Start']");
        WebElement startButtonClick = driver.findElement(startButtonClickL);
        startButtonClick.click();

        Assert.assertEquals(startButtonClick,"Hello World!\n");

    }

    }

