import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class openCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10461551\\Desktop\\Selenium\\chromedriver.exe"); 
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("incognito");
	        options.addArguments("--disable-extensions");
	       // options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
	        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	        @SuppressWarnings("deprecation")
			WebDriver driver=new ChromeDriver(capabilities);
	        driver.manage().window().maximize();
	        //driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	        driver.get("https://sta-qa2.capita-software.co.uk/LocalWelfareAssistance/Home/Redirector/Index/?id=140f3fd9-db4f-4609-91c9-3efed3da56ed&mod=SA");
	        Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='MReturnUrl']")));
	        dropdown.selectByVisibleText("Contact Manager");
	        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("tmehan");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Testing@1234");
			driver.findElement(By.xpath("//input[@type='submit' and @class='btn-submit']")).click();
			driver.findElement(By.xpath("//input[@type='text' and @id='MainContent_caseRef']")).sendKeys("SCH85756");
			driver.findElement(By.xpath("//input[@type='submit' and @id='MainContent_searchButton']")).click();
			//driver.findElement(By.xpath("//a[contains(text(),'Create New Form')]")).click();
	}

}
