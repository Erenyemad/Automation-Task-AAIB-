package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    private final By loginButton=By.xpath("//a[@href='/login?returnUrl=%2F']");
    private final By emailInput = By.id("Email");
    private final By passwordInput = By.id("Password");
    private final By loginSubmit=By.xpath("//button[@class='button-1 login-button']");
    private final By errorMessage=By.xpath("//div[@class='message-error validation-summary-errors']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getErrorMessage(){

        return driver.findElement(errorMessage).getText();
    }

    public void enterEmail(String email){
        driver.findElement(emailInput).sendKeys(email);

    }
    public void enterPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);

    }
    public void clickOnSubmitLogin()  {
        driver.findElement(loginSubmit).click();



    }
    public void clickOnLoginButton(){
        driver.findElement(loginButton).click();

    }

}


