package week2day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Samsung");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohamed");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Suhail");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mohamed");
		driver.findElement(By.name("departmentName")).sendKeys("Software tester engineer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I have good knowledge on Automation tools Selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mohamedsuhail2607@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Bmw");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Superman");
		driver.findElement(By.className("smallSubmit")).click();
		String t= driver.getTitle();
		System.out.println(t);
		
        
	}

}
