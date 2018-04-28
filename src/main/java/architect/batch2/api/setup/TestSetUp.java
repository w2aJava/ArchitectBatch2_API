package architect.batch2.api.setup;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import architect.batch2.api.TestUtils.ExcelReader;
import architect.batch2.api.TestUtils.ExtentManager;

public class TestSetUp {
	
	private static String inputJsonFileLocation;
	protected ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\simple.xlsx");

	protected static Properties config = new Properties();
	private static String workingDir;
	public static ExtentReports extent;
	public static ThreadLocal<ExtentTest> parentTest = new ThreadLocal<ExtentTest>();
	public static ThreadLocal<ExtentTest> testLog = new ThreadLocal<ExtentTest>();

	public Map<String, ExtentTest> map = new HashMap<String, ExtentTest>();

	@BeforeSuite
	public void setUp() {
		
		extent = ExtentManager.GetExtent();

	}

	@BeforeClass
	public synchronized void beforeClass() {
		String className=getClass().getName();
		className=className.substring(className.lastIndexOf(".")+1);
		ExtentTest parent = extent.createTest(className);
		parentTest.set(parent);


	}


	@BeforeMethod
	public synchronized void beforeMethod(Method method) {
		
		/*ExtentTest child = parentTest.get().createNode(method.getName());
		testLog.set(child);
		//testLog.get().log(Status.INFO, "Execution of "+method.getName()+" started");
*/		
		

	}

	@AfterMethod
	public synchronized void afterMethod() {
		
		

		extent.flush();
	}

	@AfterSuite
	public void tearDown() {

	}
	
	public void assertStatusCode(int statusCode, String expectedStatusCode)
	{
		String expectedcode=expectedStatusCode.split(".")[0];
		Assert.assertEquals(Integer.toString(statusCode), expectedcode);
		
	}
	public String getExpStatusCode(String expectedCode)
	{
		System.out.println("expCode: "+expectedCode);
		return expectedCode.substring(0,expectedCode.indexOf('.'));
		
	}

	

}
