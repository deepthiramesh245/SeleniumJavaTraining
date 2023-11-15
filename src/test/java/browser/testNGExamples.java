package browser;

import org.testng.annotations.*;

public class testNGExamples {
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before suite");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }
    @Test(priority = 0)
    public void S()
    {
        System.out.println("S test case");
    }
    @Test(priority = 1)
    public void A()
    {
        System.out.println("A test case");
    }
    @Test(priority = 2)
    public void H()
    {
        System.out.println("H test case");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After suite");
    }
}
