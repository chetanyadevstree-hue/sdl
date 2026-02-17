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

		String today = driver.findElement(AppiumBy.accessibilityId("Today")).getText();
		System.out.println("First Filter: " + today);
		if (today.contains("Today")) {
			driver.findElement(AppiumBy.accessibilityId("Today")).click();
		}
		String tommorow = driver.findElement(AppiumBy.accessibilityId("Tomorrow")).getText();
		System.out.println("Second Filter: " + tommorow);
		String Overdue = driver.findElement(AppiumBy.accessibilityId("Overdue")).getText();
		System.out.println("Third Filter: " + Overdue);
		String All = driver.findElement(AppiumBy.accessibilityId("All")).getText();
		System.out.println("Fifth Filter: " + All);
		driver.findElement(AppiumBy.accessibilityId("All")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == 'View Case'`][2]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Property Valuation\"`]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(AppiumBy.accessibilityId("ic_Back")).click();
		Thread.sleep(2000);

		driver.runAppInBackground(Duration.ofSeconds(4));

		// To Run Application in background we will be using so what it will do it will
		// minimize the application and reopen it agian

		for (int i = 0; i < 3; i++) {
			driver.findElement(AppiumBy.accessibilityId("All")).click();

			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == '4'`][2]")).click();
			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Property Valuation\"`]"))
					.click();

//			if ()

			//
			//

			//
			// driver.findElement(AppiumBy.accessibilityId("ic_Back")).click();
			// driver.findElement(AppiumBy.accessibilityId("All")).click();
			// driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name
			// == '4'`][2]")).click();
			// driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name
			// == \"Property Valuation\"`]"))
			// .click();
			// driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name ==
			// \"View Case\"`][1]")).click();

			WebElement Details = driver.findElement(AppiumBy.accessibilityId("Details"));

			if (Details.equals(Details)) {
				Details.click();
			} else {
				driver.findElement(AppiumBy.accessibilityId("ic_Back")).click();

			}

		}

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