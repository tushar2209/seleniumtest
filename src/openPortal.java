import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10461551\\Desktop\\Selenium\\chromedriver.exe"); 
	    WebDriver driver1=new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.manage().deleteAllCookies();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver1.get("https://sta-qa2.capita-software.co.uk/publicaccessqa2/selfservice/dashboard.htm");
        driver1.findElement(By.xpath("//a[contains(text(),' Sign In ')]")).click();
        driver1.findElement(By.xpath("//input[@id='username-input']")).sendKeys("SCH85756@dispostable.com");
        driver1.findElement(By.xpath("//input[@id='password-input']")).sendKeys("Testing@123");
        driver1.findElement(By.xpath("//input[@type='submit' and @value='Sign in']")).click();
        driver1.findElement(By.xpath("(//a[@onclick='loader(this)'])[1]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver1; 
        js.executeScript("window.scrollBy(0,1000)");
        driver1.findElement(By.xpath("(//a[@data-parent='#my_activity--accordion'])[2]")).click();
       // driver1.findElement(By.xpath("//a[contains(text(),'Early opening application ')]")).click();
	}

}
