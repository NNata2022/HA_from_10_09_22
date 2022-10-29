package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class session10_15 {

	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		//int f =1;
		//int bg = 2;
		
		//if(f > bg); //true or false
		// write a java to find the gratest & smallest of 4 number
		
		//int a = 10;
		//int b = 20;
		//int c = 30;
		//int d = 40;
		
		//if(a>b && a>c && a>d)
		//	System.out.println("a is the gratest : " + a);//concatenarion
		//if(b > )
		
	//use the logic of if else and print the greatest and the smallest of the 4 number
	String Browser = "Chrome";
		String Browser1 = "FireFox";
		String Browser2 = "Edge";
		
	if(Browser.equals("Chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	}else if (Browser.equals("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		
	}else if (Browser.equals("Edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
	}else {
		
		System.out.println("None of the browser works");
	}

	}

}
