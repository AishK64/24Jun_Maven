package Module1_Login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_Login.SwagLabHomepage;
import Module1_Login.SwagLabLoginPage;
import Module1_Login.SwagLabMenuPage;

public class SwagLabLoginTest extends BaseClass
{
	
	SwagLabLoginPage login;
    SwagLabHomepage   home;
	SwagLabMenuPage  menu;
	int TCID;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		
    	initializeBrowser(); 
          login = new SwagLabLoginPage(driver);
          home = new SwagLabHomepage(driver);
          menu = new SwagLabMenuPage(driver);

       
	}
   @BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
	  
		login.inpSwagLabLoginPageUN(UtilityClass.GetTD(0, 0));
	    Thread.sleep(1000);
		
	    login.inpSwagLabLoginPagePWD(UtilityClass.GetTD(0, 1));
	    Thread.sleep(2000);
	    login.clickSwagLabLoginPageloginbtn();
	    Thread.sleep(2000);
	}
	
	@Test
	public void VerifyTitle() throws EncryptedDocumentException, IOException
	{
		TCID=101;
      String actTitle = home.getSwagLabHomepageTitle();
      String expTitle =UtilityClass.GetTD(0, 1);
      Assert.assertEquals(actTitle, expTitle,"Failed:Both result are different");

	}
	
	@AfterMethod
	public void logoutFromApp(ITestResult a1) throws InterruptedException, IOException
	{
		
		if(a1.getStatus()==ITestResult.FAILURE)
		{
			//code to captutre SS
			UtilityClass.CaptureSS(driver, TCID);
		}
		home.clickSwagLabHomepageMenubtn();
		Thread.sleep(2000);
		menu.clickSwagLabMenuPageLogoutbtn();
		Thread.sleep(1000);
		}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}
}
