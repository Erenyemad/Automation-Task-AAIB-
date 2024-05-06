package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    private WebDriver driver;
    private final By registerButton = By.xpath("//a[@class='ico-register']");
    private final By radioButtonFemale=By.id("gender-female");
    private final By firstNameInput=By.id("FirstName");
    private final By lastNameInput=By.id("LastName");
    private  final By companyName=By.id("Company");
    private final By selectDay=By.name("DateOfBirthDay");
    private final By selectMonth=By.name("DateOfBirthMonth");
    private final By selectYear=By.name("DateOfBirthYear");
    private final By emailInput=By.id("Email");
    private final By passwordInput=By.id("Password");
    private final By confirmPasswordInput=By.id("ConfirmPassword");
    private final By registerSubmit=By.id("register-button");
    private final By signOutButton=By.xpath("//a[@href='logout']");
    private final By confirmMessage=By.xpath("//div[@class='result']");

    public String getMessage(){

        return driver.findElement(confirmMessage).getText();
    }


    public RegisterPage(WebDriver driver) {
        this.driver=driver;
    }



    public void clickOnRegisterButton(){
        driver.findElement(registerButton).click();

    }
    public  void selectGender(){
        driver.findElement(radioButtonFemale).click();
    }
    public void enterFirstName(String firstName){
        driver.findElement(firstNameInput).sendKeys(firstName);

    }
    public void enterLastName(String lastName){
        driver.findElement(lastNameInput).sendKeys(lastName);

    }

    public void selectBDayOfBirth() {
        WebElement element =driver.findElement(By.name("DateOfBirthDay"));
        Select day = new Select(element);
        day.selectByIndex(3);

    }
    public void selectBMonthOfBirth() {
        WebElement element =driver.findElement(By.name("DateOfBirthMonth"));
        Select month = new Select(element);
        month.selectByIndex(1);
    }
    public void selectYearOfBirth()  {
        WebElement element =driver.findElement(By.name("DateOfBirthYear"));
        Select year =new Select(element);
        year.selectByIndex(3);
    }

    public void enterEmail()  {
      String email =new Faker().internet().emailAddress();
        driver.findElement(emailInput).sendKeys(email);

    }
    public void enterCompanyName(String company_name){
        driver.findElement(companyName).sendKeys(company_name);

    }

    public void enterPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);

    }
    public void enterConfirmPassword(String confirmPassword){
        driver.findElement(confirmPasswordInput).sendKeys(confirmPassword);

    }
    public void clickOnSubmitButton()  {
        driver.findElement(registerSubmit).click();

    }

   public void clickOnSignOutButton(){
        driver.findElement(signOutButton).click();

   }
}





