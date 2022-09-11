package ActPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
     @FindBy(xpath = "//input[@id='username']")private WebElement un;
     @FindBy(xpath = "//input[@name='pwd']")private WebElement pwd;
     @FindBy(xpath = "//div[text()='Login ']")private WebElement login;
     
     public Pom1(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     
     public void enterUN(String username) {
    	un.sendKeys(username); 
     }
     public void enterPWD(String password) {
    	 pwd.sendKeys(password);
     }
     public void clicklogin() {
    	 login.click();
     }
     
}
