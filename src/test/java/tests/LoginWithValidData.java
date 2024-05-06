package tests;

import org.testng.annotations.Test;

public class LoginWithValidData extends BaseTest{
    @Test
    public void loginWithValidData(){

        loginPage.clickOnLoginButton();
        loginPage.enterEmail(prop.getProperty("Email"));
        loginPage.enterPassword(prop.getProperty("password"));
        loginPage.clickOnSubmitLogin();

    }



}
