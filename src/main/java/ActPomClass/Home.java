package ActPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
        @FindBy(xpath = "//span[text()='Me']")private WebElement uid;
        
        
        public Home(WebDriver driver) {
        	PageFactory.initElements(driver, this);
        }
        
        public String verifyUID() {
        	String actID = uid.getText();
        	return actID;
        	
        }


}
