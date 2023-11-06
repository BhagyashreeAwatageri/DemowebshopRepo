package genericUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ITestListenerUtility extends BaseClass implements ITestListener{
	ExtentReports report;
	ExtentTest logger;
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ExtentSparkReporter reporter = new ExtentSparkReporter("./report/screenshotReport1.html");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setDocumentTitle("Demo Extent Report");
		reporter.config().setReportName("Bhagya Report");
		
	 report = new ExtentReports();
		report.attachReporter(reporter);

	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 logger = report.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		logger.log(Status.PASS, "The test" +result.getName()+" is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		logger.log(Status.FAIL, "The test" +result.getName()+" is failed");
		logger.addScreenCaptureFromPath(screenshot.capturingScreenshot(result.getName()));
	}

	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		report.flush();
	}
   
	
}
