import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class openSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System Property for Chrome Driver   
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\P10461551\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver2.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver2.manage().deleteAllCookies();
		driver2.get("https://sta-qa2.capita-software.co.uk/LocalWelfareAssistance/Home/Redirector/Index/?id=140f3fd9-db4f-4609-91c9-3efed3da56ed&mod=SA");
		driver2.findElement(By.xpath("//input[@id='UserName']")).sendKeys("tmehan");
		driver2.findElement(By.xpath("//input[@id='Password']")).sendKeys("Testing@1234");
		driver2.findElement(By.xpath("//input[@type='submit' and @class='btn-submit']")).click();
		//driver2.findElement(By.xpath("//a//span[contains(text(),'Scheduled Jobs')]")).click();
       // Select dropdown=new Select(driver2.findElement(By.xpath("//select[@id='JobTypes_SelectedValue']")));
       // dropdown.selectByVisibleText("Process export to STA");
        //dropdown.selectByValue("65");
        
       //driver.quit();
	}

}
