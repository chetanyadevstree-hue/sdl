package base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class Base {

	public IOSDriver driver;

	@BeforeMethod

	public void initialize() throws MalformedURLException, URISyntaxException, InterruptedException {

		XCUITestOptions option = new XCUITestOptions();
		option.setNoReset(true);

		option.setDeviceName("iPad Pro 13-inch (M5)");

		option.setPlatformVersion("26.4");

		String appdata = "/Users/apple/Library/Developer/Xcode/DerivedData/HomeWorth-awkajvfkxieniegtjtjztxokvtwk/Build/Products/Debug-iphonesimulator/HomeWorth.app";

		File app = new File(appdata);
		if (app.exists()) {
			option.setApp(app.getAbsolutePath());
			// Absolute path is the complete address
			// relative path is a kind of half address
			// a full path starts with root or we can say /

		} else {
			option.setBundleId("com.yourcompany.HomeWorth");
		}

		option.setWdaLaunchTimeout(Duration.ofSeconds(1000));
		

		driver = new IOSDriver(new URI("http://127.0.0.1:4723").toURL(), option);
		driver.rotate(ScreenOrientation.LANDSCAPE);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		Thread.sleep(2000);
	//	driver.switchTo().alert().accept();
	}

	// @AfterMethod
	// public void clean_up() {
	// driver.quit();
	// }
}
