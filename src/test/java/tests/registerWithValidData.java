package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class registerWithValidData extends BaseTest {
    @Test
    public void verifyRegisterWithValidData(){
     registerPage.clickOnRegisterButton();
     registerPage.selectGender();
     registerPage.enterFirstName(prop.getProperty("FirstName"));
     registerPage.enterLastName(prop.getProperty("LastName"));
     registerPage.selectBDayOfBirth();
     registerPage.selectBMonthOfBirth();
     registerPage.selectYearOfBirth();
     registerPage.enterEmail();
     registerPage.enterCompanyName(prop.getProperty("companyName"));
     registerPage.enterPassword(prop.getProperty("password"));
     registerPage.enterConfirmPassword(prop.getProperty("confirmPassword"));
     registerPage.clickOnSubmitButton();
     String ExpectedResult = registerPage.getMessage();
     Assert.assertEquals(ExpectedResult,"Your registration completed");
    }

    public void signOut(){
        registerPage.clickOnSignOutButton();
    }

}
