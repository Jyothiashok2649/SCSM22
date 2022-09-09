package Com.Actitime.Generic;

import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenar implements ITestListener{

	private TakesScreenshot driver;

	@Override
	public void onTestStart(ITestResult result) {
 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File desc=new File("./screenshot/ss.png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
		
		 	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		 
	}

	@Override
	public void onStart(ITestContext context) {
		 
	}

	@Override
	public void onFinish(ITestContext context) {
		 	}

	@Override
	public int hashCode() {
		 	}

	@Override
	public boolean equals(Object obj) {
		 	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		 	}

	@Override
	public String toString() {
		 	}

	@Override
	protected void finalize() throws Throwable {
		 	}

}
