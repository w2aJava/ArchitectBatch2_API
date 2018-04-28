package architect.batch2.api.testCases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import architect.batch2.api.APIClasses.CreateUserAPI;
import architect.batch2.api.APIClasses.GetUserAPI;
import architect.batch2.api.TestUtils.DataProviderClass;
import architect.batch2.api.setup.RestAssuredSetUp;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class VerifyGetUserAPI extends RestAssuredSetUp {

	/*
	 * @Test(dataProviderClass = DataProviderClass.class, dataProvider = "dp")
	 * public void verifyGetUserAPI(Hashtable<String, String> data) {
	 * testLog.get().assignAuthor("Rahul");
	 * testLog.get().info("Verifying Get User API"); Response response =
	 * GetUserAPI.sendGetRequestWithValidData(data.get("endPoint")); JsonPath
	 * responseJson = response.jsonPath();
	 * System.out.println(responseJson.get("per_page"));
	 * System.out.println(response.jsonPath().get("total"));
	 * System.out.println(responseJson.get("data.name"));
	 * System.out.println(response.asString());
	 * Assert.assertEquals(Integer.toString(response.statusCode()),
	 * getExpStatusCode(data.get("expectedStatusCode"))); //
	 * assertStatusCode(statusCode, expectedStatusCode); //
	 * Assert.assertEquals(Integer.toString(response.getStatusCode()), //
	 * data.get("expectedStatusCode"));
	 * 
	 * }
	 */
	@Test(dataProviderClass = DataProviderClass.class, dataProvider = "dp")
	public void verifyCreateUserAPI(Hashtable<String, String> data) {
		Response response = CreateUserAPI.sendPostRequestToCreateUserWithValidData(data.get("endPoint"),
				data.get("inputBody"));
		System.out.println(response.asString());
	}

}
