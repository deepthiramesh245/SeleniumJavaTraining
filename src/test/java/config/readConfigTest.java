package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readConfigTest {
    WebDriver driver = null;
    String configFilePath = "C:\\Users\\rames\\SeleniumTraining\\src\\test\\java\\config\\configuration.properties";
    public static Properties configMethod(String filepath) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(filepath);
        prop.load(fis);
        return prop;
    }
    @Test
    public void configLaunchBrowserTest() throws InterruptedException, IOException {
       Properties myProp= readConfigTest.configMethod(configFilePath);
        String browser = myProp.get("browserLaunch").toString();
        String userName = myProp.get("userId").toString();
        String Pwr = myProp.get("passWord").toString();
        String url = myProp.get("appUrl").toString();

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            System.out.println("browser is chrome");
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            System.out.println("browser is firefox");
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            System.out.println("browser is edge");
        } else System.out.println("browser not supported");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.de/");
        Thread.sleep(5000);
        driver.close();
    }
}
