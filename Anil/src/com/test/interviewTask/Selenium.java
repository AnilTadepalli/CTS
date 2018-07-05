package com.astro.my;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Assignment1 {

	public void initialise(WebDriver driver){
	driver=new FirefoxDriver();
	String link ="www.astro.com.my";
	driver.get(link);
		
	}
	
	public void waitForLoad() {
     // open browser press f12, in the console type document.ReadyState it returns Complete.
	//it is a javascript command to know page loaded or not.
	ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>()
	 {    
                  public Boolean apply(WebDriver driver) 
                  {
	          return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
		                    }
		                };
	// a
		      if((new WebDriverWait(driver, 0.1).until(PageLoadCondition))==false){
		        	        	
		        	//Takesscreenshot is a java class - screenshot code
		        	TakesScreenshot scrShot=((TakesScreenshot)driver);
		        	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		        	File DestFile=new File(fileWithPath);
		        	FileUtils.copyFile(SrcFile, DestFile);
		        	Syso("page failed to load in 0.1 sec, refer screenshot saved in ___");
		        }
		// b      
		        if ((new WebDriverWait(driver, 5).until(PageLoadCondition))==true)){
		           System.out.println("page loaded in 5 sec");	
		        }
	}
	
	// point d -dont know - but tell them i will take any footer element like company logo or any element in the footer contact us etc
	// to check this scenario.
	// e
	public void verifyAllURLs(String link){
		List<WebElement> pagelinks=driver.findElements(By.tagName("a"));
				
		for(WebElement eachlink:pagelinks){
			String url=eachlink.getAttribute("href");
			new URL(url);
			
			HttpURLConnection  hc=( HttpURLConnection)url.openConnection();
			hc.connect();
	//f.
			if(hc.getResponseCode()==200){

				syso(link+"----"+hc.getResponseMessage());// capturing message - OK
				syso(link+"----"+hc.getConnectTimeout()());// capturing timeout
				   }
				if(hc.getResponseCode()==HTTTPURLConnection.HTTP_NOT_FOUND)
				syso(link+"---"+hc.getResponseMessage())
				syso(link+"----"+hc.getConnectTimeout()());
				}


		}
			
	//----level 2-----
	
	// point 2
	public void checkProductflipkart(WebDriver driver){
		
		driver.get("flipkart.com");
		if(driver.getTitle().toString().equalsIgnoreCase("Flipkart")){
			
			WebElement search=driver.findElement(By.xpath("xpath for search bar/element"));
	     	search.sendKeys("iphone7");
	     	driver.findElement(By.id("searchbutton")).click();
	     
	     	// check results found or not, if found we can see text like - showing 1 of 24 results else it will
	     	// show No results found etc;
	       	WebElement resultsText=driver.findElement(By.xpath("xpath for below string element");  	
	     	
	       	if(resultsText.toString().contains("Showing 1 – 24 of 93 results for iphone")){
	     		//print in the console
	     		System.out.println("results found for iphone");
	    // or use testng asssert statement to validate
	     		
	     	}else{
	     		System.out.println("No results found ");
	     	}
	     	// copy paste same logic for any other website
	    // using webtable to read the iphone price, write separately for filpkart and snapdeal
	       	//used later
	       	List<String> savepricelist= new ArrayList<String>();
	       // target table	
	       	WebElement table=driver.findElement("//*td[@id='iphone']/tbody");
	       	//find no of rows
	       	List<WebElement>rows=table.findElements(By.tagName("tr"));
	       	// iterate no.of rows
	       	for (WebElement eachrow: rows){
	       	// find out how many cols available in the table
	       		List<WebElement>cols=eachrow.findElements(By.tagName("td"));
	       		// iterate each col in each row
	       		for (WebElement eachcell: cols){
	       			
	       			 if(eachcell.getText().contains("iphone7".trim()){
	       				// just tell them 
	       				WebElement modelname=//xpath for modelname
	       			    WebElement linktoproduct=//write xpath for share button link
	       				    			    
	       			    WebElement price=driver.findElement("price xpath");
	       			    savepricelist.add(price.getText().toString());
	       			    // adding all elements into array list
	       			    break;
	       			}
	       		}
	       		// by default sorts in asending order
	       		Collections.sort(savepricelist);
	       		System.out.println(savepricelit);
	       		// it prints the elements in ascending order 
	   // similarly you can write for 2nd site & print in ascending order
	      		
	       		
	       	}
	       	
		}
		
	}
	
}
