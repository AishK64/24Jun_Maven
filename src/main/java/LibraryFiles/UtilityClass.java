package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	//method with return type
	
    public static String GetTD(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
    {
    	//FileInputStream file = new FileInputStream("D:\\TestingClass\\24jun.xlsx");
    	FileInputStream file = new FileInputStream("D:\\TestingClass\\24jun.xlsx");

    	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
   	
   	    String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
    
   	    return value;
   	    
    
    }
    
    
    public static void CaptureSS(WebDriver driver,int TCID) throws IOException
    {
    	File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      //  File dest=new File("C:\\Users\\User\\eclipse-workspace\\24_jun_selenium_pgm\\FailedTCesSS\\TestCaseID"+TCID+".jpg");
         File dest=new File(System.getProperty("user.dir")+"\\FailedTCesSS\\TestCaseID"+TCID+".jpg");

    	FileHandler.copy(Src, dest);
    }
    public static String getDataFromPF(String key) throws IOException
    {
    	FileInputStream file=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\24_jun_selenium_pgm\\src\\PropertyFile.properties");
    	Properties p = new Properties();
    	p.load(file);
    	
    	String Value =p.getProperty(key);
    	return Value;
    	
    	
    }

}
