package architect.batch2.api.setup;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class RestAssuredSetUp extends TestSetUp{
	
	
	@BeforeSuite
	public void configure()
	{
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api";
	}

}
