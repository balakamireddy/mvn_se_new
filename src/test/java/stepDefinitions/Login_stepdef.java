package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_stepdef {
    WebDriver driver;
    @Given("User Navigate to website")
    public void user_navigate_to_website() {
        System.setProperty("webdriver.chrome.driver", "D:\\Bala\\QA\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://www.saucedemo.com/");
    }

    @When("User enter {string} and {string}")
    public void LoginSuccess(String username, String password) {
        WebElement logo = this.driver.findElement(By.className("login_logo"));
        WebDriverWait wait = new WebDriverWait(this.driver, 30L);
        wait.until(ExpectedConditions.visibilityOf(logo));
        WebElement username_field = this.driver.findElement(By.id("user-name"));
        username_field.sendKeys(new CharSequence[]{username});
        WebElement password_field = this.driver.findElement(By.xpath("//div[@id='login_button_container']/div/form/div[2]/input"));
        password_field.sendKeys(new CharSequence[]{password});
        WebElement loginbutton = this.driver.findElement(By.name("login-button"));
        loginbutton.click();

    }

    @Then("User login successfully")
    public void Productspage() {
        WebElement ProductsLogo = this.driver.findElement(By.className("app_logo"));
        WebDriverWait wait = new WebDriverWait(this.driver, 30L);
        wait.until(ExpectedConditions.visibilityOf(ProductsLogo));

    }
}
