package clas_10_23;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Advance_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		driver.getTitle();
		String actualurl = "https://www.facebook.com/";
		String actualtitle = "Facebook - log in or sign up";
		String expectedurl = driver.getCurrentUrl();
		String expectedtitle = driver.getTitle();
		if(actualurl.equals(expectedurl) && actualtitle.equals(expectedtitle)){
		System.out.println("Your Url is Correct");
		System.out.println("Your title is Correct");
		}
		else {
		System.out.println("Your Url is not Correct");
		System.out.println("Your title is not Correct");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement createacc = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
		System.out.println(createacc.isDisplayed());
		createacc.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//input[@id = 'u_j_b_4u']")).sendKeys("hello@gmail.com");
		WebElement firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name = 'lastname']"));


		firstname.isDisplayed();
		firstname.sendKeys("Jobaid");
		lastname.sendKeys("Azim");
		//email
		WebElement emailormobile = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		emailormobile.sendKeys("945454546");
		//password
		WebElement password = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
		password.sendKeys("sai343@545");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//input[id='yesRadio']
		 WebElement gender = driver.findElement(By.xpath("//input[@=\"u_1_5_K7\"]"));
		 gender.click();
		 



		}

		}
driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		driver.getTitle();
		String actualurl = "https://www.facebook.com/";
		String actualtitle = "Facebook - log in or sign up";
		String expectedurl = driver.getCurrentUrl();
		String expectedtitle = driver.getTitle();
		if(actualurl.equals(expectedurl) && actualtitle.equals(expectedtitle)){
		System.out.println("Your Url is Correct");
		System.out.println("Your title is Correct");
		}
		else {
		System.out.println("Your Url is not Correct");
		System.out.println("Your title is not Correct");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement createacc = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
		System.out.println(createacc.isDisplayed());
		createacc.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//input[@id = 'u_j_b_4u']")).sendKeys("hello@gmail.com");
		WebElement firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name = 'lastname']"));


		firstname.isDisplayed();
		firstname.sendKeys("Jobaid");
		lastname.sendKeys("Azim");
		//email
		WebElement emailormobile = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		emailormobile.sendKeys("945454546");
		//password
		WebElement password = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
		password.sendKeys("sai343@545");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//input[id='yesRadio']
		 WebElement gender = driver.findElement(By.xpath("//input[@=\"u_1_5_K7\"]"));
		 gender.click();
		 



		}

		}


	}

}
