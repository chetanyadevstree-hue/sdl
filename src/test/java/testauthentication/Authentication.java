package testauthentication;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.AppiumBy;

public class Authentication extends Base {

	public WebDriverWait wait;

	@Test
	public void login() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Login")).click();
		String today = driver.findElement(AppiumBy.accessibilityId("Today")).getText();
		System.out.println("First Filter: " + today);
		String tommorow = driver.findElement(AppiumBy.accessibilityId("Tomorrow")).getText();
		System.out.println("Second Filter: " + tommorow);
		String Overdue = driver.findElement(AppiumBy.accessibilityId("Overdue")).getText();
		System.out.println("Third Filter: " + Overdue);
		String All = driver.findElement(AppiumBy.accessibilityId("All")).getText();
		System.out.println("Fifth Filter: " + All);
		
		System.out.println("All Filters Name Are Verified");
		System.out.println("------------------------------");
		
		
		
		
		
		WebElement all_count =driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"81\"`]"));
		String all_count1 = all_count.getText();
		
		//**/XCUIElementTypeStaticText[`name == "All"`]
		
		////XCUIElementTypeStaticText[@name="All"]
		int k = Integer.parseInt(all_count1); //Convert String to int through this function
		
		if( k >= 0)
		{
			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == 'All'`]")).click();
			driver.findElement(AppiumBy.accessibilityId("View Case")).click();
		}
		else {
			driver.findElement(AppiumBy.accessibilityId("Tomorrow")).click();
		}
		Thread.sleep(2000);
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Property Valuation\"`]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Details")).click();
		//System.out.println("Will Start with verifying all questions");
		String General = driver.findElement(AppiumBy.accessibilityId("Questions")).getText();
		System.out.println("First Element Under Details is" + " " +General);
		System.out.println("******************************");
		WebElement address_question = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Address\"`][1]"));
		System.out.println(	address_question.getText());
		System.out.println("******************************");
		String address = driver.findElement(AppiumBy.accessibilityId("Is the address correct?")).getText();
		System.out.print(address);
		WebElement Address_click = driver.findElement(AppiumBy.accessibilityId("Yes"));
		String address_Correct = Address_click.getText();
		System.out.println(" : " +  address_Correct);
		driver.findElement(AppiumBy.accessibilityId("Yes")).click();
		System.out.println("                                      ");
		WebElement house_flatname = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name =='House/Flat Name'`]"));
		System.out.print( house_flatname.getText());
		WebElement house = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[1]"));
		System.out.println(" : " + house.getText());
		
		System.out.println("                                      ");
		
		WebElement road = driver.findElement(AppiumBy.accessibilityId("Road Number"));
		System.out.print( road.getText());
		WebElement road_name = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[2]"));
		System.out.println(" : " + road_name.getText());
		System.out.println("                                      ");
		
		WebElement roadname = driver.findElement(AppiumBy.accessibilityId("Road Name"));
		System.out.print(roadname.getText());
		WebElement road_Name = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[3]"));
		System.out.println(" : " + road_Name.getText());
		System.out.println("                                      ");
		roadname.click();
		Thread.sleep(1000);
		
		WebElement area = driver.findElement(AppiumBy.accessibilityId("Area"));
		System.out.print(area.getText());
		WebElement area_text = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[4]"));
		System.out.println(" : " + area_text.getText());
		System.out.println("                                      ");
		
		WebElement town  = driver.findElement(AppiumBy.accessibilityId("Town"));
		System.out.print(town.getText());
		WebElement town_name = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[5]"));
		System.out.println(" : " + town_name.getText());
		town.click();
		System.out.println("                                      ");
		
		
		WebElement country = driver.findElement(AppiumBy.accessibilityId("County"));
		System.out.print(country.getText());
		WebElement country_name = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[6]"));
		System.out.println("                                      ");
		
		WebElement Postcode = driver.findElement(AppiumBy.accessibilityId("Postcode"));
		System.out.print(Postcode);
		Postcode.click();
		WebElement PostCode_name =  driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[7]"));
		System.out.println(" : " + PostCode_name.getText());
		System.out.println("                                      ");
		
		
		
		
		
		
		
		
												 //**/XCUIElementTypeStaticText[`name == "House/Flat Name"`]
		
		//driver.runAppInBackground(Duration.ofSeconds(4)); 
		//This is not required now since it will be used when app needs to run in background
		// To Run Application in background we will be using so what it will do it will
		// minimize the application and reopen it agian
		//
		// driver.findElement(AppiumBy.accessibilityId("ic_Back")).click();
		// driver.findElement(AppiumBy.accessibilityId("All")).click();
		// driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name
		// == '4'`][2]")).click();
		// driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name
		// == \"Property Valuation\"`]"))
		// .click();
		// driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name ==
		// "View Case\"`][1]")).click();

			

			

		

		// Trying to go back since the details are not getting loaded

		// String all = driver.findElement(AppiumBy.accessibilityId("All")).getText();
		// System.out.println("Again Filter: " + all);
		// driver.findElement(AppiumBy.accessibilityId("All")).click();
		// driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name ==
		// 'View Case'`][2]")).click();
		// driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name
		// == '4'`][2]")).click();
		// driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name
		// == \"Property Valuation\"`]"))
		// .click();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// WebElement details = driver.findElement(AppiumBy.accessibilityId("Details"));
		// wait.until(ExpectedConditions.elementToBeClickable(details));details.click();
		// WebElement Question1 =
		// driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name
		// == \"Is the address correct?\"`][1]"));
		// System.out.println(Question1.getText());
	}

}

//public void extra () {

//driver.findElement(AppiumBy.accessibilityId("Login")).click();
// wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
// wait.until(ExpectedConditions
// .visibilityOf(driver.findElement(AppiumBy.accessibilityId("Login with your
// email address"))));
// WebElement login_modal = driver.findElement(AppiumBy.accessibilityId("Login
// with your email address"));
// System.out.println(login_modal.getText());
// driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value
// == 'Email Address'`]")).sendKeys("test@mail.com");
// driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSecureTextField[`value
// =='Password'`]"))
// .sendKeys("1234");
// driver.findElement(
// AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == 'Login with your
// social account'`]")).click();
// Thread.sleep(3000);

// wait.until(ExpectedConditions.alertIsPresent());
// Alert alert = driver.switchTo().alert();
// alert.accept();}