package org.base;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class QAuto extends Base {

	@BeforeClass
	public static void beforeClass() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sundar\\eclipse-workspace\\sundar\\BaseClassCreation\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
}
	@AfterClass
	public static void afterClass() {
	driver.quit();
	}

	@Test
	public void test1() throws InterruptedException {
	Assert.assertTrue("Verify the URL",driver.getCurrentUrl().contains("demo"));

	WebElement fName = locXpath("//input[@placeholder='First Name']");
	type(fName,"Sundar");
	
	WebElement lName = locXpath("//input[@placeholder='Last Name']");
	type(lName,"vel");
	
	WebElement address = locXpath("//textarea[@ng-model='Adress']");
	type(address,"Chennai");
	
	WebElement email = locXpath("//input[@type='email']");
	type(email,"logansundar@gmail.com");
	
	WebElement phone = locXpath("//input[@type='tel']");
	type(phone,"7401074919");
	Assert.assertEquals("Verify the PhoneNumber Field","7401074919", phone.getAttribute("value"));
	
	WebElement gender = locXpath("((//input[@type='radio'])[1])");
	btnClick(gender);

	WebElement hobby = locXpath("//input[@value='Cricket']");
	btnClick(hobby);
	
	WebElement hobby1 = locXpath("//input[@value='Movies']");
	btnClick(hobby1);
	
/*	WebElement languages = locID("msdd");
	Select s = new Select(languages);
	boolean k1 = s.isMultiple();
	System.out.println("Drop Down Box is multiple:"+ k1);
	s.selectByIndex(0);
	s.selectByValue("Czech");
	s.selectByVisibleText("Hungarian");
	s.deselectByIndex(0);
*/		
	WebElement skills = locID("Skills");
	Select s1 = new Select(skills);
	boolean k = s1.isMultiple();
	System.out.println("Drop Down Box is multiple:"+ k);
	s1.selectByVisibleText("Android");
	s1.selectByIndex(7);
	s1.selectByValue("APIs");
	
	
	WebElement country = locID("countries");
	Select s2 = new Select(country);
	boolean k2 = s2.isMultiple();
	s2.selectByIndex(0);
	s2.selectByValue("Nepal");
	s2.selectByVisibleText("Myanmar");
	System.out.println("Drop Down Box is multiple:"+ k2);
	List<WebElement> countryOptions = s2.getOptions();
	for (WebElement x : countryOptions) {
		String county = x.getText();
		System.out.println("Country Options are as:");
		System.out.println(county);
	}
	
	WebElement countries = locXpath("//span[@aria-labelledby='select2-country-container']");
	Select s3 = new Select(countries);
	boolean k3 = s3.isMultiple();
	s2.selectByIndex(4);
		
	WebElement year = locID("yearbox");
	type(year,"1994");
	
	WebElement month = locXpath("//select[@placeholder='Month']");
	type(month,"July");
	
	WebElement day = locID("daybox");
	type(day,"2");
	
	WebElement password = locXpath("((//input[@type='password'])[1])");
	type(password,"logansundar");
	
	WebElement confirmPassword = locXpath("((//input[@type='password'])[2])");
	type(confirmPassword,"logansundar");
	
	Assert.assertEquals("Verfiy the Confirm password","logansundar",confirmPassword.getAttribute("value"));
	Thread.sleep(2000);
	
	WebElement btnSubmit = locID("submitbtn");
	btnClick(btnSubmit);
	
	Thread.sleep(3000);
	}
	
	
	@Before
	public void beforeMethod() {
	Date date = new Date();
	System.out.println(date);
		}
	@After
	public void afterMethod() {
		Date date = new Date();
		System.out.println(date);
			}
	}
