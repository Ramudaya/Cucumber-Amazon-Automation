package Cucumber.Cucumber;



	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.text.CompactNumberFormat;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import javax.lang.model.element.Element;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.JavascriptException;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.Simple;
	
	public class baseclass {
		public static WebDriver driver;
		
		//Main content
		
		public static WebDriver getbrowser(String name) {

		
			try {
				if (name.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\drivers\\chromedriver.exe"));
				 driver = new ChromeDriver();
				}
				else if (name.equalsIgnoreCase("IE")) {
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+("\\drivers\\IEDriverServer.exe"));
					 driver = new InternetExplorerDriver();			
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			//return driver;	
			return driver;
		}
		//web element method 1
		public static void geturl(String link) {
			try {
				driver.get(link);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		public static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}

		//web element method 2
		public static void sendkey(WebElement element,String keyid) {
			element.sendKeys(keyid);
		}
		public static void threadsleep() throws Throwable {
			Thread.sleep(2000);
			
		}
			
			//web element method 3
		public static void click(WebElement element) {
			element.click();
		}
		//web element method 4
		public static void clear(WebElement element) {
			element.clear();	
		}
		//web element method 5
		public static void size(WebElement element) {
		element.getSize();	
		}
		//web element method 6
		public static void text(WebElement element) {
			element.getText();
		}
			//web element method 7
		public static void getattirb(WebElement element,String name) {
			element.getAttribute(name);
			
		}
		//web element method 8
		public static void slect(WebElement element) {
			element.isSelected();
			element.isDisplayed();
			element.isEnabled();	
		}
		//driver methods 1
		public static void navigate(String url) {
			driver.navigate().to(url);
		}
		//driver methods 2
		public static void back() {
			driver.navigate().back();	
		}
		//driver methods 3
			public static void foward() {
				driver.navigate().forward();		
		}
			//driver methods 4
			public static void refesh() {
				driver.navigate().refresh();
		}
			//driver methods 5
			public static void currenturl(String url) {
				driver.getCurrentUrl();
				driver.getTitle();
		}
			//driver methods 6
			public static void close() {
				driver.close();	
				driver.quit();
		}
			//alert
			public static void alert() {
			driver.switchTo().alert().dismiss();
			}
			
			public static void alertaccept() {
			driver.switchTo().alert().accept();
			
			}
				
			//robot
			public static void robo(WebElement press) throws Throwable {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
			}
			public static void robotrelease() throws Throwable {	
			Robot r = new Robot();
			r.keyRelease(KeyEvent.VK_DOWN);
			}
			public static void robotenter() throws Throwable {
			Robot r = new Robot();
		    r.keyPress(KeyEvent.VK_ENTER);	
			}
		
			//action
			public static void action(WebElement name,String value) {
				Actions ac =new Actions(driver);
				ac.moveToElement(name).perform();
				ac.contextClick(name).perform();
				ac.click().perform();
				ac.doubleClick(name);
				ac.dragAndDrop(name, name);	
			}
			//drop down box
			public static void drop(WebElement dropvalue) {
			dropvalue.click();
			Select s = new Select(dropvalue);
			s.selectByIndex(0);
			}
			public static void select(WebElement selectvalue,String value) {
			selectvalue.click();
			Select s1 = new Select(selectvalue);
			s1.selectByValue(value);	
			}
			public static void select1(WebElement droptext) {
			    droptext.click();
				Select s2 = new Select(droptext);
			s2.selectByVisibleText(null);	
			}
			//frames
			public static void frame(WebElement parent) {
				driver.switchTo().frame(parent);
				driver.switchTo().defaultContent();
			}
			//windows handling
			public static void window(WebElement value) {
				String getname = driver.getWindowHandle();
				driver.switchTo().window(getname).getTitle().equals(getname);
			}
			public static void windowhandles(WebElement getdata) {
				Set<String> alldata = driver.getWindowHandles();
				for (String data: alldata) {
				driver.switchTo().window(data).getTitle();	
			}
			}
				//screenshot
			public static void screenshot(WebElement screenshot) throws Throwable {
				TakesScreenshot ts = (TakesScreenshot)driver;
				File smsfile = ts.getScreenshotAs(OutputType.FILE);
				File decfile = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumproject\\screenshot\\ram.png");
				FileUtils.copyFile(smsfile, decfile);			
			}
			//scroll up down
			public static void scrollup(WebElement scrollup) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].ScrollIntoview();", scrollup);
			}
			// using pixel
			public static void name() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.ScrollBy(0,1000)");
			}
			public static void scrollyby() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.SrollBy(0,-1000)");
					
			}
			

				
			
				
			}
			

				
				
				
				
		
				
				
			
				
			
				
			
		
			
			
		
			
			
		
		
			
			
		
			
			

		
			
			
			
			
			
			
			
			
		
		
		





