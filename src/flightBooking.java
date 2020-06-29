import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flightBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Present Project Directory : "+ System.getProperty("user.dir"));
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10461551\\Desktop\\Selenium\\chromedriver.exe");  
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get("https://www.phptravels.net/home");
        driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]")).click();
        driver.findElement(By.xpath("//*[@class='form-icon-left flightclass']")).click();
        driver.findElement(By.xpath("//*[@class='chosen-results']//li[text()='Business']")).click();
       // driver.findElement(By.xpath("(//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active']//div[@class='select2-search']//input[@type='text' and @class='select2-input'])[2]")).sendKeys("PNQ");
       // driver.findElement(By.xpath("//*[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active' and @id='select2-drop']")).click();
       // driver.findElement(By.xpath("//*[@id='select2-drop']//*[@class='select2-search']")).click();
       // driver.findElement(By.xpath("(//input[@type='text' and @class='select2-input'])[6]")).sendKeys("PNQ");
        driver.findElement(By.xpath("(//*[@class='btn btn-white bootstrap-touchspin-up '])[3]")).click();
        driver.findElement(By.xpath("(//*[@class='btn btn-white bootstrap-touchspin-up '])[4]")).click();
        driver.findElement(By.xpath("(//*[@class='btn btn-white bootstrap-touchspin-up '])[5]")).click();
        driver.findElement(By.xpath("//*[@class='col-xs-12 col-md-12']//button[contains(text(),'Search')]")).click();
      //  driver.findElement(By.xpath("(//*[@class='select2-search']//input[@class='select2-input'])[6]")).sendKeys("PNQ");
        
        
        
	}

}
