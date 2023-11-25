package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
       //POM class 2
public class SwagLabHomepage
{
     //step1
	//WebDriver driver1;
	    WebDriver driver;
       @FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menu;
       
       //step2
    public   SwagLabHomepage(WebDriver driver)
    {
    	//driver1=driver;           //global var = local var --->assign local variable info into global variable
    	this.driver=driver ; //global variable=local variable  
    	PageFactory.initElements(driver, this);
    }
    
  /*  public void verifySwagLabHomepageTitle (String expTitle)
    {
    	String actTitle=driver.getTitle();
    	
    	if(actTitle.equals(expTitle))
    	{
    		System.out.println("Pass");
    	}
    	else
    	{
		   System.out.println("Fail");	
		}
    }*/
    public String getSwagLabHomepageTitle()
    {
    	String actTitle = driver.getTitle();
		return actTitle;
    	
    }
       
    //step3
        public void clickSwagLabHomepageMenubtn()
        {
        	menu.click();
        }
}
