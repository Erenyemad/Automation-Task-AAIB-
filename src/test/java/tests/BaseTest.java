package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.RegisterPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    private ChromeDriver driver;
    RegisterPage registerPage;
    LoginPage loginPage;
    Properties prop;

    @BeforeClass
    public void setUp() throws IOException {
        prop = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//config//data.properties");
        prop.load(file);
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().clearResolutionCache().setup();
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        registerPage=new RegisterPage(driver);
        loginPage = new LoginPage(driver);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }


}
