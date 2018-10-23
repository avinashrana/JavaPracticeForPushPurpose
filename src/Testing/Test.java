package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions act;

	public static void main(String[] args) throws InterruptedException {
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		
		
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		driver = new ChromeDriver(option);
		js = (JavascriptExecutor) driver;
		act = new Actions(driver);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println(option.getVersion());
		System.out.println(option.getBrowserName());
		//System.out.println(option.getPlatform());
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension d = new Dimension(-2000, 0);
		Point p = new Point(-2000, 0);
		
		driver.manage().window().setSize(d);
		
		//driver.manage().window().setPosition(p);


		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		
		highlightElement(driver.findElement(By.id("txtUsername")));
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		highlightElement(driver.findElement(By.id("txtPassword")));
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		highlightElement(driver.findElement(By.id("btnLogin")));
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);

		try {
			js.executeScript("alert('Welcome Avinash Rana');");
			Thread.sleep(2000);
		} catch (Exception e) {
			driver.quit();
			e.printStackTrace();
		}

		driver.quit();
		
		


	}

	public static void highlightElement(WebElement element) {
		if (element.isDisplayed()) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
					element);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");

		}
	}

}
