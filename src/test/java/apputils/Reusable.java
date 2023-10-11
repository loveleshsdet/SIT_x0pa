package apputils;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v106.emulation.Emulation;
import org.openqa.selenium.devtools.v106.emulation.model.DisplayFeature;
import org.openqa.selenium.devtools.v106.emulation.model.ScreenOrientation;
import org.openqa.selenium.devtools.v106.page.model.Viewport;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import config.PropertiesFile;
import io.cucumber.messages.internal.com.google.protobuf.Duration;
import pageElements.AssessmentCreationE;



public class Reusable {
	
	
public static String browser;

// public static WebDriver driver;
 public static ChromeDriver driver;
 public List<WebElement> pl;
	
	public void click(WebElement element)
	{
		element.click();
	}
	public void sendKeys(WebElement element ,String keyword) 
	{
		element.clear();
		element.sendKeys(keyword);
	}
	public void cleartxt(WebElement element) 
	{
		element.clear();
	}
	public String getText(WebElement element)
	{
	return element.getText();
	}
	public String getAttributeValue(WebElement element,String attribute)
	{
		return element.getAttribute(attribute);
	}
	public boolean isElementPresent(WebElement element)
	{
    return element.isDisplayed();
	}
	public void pickupbysendKeys(WebElement element ,String keyword) throws InterruptedException
	{
		element.sendKeys(keyword);
		Thread.sleep(1000);
		element.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		element.sendKeys(Keys.ENTER);
	}
	public void open_link(String url) throws InterruptedException 
	{
		PropertiesFile.readPropertiesFile();
		if(browser.contains("chrome"))
		{
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("use-fake-ui-for-media-stream");
		driver=new ChromeDriver(options);
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.navigate().to(url);
		}
		if(browser.contains("headless"))
		{
		        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("headless");
//	 			options.addArguments("disable-gpu");     
				options.addArguments("window-size=1920,1080");
				driver=new ChromeDriver(options);
				driver.navigate().to(url);
		}
		if(browser.contains("mobile"))
		{
			  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			  driver=new ChromeDriver();
			  DevTools devTools=driver.getDevTools();
			  devTools.createSession();
			devTools.send(Emulation.setDeviceMetricsOverride(360,740,9, true,Optional.<Number>empty(),  Optional.<Integer> empty(), Optional.<Integer> empty(), Optional.<Integer> empty(), 
		            Optional.<Integer> empty(), Optional.<Boolean> empty(), Optional.<ScreenOrientation> empty(), 
		            Optional.<Viewport> empty(), Optional.<DisplayFeature> empty()));
			driver.navigate().to(url);
      
		}
		
	   
      }
//	public void open_link(String browser,String url) throws InterruptedException 
//	   {
//		if(browser.equalsIgnoreCase("chrome"))
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver=new ChromeDriver();
//	    driver.manage().deleteAllCookies();
//	    driver.manage().window().maximize();
//	    driver.navigate().to(url);
//	   
//      }
	public void selectbyvisibletext(WebElement element ,String keyword) throws InterruptedException
	{
		Select select=new Select(element);
 		select.selectByVisibleText(keyword);
	}	
	public void selectbyvalue(WebElement element ,String keyword) throws InterruptedException
	{
		Select select=new Select(element);
 		select.selectByValue(keyword);
	}	
	
	public void uploadfile(String keyword)
	{
		WebElement uploadfile=driver.findElement(By.xpath("//input[@type='file']"));
		String absolutepath=new File(keyword).getAbsolutePath();
		uploadfile.sendKeys(absolutepath);
	}
	public void upload(WebElement element,String keyword)
	{
		WebElement uploadfile=element;
		String absolutepath=new File(keyword).getAbsolutePath();
		uploadfile.sendKeys(absolutepath);
	}
	public void scrolltoelement(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void move(WebElement element)
	{
		 Actions act=new Actions(driver);
		 act.moveToElement(element).perform();
	}
	public void scrollintoview(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
	}
	public void jseclick(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	public void assertEquals(WebElement element,String string)
	{
		 String act_text=element.getText();
	        Assert.assertEquals(string,act_text);
	}
	public void switchToChildWindow()
	{
		Set<String> ids=driver.getWindowHandles();
		java.util.Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
	}
	public void switchToParentWindow()
	{
		Set<String> ids=driver.getWindowHandles();
		java.util.Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(parentid);
	}
	public void waituntilpageloads()
	{
		pl=	driver.findElements(By.xpath("//label[@id='loading-id-1']"));
		int count=0;
		while(pl.size()!=0&&count<10)
		{
			count++;
			break;
		}
	
	}
	
	
	public void dragAndDrop(WebElement source,WebElement target)
	{
		 WebElement a =source;
	     WebElement b =target;
	//
	     int x = b.getLocation().x;
	     int y = b.getLocation().y;

	     Actions actions = new Actions(driver);
	     actions.moveToElement(a)
	             .clickAndHold(a)
	             .moveByOffset(x,50)
	             .moveToElement(b)
	             .moveByOffset(x,50)
	             .release().perform();
	
	}
//	public boolean isDisplayed(WebElement element) {
//        try {
//            return element.isDisplayed();
//        } catch (NoSuchElementException e) {
//            return false;
//        }
//    }
	public void isDisplayed(WebElement element) {
		if(element.isDisplayed())
		{
			System.out.println("Test Pass");
		}else
		{
			System.out.println("Test Fail");
		}
	}
	public void isNotDisplayed(WebElement element) throws InterruptedException {
		Thread.sleep(2000);
		if(element.isDisplayed()==false)
		{
			System.out.println("Test Pass");
		}else
		{
			System.out.println("Test Fail");
		}
	}
	public static String convertiondates(String inputpattern ,String outputpattern ,String givendate) throws ParseException
	{
		SimpleDateFormat inputformat=new SimpleDateFormat(inputpattern);
		SimpleDateFormat outputformat=new SimpleDateFormat(outputpattern);
		Date date=null;
		String requiredDate=null;
		date=inputformat.parse(givendate);
		requiredDate=outputformat.format(date);
		return requiredDate;

	}
	public void nocandidatesmsg() {
		AssessmentCreationE ac=new AssessmentCreationE(driver);
		String no_ques_available=ac.get_no_ques_msg.getText();
		Assert.assertEquals(no_ques_available,"There are no candidates added to this assessment.");	
	}

}
