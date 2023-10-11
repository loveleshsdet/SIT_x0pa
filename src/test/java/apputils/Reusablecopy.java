package apputils;

	import java.io.File;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.cucumber.messages.internal.com.google.protobuf.Duration;


	public class Reusablecopy {
	 public static WebDriver driver;
	
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
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		    driver.manage().deleteAllCookies();
		    driver.manage().window().maximize();
		    driver.navigate().to(url);
		   
	      }
//		public void open_link(String browser,String url) throws InterruptedException 
//		   {
//			if(browser.equalsIgnoreCase("chrome"))
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			driver=new ChromeDriver();
//		    driver.manage().deleteAllCookies();
//		    driver.manage().window().maximize();
//		    driver.navigate().to(url);
//		   
//	      }
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

	}


