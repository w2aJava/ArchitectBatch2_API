package architect.batch2.api.APIClasses;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class GetUserAPI {
	
	
	
	public static  Response  sendGetRequestWithValidData(String endPoint)
	{
		Response response=given().contentType(ContentType.JSON).when().get(endPoint).then().extract().response();
		return response;
		
	}
	
	

}
