package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test_Suite {

    WebDriver driver=null;

/*if we use this test suites ,we can save more than time to execute scripts

EG: we can open the browser once and test all the functionality of the software and quit
the browser in last
*/
    //testNG has few number of test annotations
    //*BeforeSuite
    //*BeforeTest
    //*BeforeMethod
    //*test
    //*AfterMethod
    //*AfterTest
    //*AfterSuite

    @BeforeSuite
    public void beforeSuite()
    {
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
    }

    @Test
    public void test1()
    {
        driver.get("http://www.google.com");
    }

    @Test
    public void test2()
    {
        driver.get("http://www.bing.com");
    }

    @Test
    public void test3()
    {
        driver.get("http://www.flipkart.com");
    }

    @AfterSuite
    public void afterSuite()
    {
         driver.close();
    }
}
