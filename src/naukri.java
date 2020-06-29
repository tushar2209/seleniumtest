import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class naukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10461551\\Desktop\\Selenium\\chromedriver.exe");  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
	    WebDriver driver=new ChromeDriver(options);
	    driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.get("https://www.naukri.com/nlogin/login");
	    driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("tmehan2209@gmail.com");
	    driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("12qw12qw");
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	    Actions actions = new Actions(driver);
	    actions.moveToElement(driver.findElement(By.xpath("//*[@class='mTxt' and text()='My Naukri']"))).build().perform();
	    driver.findElement(By.xpath("//a[@title='Edit Profile']")).click();
	    driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\P10461551\\Desktop\\Personal Docs\\Tushar Mehan.doc");
	    actions.moveToElement(driver.findElement(By.xpath("//*[@class='mTxt' and text()='My Naukri']"))).build().perform();
	    driver.findElement(By.xpath("//a[@title='Logout']")).click();
	    Thread.sleep(5000);
	    
	     driver.navigate().to("https://www.naukri.com/nlogin/login");
	   //  options.addArguments("--disable-popup-blocking");
	   // driver.findElement(By.xpath("//*[@class='mTxt' and text()='Login']")).click();
	    //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://www.googletagmanager.com/ns.html?id=GTM-NX744H']")));
	    driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("tusharmeh2@gmail.com");
	    driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("12qw12qw");
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	    Actions actions1 = new Actions(driver);
	    actions1.moveToElement(driver.findElement(By.xpath("//*[@class='mTxt' and text()='My Naukri']"))).build().perform();
	    driver.findElement(By.xpath("//a[@title='Edit Profile']")).click();
	    driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\P10461551\\Desktop\\Personal Docs\\Tushar Mehan.doc");
	    actions1.moveToElement(driver.findElement(By.xpath("//*[@class='mTxt' and text()='My Naukri']"))).build().perform();
	    driver.findElement(By.xpath("//a[@title='Logout']")).click();
	    Thread.sleep(5000);
	    
	    driver.navigate().to("https://www.naukri.com/nlogin/login");
	  //  options.addArguments("--disable-popup-blocking");
	  //  driver.findElement(By.xpath("//*[@class='mTxt' and text()='Login']")).click();
	    driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("mehan.nalin@gmail.com");
	    driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("nalin2209");
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	    Actions actions2 = new Actions(driver);
	    actions2.moveToElement(driver.findElement(By.xpath("//*[@class='mTxt' and text()='My Naukri']"))).build().perform();
	    driver.findElement(By.xpath("//a[@title='Edit Profile']")).click();
	    driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\P10461551\\Desktop\\Personal Docs\\Nalin Mehan.doc");
	    actions2.moveToElement(driver.findElement(By.xpath("//*[@class='mTxt' and text()='My Naukri']"))).build().perform();
	    driver.findElement(By.xpath("//a[@title='Logout']")).click();
	    Thread.sleep(5000);
	    
	       driver.navigate().to("https://www.naukri.com/nlogin/login");
		  //  options.addArguments("--disable-popup-blocking");
		  //  driver.findElement(By.xpath("//*[@class='mTxt' and text()='Login']")).click();
		    driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("nalinmehan@gmail.com");
		    driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("chintu2209");
		    driver.findElement(By.xpath("//button[text()='Login']")).click();
		    Actions actions3 = new Actions(driver);
		    actions3.moveToElement(driver.findElement(By.xpath("//*[@class='mTxt' and text()='My Naukri']"))).build().perform();
		    driver.findElement(By.xpath("//a[@title='Edit Profile']")).click();
		    driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\P10461551\\Desktop\\Personal Docs\\Nalin Mehan.doc");
		    Thread.sleep(5000);
		    driver.quit();
	}
	

}
