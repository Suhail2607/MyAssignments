package week2day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Apple");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohamed");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Suhail");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mohamed");
		driver.findElement(By.name("departmentName")).sendKeys("Software tester engineer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I have good knowledge on Automation tools Selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mohamedsuhail2607@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle()); 
		
	}
}
