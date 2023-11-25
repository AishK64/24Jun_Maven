package LibraryFiles;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass 
{
  public WebDriver driver;
  
  public void initializeBrowser()
  {
	  WebDriver driver = new EdgeDriver();
      
      driver.manage().window().maximize();
      driver.get("https://www.saucedemo.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
     
  }
}
