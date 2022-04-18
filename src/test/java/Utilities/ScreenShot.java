package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
public static void CaptureSS(WebDriver driver, String name) throws IOException {
	
	TakesScreenshot tss =(TakesScreenshot) driver;

	File Source =tss.getScreenshotAs(OutputType.FILE);

	File Desctination = new File ("C:\\Users\\ADMIN\\eclipse-workspace\\Velocity_Maven\\ScreenShotSS\\" + name + ".jpg");

	// Step 5  now call the FileHalndler class
	FileHandler.copy (Source, Desctination);  // it will copy the file and store it in given location

	// Step 6
	System.out.println("ScreenShot captured");

}
}
