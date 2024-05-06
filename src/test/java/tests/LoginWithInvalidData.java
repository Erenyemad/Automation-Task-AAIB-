package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginWithInvalidData extends BaseTest{
    @Test
    public void loginWithInValidData(){

        loginPage.clickOnLoginButton();
        loginPage.enterEmail(prop.getProperty("WrongEmail"));
        loginPage.enterPassword(prop.getProperty("WrongPassword"));
        loginPage.clickOnSubmitLogin();
        String ExpectedResult = loginPage.getErrorMessage();
        Assert.assertEquals(ExpectedResult,"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");

    }
}
