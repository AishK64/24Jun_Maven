package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
    //POM class 3
public class SwagLabMenuPage 
{
	
	@FindBy(xpath="//a[text()='Logout']") private WebElement logout;
	
	 public SwagLabMenuPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	
	 public void clickSwagLabMenuPageLogoutbtn()
	 {
		 logout.click();
	 }
}
