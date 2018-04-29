package architect.batch2.api.TestUtils;

import java.io.IOException;
import java.util.Arrays;

import org.omg.IOP.ExceptionDetailMessage;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import architect.batch2.api.setup.TestSetUp;

public class CustomeListerners extends TestSetUp implements ITestListener, ISuiteListener {

	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		
		
		
		String failureLogg="This Test case got Failed";
		Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
		testLog.get().log(Status.FAIL, m);
		
		
	}

	public void onTestSkipped(ITestResult arg0) {
		String methodName=arg0.getMethod().getMethodName();
		String logText="<b>"+"Test Case:- "+ methodName+ " Skipped"+"</b>";		
		Markup m=MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		testLog.get().skip(m);
		//extent.flush();
		
	}

	public void onTestStart(ITestResult arg0) {
		
		String methodName=arg0.getMethod().getMethodName();
		
		
		System.out.println(methodName.split(".").length);
		
		ExtentTest child = parentTest.get().createNode(methodName);
		testLog.set(child);
		//testCaseLogger.get().log(Status.INFO, "Starting execution of Test Case:- "+methodName);
		testLog.get().info("<b>"+"Starting execution of Test Case:- "+methodName+ "</b>");
	}

	public void onTestSuccess(ITestResult arg0) {
		
		String methodName=arg0.getMethod().getMethodName();
		String logText="<b>"+"Test Case:- "+ methodName+ " Passed"+"</b>";		
		Markup m=MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		testLog.get().pass(m);
		
	}
	}


