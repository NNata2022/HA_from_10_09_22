package clas_10_23;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Facebook {
public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//driver.getTitle();
		//driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		//https://www.facebook.com/
		//Facebook - log in or sign up
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String Actualtitle = "Facebook - log in or sign up";
		String Actualurl = "https://www.facebook.com/";
		String Expectedtitle = driver.getTitle();
		String Expectedurl = driver.getCurrentUrl();
		
		if(Actualurl.equals(Expectedurl) && Actualtitle.equals(Expectedtitle)) {
			
			System.out.println("My url is correct");
			System.out.println("My title is correct");
			
		}
		else {
			System.out.println("My url is Not correct");
			System.out.println("My title is Not correct");
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement createaccount = driver.findElement(By.xpath("//a[@class = '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		//createaccount.click();
		if(createaccount.isDisplayed() && createaccount.isEnabled()) {
			System.out.println("Create account button displayed");
			System.out.println("Create account button enabled");
			createaccount.click();
			
		}
		else {
			System.out.println("Create account button not displayed");
			System.out.println("Create account button not enabled");
			
		}
		// create account and put info about user
		
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		firstname.sendKeys("Nata");
		lastname.sendKeys("Ukraine");
		
		
		WebElement emailmobile = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		emailmobile.sendKeys("nata@gmail.com");
		WebElement resendemailmobile = driver.findElement(By.xpath("//*[@name ='reg_email_confirmation__']"));
		resendemailmobile.sendKeys("nata@gmail.com");
		
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement newpassword = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
		newpassword.sendKeys("NN159357");
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]/option[4]"));
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]/option[4]"));
		month.click();
		day.click();
		
		
		
		
		
		
		
	
		
  
	}

}
