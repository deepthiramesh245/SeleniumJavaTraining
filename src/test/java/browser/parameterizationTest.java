package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationTest {
    @Parameters({"browserLaunch", "userId", "passWord"})
    @Test
    public void launchBrowserTest(String browserLaunch, String userId, String passWord) throws InterruptedException {
        System.out.println("Browser is :" + browserLaunch);
        System.out.println("userid is :" + userId);
        System.out.println("password is :" + passWord);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.de/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.close();
    }

    @Parameters({"browserLaunch", "userId", "passWord"})
    @Test
    public void launchBrowserTest1(@Optional("firefox") String browserLaunch, @Optional("Ramesh") String userId, @Optional("098765") String passWord) throws InterruptedException {
        System.out.println("Browser is :" + browserLaunch);
        System.out.println("userid is :" + userId);
        System.out.println("password is :" + passWord);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.de/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.close();
    }

    @Parameters({"browserLaunch", "userId", "passWord"})
    @Test
    public void launchBrowserTest2(@Optional("chrome")String browserLaunch,@Optional("deepthi") String userId,@Optional String passWord) throws InterruptedException {
        System.out.println("Browser is :" + browserLaunch);
        System.out.println("userid is :" + userId);
        System.out.println("password is :" + passWord);
        WebDriver driver = null;
        if (browserLaunch.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            System.out.println("browser is chrome");
        } else if (browserLaunch.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            System.out.println("browser is firefox");
        } else if (browserLaunch.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            System.out.println("browser is edge");
        } else System.out.println("browser not supported");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.de/");
        Thread.sleep(5000);
        driver.close();
    }
}
