import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
import java.net.URL;

public class AppiumAndroidTest {
 
    WebDriver driver;
 
    @BeforeClass
    public void setUp() {
        
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //Set up desired capabilities

        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION", "6.0");
        capabilities.setCapability("deviceName","Anil69");
        capabilities.setCapability("platformName","Android");
 
        // set uppa ckage name of app )
        capabilities.setCapability("appPackage", "com.android.Astro");
 
        // Launcher activity of app
        capabilities.setCapability("appActivity","com.android.****");
 
        //Create RemoteWebDriverand connect to the Appium server
        
        driver = new RemoteWebDriver(new URL("http://Play.goole.com/store/apps/details?id-com.astro.astroview"), capabilities);
    }
 
    @Test
    public void astroLogin(){

      driver.findElement(By.id(" login ")).click();
      // locaator values will be idetified by using UI automator.

      driver.findElement(By.id(" Login ID ")).SendKeys(" user name ");
      driver.findElement(By.id(" Password ")).SendKeys(" pwd ");
      driver.findElement(By.id(" Login Button ")).Click();
 
   // Login successfull
    
     driver.findElement(By.id(" Must Watch Tab ")).Click();

     String str=driver.findElement(By.id("Value")).getText();
   // Get text 

      int count=str.length();
  // get character count
  
     system.out.print("no of characters :" +count);
  
           
    }
 
    @AfterClass
    public void close(){
        //close the app
        driver.quit();
    }
}

// not able to register because it is asking for valid NIRC