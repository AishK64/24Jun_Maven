package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
         
    //POM class 1
public class SwagLabLoginPage
{
   //step 1:declarion global variable with private Access specifier using findby annotation
	
	@FindBy(xpath ="//input[@id='user-name']")  private  WebElement UN;   //private webelement UN = driver.findelemen(by.xpath("));
	@FindBy(xpath ="//input[@id='password']")  private  WebElement PWD;
	@FindBy(xpath ="//input[@id='login-button']") private  WebElement Loginbtn;
	  
	//step2:Initialization
	
	public  SwagLabLoginPage(WebDriver driver)
	  {
		
		PageFactory.initElements(driver, this);  //classname.methodname(webdriverObject,thisKeyword);
	  }
	
	//step3:useges
	public void inpSwagLabLoginPageUN(String username)
	{
		UN.sendKeys(username);
	}
	public void inpSwagLabLoginPagePWD(String password)
	{
		PWD.sendKeys(password);
	}
	public void clickSwagLabLoginPageloginbtn()
	{
		Loginbtn.click();
	}
}
